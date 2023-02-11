package com.cappellinispirito.ispw_project_202223_jfx;

import com.cappellinispirito.ispw_project_202223_jfx.Model.Exceptions.FailedQueryToOpenFoodFacts;
import com.cappellinispirito.ispw_project_202223_jfx.View.SearchProductCustomerView;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Objects;


public class Main extends Application{
    Stage applicationStage;

    @Override
    public void start(Stage myStage) throws IOException {

        //node
        Parent rootNode = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/cappellinispirito/ispw_project_202223_jfx/Main_menu2.fxml")));
        //scene
        Scene myScene = new Scene(rootNode);
        //stylesheet
        myScene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("/com/cappellinispirito/ispw_project_202223_jfx/MyStylesheet2.css")).toExternalForm());
        //windows icon
        Image myIcon = new Image(String.valueOf(getClass().getResource("/com/cappellinispirito/ispw_project_202223_jfx/icons/logo4.png")));
        myStage.getIcons().add(myIcon);
        //name
        myStage.setTitle("HealthyCart");
        //miscellaneous
        myStage.setResizable(false);
        //initializing variables
        this.applicationStage = myStage;
        //setting up the Node -> Scene -> Stage
        myStage.setScene(myScene);
        myStage.show();
    }

    public static void main(String[] args) throws IOException, ParseException, SQLException, FailedQueryToOpenFoodFacts {
        //testing
        //Coca-cola 1 lt: 5449000133328
        //Nutella: 3017620422003
        String barcode = "3017620422003"; //it's the barcode of nutella
        //System.out.println(Nutella.getNutriscore().getNutriscoreValue());
        launch(args);
        //System.exit(0);

        //Testing for db connection...
        /*UserAccountDAO accountDAO = new UserAccountDAO();
        accountDAO.createAccount("Gio", "Gio");
        System.out.println(DBConnector.getInstance().getConnection());*/


    }
}
