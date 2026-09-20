package EduMatrículas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Curso {

    private final String codigo;
    private String nombre;
    private int capacidad;

    private final List<Curso> prerrequisitos = new ArrayList<>();

    public Curso(String codigo, String nombre, int capacidad) {

        if (codigo == null || codigo.isBlank()) {
            throw new IllegalArgumentException(
                    "El código del curso es obligatorio."
            );
        }

        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException(
                    "El nombre del curso es obligatorio."
            );
        }

        if (capacidad < 0) {
            throw new IllegalArgumentException(
                    "La capacidad no puede ser negativa."
            );
        }

        this.codigo = codigo.trim();
        this.nombre = nombre.trim();
        this.capacidad = capacidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {

        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException(
                    "El nombre del curso es obligatorio."
            );
        }

        this.nombre = nombre.trim();
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad, int matriculadosActuales) {

        if (capacidad < 0) {
            throw new IllegalArgumentException(
                    "La capacidad no puede ser negativa."
            );
        }

        if (capacidad < matriculadosActuales) {
            throw new IllegalArgumentException(
                    "La nueva capacidad no puede ser menor "
                    + "que los estudiantes matriculados."
            );
        }

        this.capacidad = capacidad;
    }

    public boolean tieneCupo() {
        return capacidad > 0;
    }

    public void reducirCupo() {

        if (capacidad <= 0) {
            throw new IllegalStateException(
                    "El curso no tiene cupos disponibles."
            );
        }

        capacidad--;
    }

    public void aumentarCupo() {
        capacidad++;
    }

    public void agregarPrerrequisito(Curso curso) {

        if (curso == null) {
            throw new IllegalArgumentException(
                    "El prerrequisito no puede ser nulo."
            );
        }

        if (curso == this) {
            throw new IllegalArgumentException(
                    "Un curso no puede ser prerrequisito de sí mismo."
            );
        }

        if (!prerrequisitos.contains(curso)) {
            prerrequisitos.add(curso);
        }
    }

    public List<Curso> getPrerrequisitos() {
        return Collections.unmodifiableList(prerrequisitos);
    }

    @Override
    public String toString() {

        return "Curso{" +
                codigo +
                " - " +
                nombre +
                " | cupos disponibles: " +
                capacidad +
                "}";
    }
}