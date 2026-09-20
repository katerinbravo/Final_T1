/**
 * Excepción general del sistema de matrículas.
 * Reemplaza:
 * 5. MatriculaDuplicadaException
 * 6. EntidadNoEncontradaException
 * 7. CupoAgotadoException
 */
public class ExcepcionMatriculas extends Exception {

    public ExcepcionMatriculas(String mensaje) {
        super(mensaje);
    }
}