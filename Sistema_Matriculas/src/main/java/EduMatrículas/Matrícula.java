package edu.matriculas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Matricula {

    private EstudianteJava estudiante;
    private final Curso curso;
    private final LocalDate fecha;
    private String estado;
    private String observacion;

    public Matricula(EstudianteJava estudiante, Curso curso) {

        if (estudiante == null || curso == null) {
            throw new IllegalArgumentException(
                    "Estudiante y curso son obligatorios."
            );
        }

        this.estudiante = estudiante;
        this.curso = curso;
        this.fecha = LocalDate.now();
        this.estado = "ACTIVA";
        this.observacion = "";
    }

    // SOBRECARGA 1
    public void inscribir(EstudianteJava estudiante) {

        validarEstudiante(estudiante);

        this.estudiante = estudiante;
    }

    // SOBRECARGA 2
    public void inscribir(
            EstudianteJava estudiante,
            String observacion) {

        validarEstudiante(estudiante);

        this.estudiante = estudiante;

        if (observacion == null) {
            this.observacion = "";
        } else {
            this.observacion = observacion.trim();
        }
    }

    private void validarEstudiante(EstudianteJava estudiante) {

        if (estudiante == null) {
            throw new IllegalArgumentException(
                    "El estudiante no puede ser nulo."
            );
        }
    }

    public void cancelar() {

        if ("CANCELADA".equals(estado)) {
            throw new IllegalStateException(
                    "La matrícula ya está cancelada."
            );
        }

        estado = "CANCELADA";
    }

    public EstudianteJava getEstudiante() {
        return estudiante;
    }

    public Curso getCurso() {
        return curso;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getFechaFormateada() {

        DateTimeFormatter formato =
                DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return fecha.format(formato);
    }

    public String getEstado() {
        return estado;
    }

    public String getObservacion() {
        return observacion;
    }

    @Override
    public String toString() {

        return estudiante.getCodigo()
                + " | "
                + estudiante.getNombre()
                + " | "
                + curso.getCodigo()
                + " - "
                + curso.getNombre()
                + " | "
                + getFechaFormateada()
                + " | "
                + estado;
    }
}