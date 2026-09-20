package edu.matriculas;

public class PruebasSistema {

    public static void main(String[] args)
            throws Exception {

        SistemaMatriculas sistema =
                new SistemaMatriculas();

        Estudiante estudiante =
                new Estudiante(
                    "Carlos Andrade",
                    "1717171717",
                    "carlos@correo.com",
                    "EST-100"
                );

        Curso curso =
                new Curso(
                    "MAT-01",
                    "Matemática",
                    1
                );

        sistema.registrarEstudiante(
                estudiante
        );

        sistema.registrarCurso(
                curso
        );

        System.out.println(
            "1. Registro: OK"
        );

        System.out.println(
            "2. Código único: " +
            (
                sistema.getEstudiantes().size() == 1
                ? "OK"
                : "ERROR"
            )
        );

        Matricula matricula =
                sistema.matricular(
                    "EST-100",
                    "MAT-01"
                );

        System.out.println(
            "3. Matrícula: " +
            matricula
        );

        System.out.println(
            "4. Cupo después de matricular: " +
            curso.getCapacidad()
        );

        try {

            sistema.matricular(
                "EST-100",
                "MAT-01"
            );

            System.out.println(
                "5. Duplicado: ERROR"
            );

        } catch (
                MatriculaDuplicadaException e) {

            System.out.println(
                "5. Duplicado: " +
                "EXCEPCIÓN CONTROLADA"
            );

            System.out.println(
                e.getMessage()
            );
        }

        sistema.cancelarMatricula(
            "EST-100",
            "MAT-01"
        );

        System.out.println(
            "6. Cancelación: OK"
        );

        System.out.println(
            "7. Cupo devuelto: " +
            curso.getCapacidad()
        );

        System.out.println(
            "8. Consistencia: " +
            (
                sistema.verificarConsistencia()
                ? "OK"
                : "ERROR"
            )
        );

        System.out.println(
            "9. Sobrecarga:"
        );

        Matricula sobrecarga =
                new Matricula(
                    estudiante,
                    curso
                );

        sobrecarga.inscribir(
                estudiante
        );

        sobrecarga.inscribir(
                estudiante,
                "Prueba de sobrecarga"
        );

        System.out.println(
            "Observación: " +
            sobrecarga.getObservacion()
        );

        System.out.println();
        System.out.println(
            "================================"
        );

        System.out.println(
            "     PRUEBAS FINALIZADAS"
        );

        System.out.println(
            "================================"
        );
    }
}
