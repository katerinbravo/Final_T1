package edu.matriculas;

public abstract class Persona {
    private String nombre;
    private String identificacion;
    private String correo;
    public Persona(String nombre, String identificacion, String correo) { this.nombre=nombre; this.identificacion=identificacion; this.correo=correo; }
    public String getNombre(){return nombre;}
    public String getIdentificacion(){return identificacion;}
    public String getCorreo(){return correo;}
    public void setCorreo(String correo){this.correo=correo;}
}
