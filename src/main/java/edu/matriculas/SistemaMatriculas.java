package edu.matriculas;

import java.util.ArrayList;
import java.util.List;

public class SistemaMatriculas {
    private final List<Estudiante> estudiantes=new ArrayList<>();
    private final List<Curso> cursos=new ArrayList<>();
    private final List<Matricula> matriculas=new ArrayList<>();
    public void registrarEstudiante(Estudiante e){estudiantes.add(e);}
    public void registrarCurso(Curso c){cursos.add(c);}
    public void registrarMatricula(Matricula m)throws MatriculaDuplicadaException{
        for(Matricula actual:matriculas){
            if(actual.getEstudiante().getCodigo().equals(m.getEstudiante().getCodigo())&&actual.getCurso().getCodigo().equals(m.getCurso().getCodigo())&&"ACTIVA".equals(actual.getEstado()))
                throw new MatriculaDuplicadaException("La matrícula ya existe.");
        }
        matriculas.add(m);
    }
    public void procesarMatricula(Matricula m){
        try{registrarMatricula(m);System.out.println("Matrícula registrada.");}
        catch(MatriculaDuplicadaException e){System.out.println(e.getMessage());}
        finally{System.out.println("Proceso de matrícula finalizado.");}
    }
    public List<Matricula> getMatriculas(){return new ArrayList<>(matriculas);}
}
