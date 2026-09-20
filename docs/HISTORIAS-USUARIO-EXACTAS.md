# Historias de usuario exactas — Semana 4

| ID | Historia | Criterio de aceptación |
|---|---|---|
| HU-01 | Como Administrador, quiero registrar un estudiante con sus datos básicos, para mantener actualizado el registro académico. | Si los datos son válidos, el estudiante queda registrado. |
| HU-02 | Como Administrador, quiero buscar un estudiante por código, para consultar rápidamente su información. | Si el código existe, se muestran sus datos. |
| HU-03 | Como Administrador, quiero actualizar los datos de un estudiante, para mantener información vigente. | Al guardar datos válidos, la información se actualiza. |
| HU-04 | Como Administrador, quiero eliminar un estudiante sin matrículas activas, para mantener limpio el registro. | Si no existen matrículas activas, se permite eliminar. |
| HU-05 | Como Administrador, quiero registrar un estudiante con un código único, para evitar duplicados. | Si el código ya existe, el sistema rechaza el registro. |
| HU-06 | Como Administrador, quiero registrar un correo válido, para evitar datos incorrectos. | Un correo con formato inválido es rechazado. |
| HU-07 | Como Administrador, quiero consultar la lista de estudiantes, para conocer los registros disponibles. | El sistema muestra los estudiantes registrados. |
| HU-08 | Como Administrador, quiero buscar por nombre, para encontrar un estudiante sin conocer su código. | Se muestran coincidencias por nombre. |
| HU-09 | Como Administrador, quiero ver los datos completos de un estudiante, para revisar su información. | Al seleccionar un estudiante se muestran sus datos. |
| HU-10 | Como Administrador, quiero recibir confirmación del registro, para saber que la operación terminó correctamente. | Después del registro aparece un mensaje de confirmación. |
| HU-11 | Como Administrador, quiero registrar un curso, para disponer de cursos para matrícula. | Con datos válidos se crea el curso. |
| HU-12 | Como Administrador, quiero consultar un curso por código, para ver su información. | Si existe el código, se muestra el curso. |
| HU-13 | Como Administrador, quiero actualizar el nombre del curso, para corregir o mejorar la información. | El nombre se actualiza al guardar. |
| HU-14 | Como Administrador, quiero actualizar el cupo del curso, para mantener disponible la capacidad real. | El sistema acepta únicamente un cupo válido. |
| HU-15 | Como Administrador, quiero usar códigos de curso únicos, para evitar duplicados. | Si el código existe, el nuevo curso es rechazado. |
| HU-16 | Como Administrador, quiero registrar cursos sin cupos negativos, para evitar inconsistencias. | Un cupo menor que cero genera un error. |
| HU-17 | Como Estudiante, quiero consultar cursos disponibles, para elegir una opción de matrícula. | Solo se muestran cursos con disponibilidad. |
| HU-18 | Como Estudiante, quiero ver los cupos disponibles, para conocer si puede matricularse. | El sistema muestra el cupo actual. |
| HU-19 | Como Estudiante, quiero buscar un curso por nombre, para encontrarlo con facilidad. | Se muestran cursos coincidentes. |
| HU-20 | Como Responsable académico, quiero recibir aviso cuando un curso esté lleno, para conocer la falta de disponibilidad. | Al llegar a cero cupos se informa que está lleno. |
| HU-21 | Como Estudiante, quiero matricularme en un curso disponible, para registrar mi participación académica. | Si hay cupo y datos válidos, la matrícula se registra. |
| HU-22 | Como Sistema, quiero validar que el estudiante exista, para evitar matrículas de personas no registradas. | Si no existe, la matrícula no se crea. |
| HU-23 | Como Sistema, quiero validar que el curso exista, para evitar matrículas de cursos inexistentes. | Si no existe, la matrícula no se crea. |
| HU-24 | Como Estudiante, quiero evitar una matrícula duplicada, para mantener un registro correcto. | Si ya está matriculado, el sistema rechaza la nueva solicitud. |
| HU-25 | Como Sistema, quiero actualizar el cupo después de matricular, para mantener consistencia. | El cupo disminuye en uno al confirmar. |
| HU-26 | Como Estudiante, quiero recibir un aviso cuando no haya cupos, para conocer por qué no puedo matricularme. | El sistema informa que el curso está lleno. |
| HU-27 | Como Estudiante, quiero consultar mis matrículas, para conocer mis cursos registrados. | Se muestran las matrículas asociadas al estudiante. |
| HU-28 | Como Responsable académico, quiero consultar estudiantes de un curso, para conocer quiénes están matriculados. | El sistema muestra la lista del curso. |
| HU-29 | Como Responsable académico, quiero registrar la fecha de matrícula, para conservar evidencia de cuándo se realizó. | La fecha queda almacenada automáticamente. |
| HU-30 | Como Estudiante, quiero recibir confirmación de mi matrícula, para saber que el proceso fue exitoso. | Se muestra confirmación con curso y estudiante. |
| HU-31 | Como Estudiante, quiero cancelar una matrícula, para retirarme de un curso. | Si la matrícula existe, puede cancelarse. |
| HU-32 | Como Sistema, quiero devolver el cupo al cancelar, para mantener actualizada la capacidad. | Al cancelar, el cupo aumenta en uno. |
| HU-33 | Como Sistema, quiero validar la matrícula antes de cancelarla, para evitar errores. | Si no existe, se informa y no se modifica el curso. |
| HU-34 | Como Administrador, quiero recibir errores controlados, para entender qué ocurrió. | Las excepciones previstas muestran mensajes comprensibles. |
| HU-35 | Como Sistema, quiero guardar matrículas en una colección, para gestionar los registros durante la ejecución. | Cada matrícula válida queda almacenada. |
| HU-36 | Como Sistema, quiero guardar estudiantes en una colección, para consultarlos durante la ejecución. | Cada estudiante válido queda almacenado. |
| HU-37 | Como Sistema, quiero guardar cursos en una colección, para gestionarlos durante la ejecución. | Cada curso válido queda almacenado. |
| HU-38 | Como Usuario, quiero recibir mensajes claros ante errores, para saber cómo corregir la información. | El mensaje indica de forma comprensible el problema. |
| HU-39 | Como Responsable académico, quiero consultar un resumen de cursos y cupos, para revisar rápidamente la disponibilidad. | Se muestra cada curso con su cupo. |
| HU-40 | Como Administrador, quiero mantener consistencia entre matrículas y cupos, para evitar diferencias en los datos. | Después de registrar o cancelar, el cupo coincide con las matrículas. |

## Matriz de trazabilidad
RF-01 → HU-01 hasta RF-40 → HU-40. Cada relación se valida mediante prueba funcional.
