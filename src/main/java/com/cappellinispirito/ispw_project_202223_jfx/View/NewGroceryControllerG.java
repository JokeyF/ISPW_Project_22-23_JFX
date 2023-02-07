package com.cappellinispirito.ispw_project_202223_jfx.View;

import com.cappellinispirito.ispw_project_202223_jfx.View.MainMenuControllerG;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class NewGroceryControllerG {
    public HBox topBarHbox;
    public AnchorPane rootAnchorPane;

    public void onBackButtonClicked() throws IOException {
        FXMLLoader loader = new FXMLLoader(Objects.requireNonNull(getClass().getResource("/com/cappellinispirito/ispw_project_202223_jfx/Main_menu.fxml")));
        Parent rootNode = loader.load();
        MainMenuControllerG controller = loader.getController();
        Scene myScene = new Scene(rootNode);
        Stage stage = (Stage) rootAnchorPane.getScene().getWindow();
        stage.setScene(myScene);
    }
}