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

        if (estudiante == null) {
            throw new IllegalArgumentException(
                    "El estudiante es obligatorio."
            );
        }

        if (curso == null) {
            throw new IllegalArgumentException(
                    "El curso es obligatorio."
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

        if (estudiante == null) {
            throw new IllegalArgumentException(
                    "El estudiante no puede ser nulo."
            );
        }

        this.estudiante = estudiante;
    }

    // SOBRECARGA 2
    public void inscribir(
            EstudianteJava estudiante,
            String observacion) {

        if (estudiante == null) {
            throw new IllegalArgumentException(
                    "El estudiante no puede ser nulo."
            );
        }

        this.estudiante = estudiante;

        if (observacion == null) {
            this.observacion = "";
        } else {
            this.observacion = observacion.trim();
        }
    }

    public void cancelar() {

        if ("CANCELADA".equals(this.estado)) {
            throw new IllegalStateException(
                    "La matrícula ya está cancelada."
            );
        }

        this.estado = "CANCELADA";
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