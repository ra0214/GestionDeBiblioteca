package com.mendoza.gestiondebiblioteca.controllers;

import com.mendoza.gestiondebiblioteca.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MostrarUsuariosController {

    @FXML
    private AnchorPane fondo;

    @FXML
    private TableView<?> mostrarTable;

    @FXML
    private Button salirBtn;

    @FXML
    void OnClickedSalirBtn(MouseEvent event) throws IOException {
        Stage currentStage = (Stage) fondo.getScene().getWindow();
        currentStage.close();

        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("menuSuper-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Menú De Super Administrador");
        stage.show();
    }

}