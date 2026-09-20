# Semana 5 — Modelo de Clases UML

## Objetivo
Representar las principales clases del sistema y sus relaciones.

## Clases
- Persona
- Estudiante
- Administrador
- Curso
- Matrícula
- SistemaMatriculas

## Relaciones
- Estudiante y Administrador heredan de Persona.
- Un Estudiante puede tener varias Matrículas.
- Una Matrícula relaciona un Estudiante con uno o varios Cursos.
- Un Curso puede tener cursos prerrequisito.
- SistemaMatriculas administra las operaciones principales.

## Multiplicidades
- Persona <|-- Estudiante
- Persona <|-- Administrador
- Estudiante 1 --- 0..* Matrícula
- Matrícula 1 --- 1..* Curso
- Curso 0..* --- 0..* Curso (prerrequisito)
