package edu.matriculas;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String codigo;
    private String nombre;
    private int capacidad;
    private final List<Curso> prerrequisitos=new ArrayList<>();
    public Curso(String codigo,String nombre,int capacidad){this.codigo=codigo;this.nombre=nombre;this.capacidad=capacidad;}
    public String getCodigo(){return codigo;}
    public String getNombre(){return nombre;}
    public int getCapacidad(){return capacidad;}
    public boolean tieneCupo(){return capacidad>0;}
    public void reducirCupo(){if(capacidad>0)capacidad--;}
    public void aumentarCupo(){capacidad++;}
    public void agregarPrerrequisito(Curso curso){if(curso!=null&&curso!=this&&!prerrequisitos.contains(curso))prerrequisitos.add(curso);}
    public List<Curso> getPrerrequisitos(){return new ArrayList<>(prerrequisitos);}
}
