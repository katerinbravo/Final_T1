package edu.matriculas;

import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Scanner SC =
            new Scanner(System.in);

    private static final SistemaMatriculas SISTEMA =
            new SistemaMatriculas();

    public static void main(String[] args) {

        cargarDatosDemo();

        int opcion;

        do {

            mostrarMenu();

            opcion =
                    leerEntero(
                        "Seleccione una opción: "
                    );

            try {

                ejecutarOpcion(opcion);

            } catch (Exception e) {

                System.out.println(
                    "ERROR CONTROLADO: " +
                    e.getMessage()
                );
            }

        } while (opcion != 0);

        System.out.println(
            "Programa finalizado."
        );
    }

    private static void mostrarMenu() {

        System.out.println();
        System.out.println(
            "=============================================="
        );

        System.out.println(
            " SISTEMA DE GESTIÓN DE MATRÍCULAS ACADÉMICAS"
        );

        System.out.println(
            "=============================================="
        );

        System.out.println(
            "1. Registrar estudiante"
        );

        System.out.println(
            "2. Listar estudiantes"
        );

        System.out.println(
            "3. Registrar curso"
        );

        System.out.println(
            "4. Listar cursos disponibles"
        );

        System.out.println(
            "5. Matricular estudiante"
        );

        System.out.println(
            "6. Consultar matrículas"
        );

        System.out.println(
            "7. Cancelar matrícula"
        );

        System.out.println(
            "8. Buscar estudiante"
        );

        System.out.println(
            "9. Buscar curso"
        );

        System.out.println(
            "10. Resumen de cursos"
        );

        System.out.println(
            "11. Demostración POO"
        );

        System.out.println(
            "12. Verificar consistencia"
        );

        System.out.println(
            "0. Salir"
        );
    }

    private static void ejecutarOpcion(
            int opcion)
            throws Exception {

        switch (opcion) {

            case 1 ->
                registrarEstudiante();

            case 2 ->
                SISTEMA.listarEstudiantes()
                       .forEach(
                           System.out::println
                       );

            case 3 ->
                registrarCurso();

            case 4 ->
                SISTEMA.listarCursosDisponibles()
                       .forEach(
                           System.out::println
                       );

            case 5 ->
                matricular();

            case 6 ->
                consultarMatriculas();

            case 7 ->
                cancelarMatricula();

            case 8 ->
                consultarEstudiante();

            case 9 ->
                buscarCurso();

            case 10 ->
                System.out.println(
                    SISTEMA.resumenCursos()
                );

            case 11 ->
                demostracionPOO();

            case 12 ->
                System.out.println(
                    "Consistencia: " +
                    (
                        SISTEMA.verificarConsistencia()
                        ? "OK"
                        : "ERROR"
                    )
                );

            case 0 -> {
            }

            default ->
                System.out.println(
                    "Opción no válida."
                );
        }
    }

    private static void registrarEstudiante() {

        String nombre =
                leer("Nombre: ");

        String identificacion =
                leer("Identificación: ");

        String correo =
                leer("Correo: ");

        String codigo =
                leer("Código del estudiante: ");

        SISTEMA.registrarEstudiante(
            new Estudiante(
                nombre,
                identificacion,
                correo,
                codigo
            )
        );

        System.out.println(
            "Estudiante registrado correctamente."
        );
    }

    private static void registrarCurso() {

        String codigo =
                leer("Código del curso: ");

        String nombre =
                leer("Nombre del curso: ");

        int capacidad =
                leerEntero("Capacidad: ");

        SISTEMA.registrarCurso(
            new Curso(
                codigo,
                nombre,
                capacidad
            )
        );

        System.out.println(
            "Curso registrado correctamente."
        );
    }

    private static void matricular()
            throws Exception {

        String estudiante =
                leer(
                    "Código del estudiante: "
                );

        String curso =
                leer(
                    "Código del curso: "
                );

        Matricula matricula =
                SISTEMA.matricular(
                    estudiante,
                    curso
                );

        System.out.println(
            "MATRÍCULA REGISTRADA:"
        );

        System.out.println(
            matricula
        );
    }

    private static void consultarMatriculas() {

        String codigo =
                leer(
                    "Código del estudiante: "
                );

        List<Matricula> lista =
                SISTEMA
                .consultarMatriculasDeEstudiante(
                    codigo
                );

        if (lista.isEmpty()) {

            System.out.println(
                "No tiene matrículas activas."
            );

        } else {

            lista.forEach(
                System.out::println
            );
        }
    }

    private static void cancelarMatricula()
            throws Exception {

        String estudiante =
                leer(
                    "Código del estudiante: "
                );

        String curso =
                leer(
                    "Código del curso: "
                );

        SISTEMA.cancelarMatricula(
            estudiante,
            curso
        );

        System.out.println(
            "Matrícula cancelada."
        );

        System.out.println(
            "El cupo fue devuelto."
        );
    }

    private static void consultarEstudiante()
            throws Exception {

        String codigo =
                leer("Código: ");

        System.out.println(
            SISTEMA
            .datosCompletosEstudiante(
                codigo
            )
        );
    }

    private static void buscarCurso() {

        String nombre =
                leer(
                    "Nombre o parte del nombre: "
                );

        List<Curso> resultado =
                SISTEMA.buscarCursosPorNombre(
                    nombre
                );

        if (resultado.isEmpty()) {

            System.out.println(
                "No se encontraron cursos."
            );

        } else {

            resultado.forEach(
                System.out::println
            );
        }
    }

    private static void demostracionPOO() {

        try {

            Estudiante estudiante =
                    SISTEMA.consultarEstudiante(
                        "EST-001"
                    );

            Curso curso =
                    SISTEMA.consultarCurso(
                        "POO-01"
                    );

            System.out.println();
            System.out.println(
                "--- SOBRECARGA DE MÉTODOS ---"
            );

            Matricula prueba =
                    new Matricula(
                        estudiante,
                        curso
                    );

            prueba.inscribir(
                estudiante
            );

            System.out.println(
                "inscribir(Estudiante): ejecutado."
            );

            prueba.inscribir(
                estudiante,
                "Demostración de sobrecarga"
            );

            System.out.println(
                "inscribir(Estudiante, String): ejecutado."
            );

            System.out.println(
                "Observación: " +
                prueba.getObservacion()
            );

            System.out.println();
            System.out.println(
                "--- ARRAYLIST Y EXCEPCIONES ---"
            );

            try {

                SISTEMA.matricular(
                    "EST-001",
                    "POO-01"
                );

            } catch (Exception e) {

                System.out.println(
                    "Excepción controlada: " +
                    e.getMessage()
                );
            }

            System.out.println();
            System.out.println(
                "--- CONSISTENCIA ---"
            );

            System.out.println(
                SISTEMA.verificarConsistencia()
                ? "CONSISTENTE"
                : "INCONSISTENTE"
            );

        } catch (Exception e) {

            System.out.println(
                "Error: " +
                e.getMessage()
            );

        } finally {

            System.out.println(
                "Demostración finalizada."
            );
        }
    }

    private static void cargarDatosDemo() {

        try {

            SISTEMA.registrarEstudiante(
                new Estudiante(
                    "Ana Pérez",
                    "0101010101",
                    "ana@correo.com",
                    "EST-001"
                )
            );

            SISTEMA.registrarEstudiante(
                new Estudiante(
                    "Luis Gómez",
                    "0102020202",
                    "luis@correo.com",
                    "EST-002"
                )
            );

            SISTEMA.registrarCurso(
                new Curso(
                    "POO-01",
                    "Programación Orientada a Objetos",
                    2
                )
            );

            SISTEMA.registrarCurso(
                new Curso(
                    "BD-01",
                    "Bases de Datos",
                    3
                )
            );

        } catch (Exception e) {

            System.out.println(
                "Datos demo ya cargados."
            );
        }
    }

    private static String leer(
            String mensaje) {

        System.out.print(mensaje);

        return SC.nextLine();
    }

    private static int leerEntero(
            String mensaje) {

        while (true) {

            try {

                return Integer.parseInt(
                    leer(mensaje)
                );

            } catch (
                    NumberFormatException e) {

                System.out.println(
                    "Ingrese un número entero válido."
                );
            }
        }
    }
}
