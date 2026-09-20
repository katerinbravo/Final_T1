# Semana 3 — Análisis del problema, Git y POO

## 1. Contexto
El proyecto desarrolla un Sistema de Gestión de Matrículas Académicas para registrar estudiantes, cursos y matrículas, controlar cupos y prevenir registros duplicados.

## 2. Adaptación al desarrollo individual
La guía está planteada para cuatro integrantes. Este repositorio corresponde a un desarrollo individual, por lo que las responsabilidades se concentran en una sola autora. No se simulan colaboradores ni commits de otras personas. Se conserva Git Flow con main, develop y ramas feature/*.

## 3. Convenciones
Ramas: feature/<nombre>-<tarea>.
Commits:
- feat(alcance): descripción
- fix(alcance): descripción
- docs(alcance): descripción
- test(alcance): descripción

## 4. Flujo Git
1. Trabajar desde develop.
2. Crear una rama feature/*.
3. Implementar y documentar.
4. Registrar commits descriptivos.
5. Abrir Pull Request hacia develop.
6. Revisar y fusionar.
7. Al cerrar la etapa, integrar develop en main.

## 5. Comando avanzado
La guía exige evidenciar un comando avanzado real. Para un desarrollo individual se utilizará git stash durante el trabajo local y se conservará la captura real del terminal como evidencia. No se fabrica una captura.

Comandos:
git status
git stash
git stash list
git stash pop

## 6. Desarrollo POO
Se implementan sobrecarga de métodos, una colección ArrayList y manejo de excepciones try/catch/finally.

## 7. Problema central
El registro manual o disperso de estudiantes, cursos y matrículas puede producir duplicidad de matrículas, errores de información, dificultad para verificar cupos y mayor tiempo de consulta.

## 8. Ishikawa
| Categoría | Causas |
|---|---|
| Procesos | Registro manual, pasos repetidos, ausencia de validaciones automáticas |
| Personas | Errores de digitación, desconocimiento del estado de cupos |
| Tecnología | Herramientas no integradas, ausencia de sistema centralizado |
| Información | Datos duplicados, registros incompletos |
| Entorno | Alta demanda en períodos de matrícula, tiempo limitado |

Efecto: dificultades para gestionar matrículas de forma organizada, rápida y confiable.

## 9. Evidencias
- Commit propio en la rama feature.
- Pull Request hacia develop.
- Código de sobrecarga.
- Código de colección y excepciones.
- Captura real del comando avanzado.
- Ishikawa y formulación del problema.
