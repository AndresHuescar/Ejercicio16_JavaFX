package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {

        // Etiquetas del formulario
        Label labelNombre = new Label("Nombre:");
        Label labelApellido = new Label("Apellido:");
        Label labelCorreo = new Label("Correo:");

        // Campos de texto donde el usuario introducirá los datos
        TextField campoNombre = new TextField();
        TextField campoApellido = new TextField();
        TextField campoCorreo = new TextField();

        // Texto de ayuda dentro de cada campo
        campoNombre.setPromptText("Introduce tu nombre");
        campoApellido.setPromptText("Introduce tu apellido");
        campoCorreo.setPromptText("Introduce tu correo");

        // Botón para validar los campos
        Button botonValidar = new Button("Validar campos");

        // Etiqueta donde se mostrará el resultado de la validación
        Label mensaje = new Label();

        // Evento que se ejecuta al pulsar el botón
        botonValidar.setOnAction(event -> {

            // Obtengo el texto escrito en cada campo
            String nombre = campoNombre.getText();
            String apellido = campoApellido.getText();
            String correo = campoCorreo.getText();

            // Compruebo si algún campo está vacío
            if (nombre.isEmpty() || apellido.isEmpty() || correo.isEmpty()) {
                mensaje.setText("Error: no puede quedar ningún campo vacío.");
                mensaje.setStyle("-fx-text-fill: red;");
            } else {
                mensaje.setText("Todos los campos están correctamente rellenados.");
                mensaje.setStyle("-fx-text-fill: green;");
            }
        });

        // GridPane organiza el formulario en filas y columnas
        GridPane root = new GridPane();

        // Separación entre columnas y filas
        root.setHgap(10);
        root.setVgap(10);

        // Estilo para centrar el formulario y añadir margen interior
        root.setStyle("-fx-alignment: center; -fx-padding: 20;");

        // Añado los elementos al formulario indicando columna y fila
        root.add(labelNombre, 0, 0);
        root.add(campoNombre, 1, 0);

        root.add(labelApellido, 0, 1);
        root.add(campoApellido, 1, 1);

        root.add(labelCorreo, 0, 2);
        root.add(campoCorreo, 1, 2);

        root.add(botonValidar, 1, 3);
        root.add(mensaje, 1, 4);

        // Creo la escena principal
        Scene scene = new Scene(root, 550, 300);

        // Configuro y muestro la ventana
        stage.setTitle("Ejercicio 16 - JavaFX");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}