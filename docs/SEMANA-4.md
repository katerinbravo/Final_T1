# Semana 4 — Restricciones, objetivos, alcance, requerimientos e historias

## Restricciones y alternativas
| Tipo | Restricción | Alternativa |
|---|---|---|
| Tiempo | Calendario académico limitado | Priorizar funciones esenciales |
| Tecnología | Uso de Java | Mantener Java y librerías estándar |
| Recursos | Desarrollo individual | Centralizar trabajo y evidenciarlo en GitHub |
| Datos | No usar datos reales | Utilizar datos simulados |
| Persistencia | Sin BD real inicialmente | Colecciones en memoria |
| Interfaz | Tiempo limitado | Interfaz básica o consola |

## Objetivo general
Desarrollar un sistema orientado a objetos para gestionar estudiantes, cursos y matrículas académicas, incorporando validaciones que permitan mantener registros organizados y evitar duplicidades.

## Objetivos específicos
1. Implementar el registro y consulta de estudiantes.
2. Implementar el registro y control de cursos y cupos.
3. Gestionar matrículas evitando registros duplicados.
4. Aplicar POO, colecciones y manejo de excepciones.
5. Documentar el desarrollo mediante Git y GitHub.

## Alcance incluido
Registro de estudiantes y administradores; cursos; cupos; matrícula y cancelación; validación de duplicados; prerrequisitos; consultas; código Java POO.

## Fuera del alcance
Pagos en línea; integración con sistemas universitarios reales; autenticación avanzada; aplicación móvil; notificaciones externas; datos personales reales.

## Actores
Estudiante y Administrador.

## 40 requerimientos funcionales
| ID | Descripción | Prioridad | Responsable |
|---|---|---|---|
| RF-01 | El sistema debe permitir registrar un estudiante. | Alta | Única autora |
| RF-02 | El sistema debe permitir consultar estudiantes. | Alta | Única autora |
| RF-03 | El sistema debe permitir modificar datos de un estudiante. | Media | Única autora |
| RF-04 | El sistema debe permitir registrar un administrador. | Media | Única autora |
| RF-05 | El sistema debe permitir registrar un curso. | Alta | Única autora |
| RF-06 | El sistema debe permitir consultar cursos. | Alta | Única autora |
| RF-07 | El sistema debe permitir modificar información de un curso. | Media | Única autora |
| RF-08 | El sistema debe permitir definir la capacidad de un curso. | Alta | Única autora |
| RF-09 | El sistema debe verificar si un curso tiene cupo. | Alta | Única autora |
| RF-10 | El sistema debe reducir el cupo al confirmar una matrícula. | Alta | Única autora |
| RF-11 | El sistema debe aumentar el cupo al cancelar una matrícula. | Media | Única autora |
| RF-12 | El sistema debe crear una matrícula. | Alta | Única autora |
| RF-13 | El sistema debe asociar una matrícula con un estudiante. | Alta | Única autora |
| RF-14 | El sistema debe asociar una matrícula con un curso. | Alta | Única autora |
| RF-15 | El sistema debe impedir una matrícula duplicada activa. | Alta | Única autora |
| RF-16 | El sistema debe permitir cancelar una matrícula. | Alta | Única autora |
| RF-17 | El sistema debe consultar las matrículas registradas. | Alta | Única autora |
| RF-18 | El sistema debe identificar el estado de una matrícula. | Media | Única autora |
| RF-19 | El sistema debe permitir agregar observaciones a una matrícula. | Baja | Única autora |
| RF-20 | El sistema debe validar que exista el estudiante antes de matricular. | Alta | Única autora |
| RF-21 | El sistema debe validar que exista el curso antes de matricular. | Alta | Única autora |
| RF-22 | El sistema debe impedir matricular en un curso sin cupo. | Alta | Única autora |
| RF-23 | El sistema debe permitir registrar prerrequisitos de un curso. | Media | Única autora |
| RF-24 | El sistema debe consultar los prerrequisitos de un curso. | Media | Única autora |
| RF-25 | El sistema debe impedir que un curso sea su propio prerrequisito. | Alta | Única autora |
| RF-26 | El sistema debe almacenar estudiantes en una colección. | Alta | Única autora |
| RF-27 | El sistema debe almacenar cursos en una colección. | Alta | Única autora |
| RF-28 | El sistema debe almacenar matrículas en una colección. | Alta | Única autora |
| RF-29 | El sistema debe buscar un estudiante por código. | Alta | Única autora |
| RF-30 | El sistema debe buscar un curso por código. | Alta | Única autora |
| RF-31 | El sistema debe informar cuando un estudiante no existe. | Media | Única autora |
| RF-32 | El sistema debe informar cuando un curso no existe. | Media | Única autora |
| RF-33 | El sistema debe controlar excepciones durante la matrícula. | Alta | Única autora |
| RF-34 | El sistema debe informar el resultado del proceso de matrícula. | Media | Única autora |
| RF-35 | El sistema debe conservar el estado de una matrícula. | Media | Única autora |
| RF-36 | El sistema debe permitir consultar matrículas activas. | Media | Única autora |
| RF-37 | El sistema debe permitir consultar matrículas canceladas. | Baja | Única autora |
| RF-38 | El sistema debe evitar datos esenciales vacíos al registrar. | Alta | Única autora |
| RF-39 | El sistema debe mantener identificadores de estudiante únicos. | Alta | Única autora |
| RF-40 | El sistema debe mantener identificadores de curso únicos. | Alta | Única autora |

## Historias de usuario
Se mantiene trazabilidad HU-01 = RF-01 hasta HU-40 = RF-40. Cada historia usa el formato “Como <rol>, quiero <funcionalidad>, para <beneficio>” y debe incluir criterios de aceptación verificables.

Ejemplos:
- **HU-01:** Como administrador, quiero registrar un estudiante para mantener actualizado el padrón. **Aceptación:** con datos válidos se registra; si el código ya existe se rechaza.
- **HU-09:** Como administrador, quiero verificar el cupo de un curso. **Aceptación:** capacidad mayor que cero indica cupo; capacidad cero indica que no hay cupo.
- **HU-15:** Como administrador, quiero impedir matrículas duplicadas. **Aceptación:** un segundo registro activo del mismo estudiante y curso es rechazado.
- **HU-22:** Como estudiante, quiero que se valide el cupo. **Aceptación:** si la capacidad es cero, la matrícula no se registra.
- **HU-23:** Como administrador, quiero definir prerrequisitos. **Aceptación:** se permite otro curso y se rechaza el mismo curso.

## Trazabilidad
RF-01..RF-40 se relacionan con HU-01..HU-40 y sirven como base para el modelo UML y la implementación Java.

## Evidencia Git
La documentación se desarrolla en una rama feature individual y se integra mediante Pull Request hacia develop.