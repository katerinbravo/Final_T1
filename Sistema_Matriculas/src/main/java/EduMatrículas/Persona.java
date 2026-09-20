
public class Persona {

    private String nombre;
    private String identificacion;
    private String correo;

    public Persona(String nombre, String identificacion, String correo) {
        setNombre(nombre);
        setIdentificacion(identificacion);
        setCorreo(correo);
    }

    public String getNombre() {
        return nombre;
    }

    public final void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre es obligatorio.");
        }
        this.nombre = nombre.trim();
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public final void setIdentificacion(String identificacion) {
        if (identificacion == null || identificacion.isBlank()) {
            throw new IllegalArgumentException("La identificación es obligatoria.");
        }
        this.identificacion = identificacion.trim();
    }

    public String getCorreo() {
        return correo;
    }

    public final void setCorreo(String correo) {
        if (correo == null || correo.isBlank()) {
            throw new IllegalArgumentException("El correo es obligatorio.");
        }
        this.correo = correo.trim();
    }
}