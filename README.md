# Ejercicio 16 - JavaFX

## Descripción

Este proyecto corresponde al ejercicio 16 del bloque BC5 de JavaFX.

El objetivo del ejercicio es crear un formulario con varios campos de texto y un botón que valide que ningún campo esté vacío.

## Tecnologías utilizadas

- Java
- JavaFX
- Maven
- IntelliJ IDEA

## Funcionamiento

La aplicación muestra una ventana con un formulario compuesto por:

- Campo de nombre.
- Campo de apellido.
- Campo de correo.
- Botón para validar.
- Mensaje de resultado.

Cuando el usuario pulsa el botón, el programa comprueba si alguno de los campos está vacío.

Si algún campo está vacío, se muestra un mensaje de error en color rojo.

Si todos los campos están completos, se muestra un mensaje de confirmación en color verde.

## Conceptos utilizados

- `Application`: clase base para crear aplicaciones JavaFX.
- `Stage`: ventana principal de la aplicación.
- `Scene`: contenido visual de la ventana.
- `Label`: control utilizado para mostrar texto.
- `TextField`: campo donde el usuario puede escribir texto.
- `Button`: botón que ejecuta una acción.
- `setOnAction`: método que permite ejecutar código al pulsar el botón.
- `getText`: obtiene el texto escrito en un campo.
- `isEmpty`: comprueba si una cadena de texto está vacía.
- `GridPane`: layout que organiza los elementos en filas y columnas.

## Estructura del proyecto

```text
Ejercicio16_JavaFX
 ├── pom.xml
 └── src
     └── main
         └── java
             └── org
                 └── example
                     └── Main.java
```

## Cómo ejecutar el proyecto

Para ejecutar el proyecto desde IntelliJ IDEA:

1. Abrir el proyecto en IntelliJ.
2. Sincronizar el archivo `pom.xml` con Maven.
3. Abrir el panel Maven.
4. Ejecutar:

```bash
mvn javafx:run
```

## Autor

Andrés Huéscar Fernández
