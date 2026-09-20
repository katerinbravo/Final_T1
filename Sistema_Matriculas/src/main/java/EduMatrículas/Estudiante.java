public class EstudianteJava extends Persona {

    private final String codigo;

    public EstudianteJava(
            String nombre,
            String identificacion,
            String correo,
            String codigo) {

        super(nombre, identificacion, correo);

        if (codigo == null || codigo.isBlank()) {
            throw new IllegalArgumentException(
                "El código del estudiante es obligatorio."
            );
        }

        this.codigo = codigo.trim();
    }

    public String getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return "EstudianteJava{" +
                "nombre='" + getNombre() + '\'' +
                ", identificacion='" + getIdentificacion() + '\'' +
                ", correo='" + getCorreo() + '\'' +
                ", codigo='" + codigo + '\'' +
                '}';
    }
}