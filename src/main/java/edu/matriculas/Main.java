package edu.matriculas;

public class Main {
    public static void main(String[] args) {
        SistemaMatriculas sistema = new SistemaMatriculas();
        Estudiante estudiante = new Estudiante("Ana Perez", "0101", "ana@correo.com", "EST-001");
        Curso curso = new Curso("POO-01", "Programación Orientada a Objetos", 1);

        sistema.registrarEstudiante(estudiante);
        sistema.registrarCurso(curso);

        Matricula matricula = new Matricula(estudiante, curso);
        matricula.inscribir(estudiante);
        matricula.inscribir(estudiante, "Primera matrícula");

        sistema.procesarMatricula(matricula);
        sistema.procesarMatricula(new Matricula(estudiante, curso));

        System.out.println("Total de matrículas: " + sistema.getMatriculas().size());
    }
}
