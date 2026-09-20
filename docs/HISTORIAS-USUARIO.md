# Historias de usuario — RF-01 a RF-40

| ID | Historia | Criterio de aceptación |
|---|---|---|
| HU-01 | Como administrador, quiero registrar un estudiante para mantener el padrón actualizado. | Con datos válidos se registra; con código existente se rechaza. |
| HU-02 | Como administrador, quiero consultar estudiantes para localizar sus datos. | Al solicitar consulta se muestran estudiantes registrados. |
| HU-03 | Como administrador, quiero modificar datos de estudiante para mantenerlos actualizados. | Los datos válidos sustituyen los anteriores. |
| HU-04 | Como administrador, quiero registrar administradores para gestionar el sistema. | Con datos válidos se crea el administrador. |
| HU-05 | Como administrador, quiero registrar cursos para disponer de la oferta académica. | Con código, nombre y capacidad válidos se crea el curso. |
| HU-06 | Como administrador, quiero consultar cursos para conocer la oferta. | La consulta muestra los cursos registrados. |
| HU-07 | Como administrador, quiero modificar cursos para corregir información. | La información válida se actualiza. |
| HU-08 | Como administrador, quiero definir la capacidad de un curso para controlar cupos. | La capacidad queda almacenada. |
| HU-09 | Como administrador, quiero verificar el cupo para saber si puede matricularse un estudiante. | Capacidad > 0 indica cupo disponible. |
| HU-10 | Como sistema, quiero reducir el cupo al matricular para mantener disponibilidad correcta. | Una matrícula confirmada reduce la capacidad en uno. |
| HU-11 | Como sistema, quiero aumentar el cupo al cancelar para recuperar disponibilidad. | Una cancelación aumenta la capacidad en uno. |
| HU-12 | Como estudiante, quiero crear una matrícula para registrar mi inscripción. | Con estudiante y curso válidos se crea la matrícula. |
| HU-13 | Como sistema, quiero asociar matrícula y estudiante para identificar al matriculado. | La matrícula conserva un estudiante. |
| HU-14 | Como sistema, quiero asociar matrícula y curso para identificar la asignatura. | La matrícula conserva un curso. |
| HU-15 | Como administrador, quiero impedir duplicados para mantener consistencia. | Un duplicado activo es rechazado. |
| HU-16 | Como estudiante, quiero cancelar una matrícula para retirar mi inscripción. | El estado cambia a CANCELADA. |
| HU-17 | Como administrador, quiero consultar matrículas para revisar registros. | Se muestran matrículas almacenadas. |
| HU-18 | Como administrador, quiero conocer el estado de una matrícula. | Se muestra ACTIVA o CANCELADA. |
| HU-19 | Como administrador, quiero agregar observaciones para registrar información adicional. | La observación queda asociada. |
| HU-20 | Como sistema, quiero validar la existencia del estudiante antes de matricular. | Si no existe, no se crea la matrícula. |
| HU-21 | Como sistema, quiero validar la existencia del curso antes de matricular. | Si no existe, no se crea la matrícula. |
| HU-22 | Como sistema, quiero impedir matrícula sin cupo. | Con capacidad cero se rechaza. |
| HU-23 | Como administrador, quiero registrar prerrequisitos para controlar la secuencia académica. | Se asocia otro curso como prerrequisito. |
| HU-24 | Como estudiante, quiero consultar prerrequisitos para conocer requisitos académicos. | Se muestran los prerrequisitos del curso. |
| HU-25 | Como sistema, quiero impedir que un curso sea su propio prerrequisito. | Una autorrelación consigo mismo es rechazada. |
| HU-26 | Como sistema, quiero almacenar estudiantes en una colección para gestionarlos. | Los estudiantes quedan almacenados en la colección. |
| HU-27 | Como sistema, quiero almacenar cursos en una colección para gestionarlos. | Los cursos quedan almacenados en la colección. |
| HU-28 | Como sistema, quiero almacenar matrículas en una colección para consultarlas. | Las matrículas quedan almacenadas. |
| HU-29 | Como administrador, quiero buscar estudiantes por código para localizarlos rápidamente. | Un código existente devuelve el estudiante. |
| HU-30 | Como administrador, quiero buscar cursos por código para localizarlos rápidamente. | Un código existente devuelve el curso. |
| HU-31 | Como administrador, quiero recibir aviso si un estudiante no existe para corregir la solicitud. | Se informa que el estudiante no existe. |
| HU-32 | Como administrador, quiero recibir aviso si un curso no existe para corregir la solicitud. | Se informa que el curso no existe. |
| HU-33 | Como sistema, quiero controlar excepciones para evitar fallos durante matrícula. | Una excepción es capturada y comunicada. |
| HU-34 | Como usuario, quiero conocer el resultado de la matrícula para saber si terminó correctamente. | Se informa registro exitoso o motivo de rechazo. |
| HU-35 | Como sistema, quiero conservar el estado de matrícula para distinguir activas y canceladas. | El estado se mantiene en el objeto. |
| HU-36 | Como administrador, quiero consultar matrículas activas para conocer inscripciones vigentes. | Se muestran solo activas. |
| HU-37 | Como administrador, quiero consultar matrículas canceladas para revisar historial. | Se muestran las canceladas. |
| HU-38 | Como sistema, quiero evitar campos esenciales vacíos para mantener datos válidos. | Un registro incompleto es rechazado. |
| HU-39 | Como sistema, quiero mantener códigos de estudiante únicos para evitar duplicados. | Un código repetido es rechazado. |
| HU-40 | Como sistema, quiero mantener códigos de curso únicos para evitar duplicados. | Un código repetido es rechazado. |
