package edu.matriculas;

public class Matricula {
    private Estudiante estudiante;
    private Curso curso;
    private String estado;
    private String observacion;
    public Matricula(Estudiante estudiante,Curso curso){this.estudiante=estudiante;this.curso=curso;this.estado="ACTIVA";}
    public void inscribir(Estudiante estudiante){this.estudiante=estudiante;}
    public void inscribir(Estudiante estudiante,String observacion){this.estudiante=estudiante;this.observacion=observacion;}
    public void cancelar(){this.estado="CANCELADA";}
    public Estudiante getEstudiante(){return estudiante;}
    public Curso getCurso(){return curso;}
    public String getEstado(){return estado;}
    public String getObservacion(){return observacion;}
}
