package edu.matriculas;

public class Estudiante extends Persona {
    private String codigo;
    public Estudiante(String nombre,String identificacion,String correo,String codigo){super(nombre,identificacion,correo);this.codigo=codigo;}
    public String getCodigo(){return codigo;}
    @Override public String toString(){return codigo+" - "+getNombre();}
}
