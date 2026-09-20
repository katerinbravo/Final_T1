package edu.matriculas;

public class Administrador extends Persona {
    private String usuario;
    public Administrador(String nombre,String identificacion,String correo,String usuario){super(nombre,identificacion,correo);this.usuario=usuario;}
    public String getUsuario(){return usuario;}
}
