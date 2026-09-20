# Semana 4 — Restricciones, objetivos, alcance, requerimientos e historias

## 1. Restricciones del proyecto
| Restricción | Tipo | Alternativa realista |
|---|---|---|
| Tiempo limitado del ciclo académico | Tiempo | Priorizar funcionalidades críticas y desarrollar por iteraciones. |
| Uso de Java como lenguaje del proyecto | Tecnología | Utilizar Java y las librerías permitidas por la asignatura. |
| Desarrollo individual | Recursos | Centralizar módulos y documentar el aporte individual mediante Git. |
| No disponer de una base institucional real | Recursos | Utilizar datos de prueba y una estructura local. |
| Presupuesto académico limitado | Negocio | Usar herramientas gratuitas disponibles para estudiantes. |
| Protección de datos de estudiantes | Normativa | Trabajar con datos ficticios durante las pruebas. |

## 2. Objetivo general
Desarrollar un sistema de gestión de matrículas académicas en Java que permita registrar estudiantes, administrar cursos y controlar matrículas mediante validaciones básicas, con el propósito de organizar la información y reducir errores durante el proceso de inscripción.

## 3. Objetivos específicos
1. Diseñar las clases principales que representen estudiantes, cursos y matrículas.
2. Implementar el registro y consulta de estudiantes y cursos mediante estructuras de datos apropiadas.
3. Implementar validaciones que eviten matrículas duplicadas y controlen la disponibilidad de cupos.
4. Incorporar manejo de errores mediante excepciones para situaciones previsibles del proceso.
5. Integrar y documentar el desarrollo mediante Git Flow, manteniendo una rama develop para integración y main estable.

## 4. Alcance
### Dentro
- Registro, consulta y actualización básica de estudiantes.
- Registro y consulta de cursos.
- Control de cupos disponibles.
- Registro y consulta de matrículas.
- Validación de matrículas duplicadas.
- Manejo de errores previsibles.
- Uso de colecciones.
- Persistencia local o estructura de datos definida por el proyecto.

### Fuera
- Integración con sistemas académicos institucionales reales.
- Pagos en línea.
- Aplicación móvil.
- Notificaciones SMS o correo electrónico en producción.
- Autenticación institucional mediante servicios externos.
- Reportes estadísticos avanzados o inteligencia artificial.

## 5. Actores
- Administrador: gestiona estudiantes, cursos y consulta matrículas.
- Estudiante: proporciona sus datos y solicita su matrícula.
- Responsable académico: consulta cursos, cupos y matrículas registradas.

## 6. Requerimientos funcionales
| ID | Descripción | Prioridad | Responsable |
| RF-01 | El sistema debe permitir registrar un estudiante con nombre, código y correo. | Alta | Única autora |
| RF-02 | El sistema debe permitir consultar un estudiante por su código. | Alta | Única autora |
| RF-03 | El sistema debe permitir actualizar los datos básicos de un estudiante. | Media | Única autora |
| RF-04 | El sistema debe permitir eliminar un estudiante cuando no tenga matrículas activas. | Media | Única autora |
| RF-05 | El sistema debe validar que el código del estudiante no esté duplicado. | Alta | Única autora |
| RF-06 | El sistema debe validar que el correo tenga un formato básico válido. | Media | Única autora |
| RF-07 | El sistema debe mostrar una lista de estudiantes registrados. | Baja | Única autora |
| RF-08 | El sistema debe permitir buscar estudiantes por nombre. | Baja | Única autora |
| RF-09 | El sistema debe mostrar los datos completos de un estudiante seleccionado. | Media | Única autora |
| RF-10 | El sistema debe informar al usuario cuando el registro del estudiante sea exitoso. | Baja | Única autora |
| RF-11 | El sistema debe permitir registrar un curso con código, nombre y cupo. | Alta | Única autora |
| RF-12 | El sistema debe permitir consultar un curso por su código. | Alta | Única autora |
| RF-13 | El sistema debe permitir actualizar el nombre de un curso. | Media | Única autora |
| RF-14 | El sistema debe permitir actualizar el cupo de un curso. | Media | Única autora |
| RF-15 | El sistema debe validar que el código del curso no esté duplicado. | Alta | Única autora |
| RF-16 | El sistema debe impedir registrar un curso con cupo negativo. | Alta | Única autora |
| RF-17 | El sistema debe mostrar los cursos disponibles. | Alta | Única autora |
| RF-18 | El sistema debe mostrar el número de cupos disponibles de cada curso. | Alta | Única autora |
| RF-19 | El sistema debe permitir buscar cursos por nombre. | Baja | Única autora |
| RF-20 | El sistema debe informar cuando un curso alcance su capacidad máxima. | Media | Única autora |
| RF-21 | El sistema debe permitir matricular un estudiante en un curso disponible. | Alta | Única autora |
| RF-22 | El sistema debe validar que el estudiante exista antes de matricularlo. | Alta | Única autora |
| RF-23 | El sistema debe validar que el curso exista antes de matricularlo. | Alta | Única autora |
| RF-24 | El sistema debe impedir una matrícula duplicada del mismo estudiante en el mismo curso. | Alta | Única autora |
| RF-25 | El sistema debe disminuir el cupo disponible al registrar una matrícula. | Alta | Única autora |
| RF-26 | El sistema debe impedir matricular estudiantes cuando no existan cupos. | Alta | Única autora |
| RF-27 | El sistema debe permitir consultar las matrículas de un estudiante. | Media | Única autora |
| RF-28 | El sistema debe permitir consultar los estudiantes matriculados en un curso. | Media | Única autora |
| RF-29 | El sistema debe registrar la fecha de la matrícula. | Media | Única autora |
| RF-30 | El sistema debe mostrar un mensaje de confirmación después de una matrícula exitosa. | Baja | Única autora |
| RF-31 | El sistema debe permitir cancelar una matrícula registrada. | Media | Única autora |
| RF-32 | El sistema debe devolver el cupo al cancelar una matrícula. | Alta | Única autora |
| RF-33 | El sistema debe validar que la matrícula exista antes de cancelarla. | Alta | Única autora |
| RF-34 | El sistema debe manejar errores mediante excepciones controladas. | Alta | Única autora |
| RF-35 | El sistema debe almacenar las matrículas en una colección durante la ejecución. | Alta | Única autora |
| RF-36 | El sistema debe almacenar los estudiantes en una colección durante la ejecución. | Media | Única autora |
| RF-37 | El sistema debe almacenar los cursos en una colección durante la ejecución. | Media | Única autora |
| RF-38 | El sistema debe mostrar mensajes comprensibles ante errores de registro. | Media | Única autora |
| RF-39 | El sistema debe permitir consultar un resumen de cursos y cupos disponibles. | Baja | Única autora |
| RF-40 | El sistema debe mantener consistencia entre matrículas registradas y cupos disponibles. | Alta | Única autora |

## 7. Trazabilidad
Cada RF se vincula con la HU del mismo número y se verifica mediante prueba funcional.
