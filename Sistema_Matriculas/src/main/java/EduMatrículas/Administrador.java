package edu.matriculas;

public class Administrador extends Persona {

    private final String usuario;

    public Administrador(
            String nombre,
            String identificacion,
            String correo,
            String usuario) {

        super(nombre, identificacion, correo);

        if (usuario == null || usuario.isBlank()) {
            throw new IllegalArgumentException(
                "El usuario es obligatorio."
            );
        }

        this.usuario = usuario.trim();
    }

    public String getUsuario() {
        return usuario;
    }

    public String toString() {
        return getNombre() +
                "Administrador{" +
                usuario +
                " - " +
                "}";
    }

    private String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
