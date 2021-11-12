package com.mycompany.computer_object_graphing;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.scene.image.Image;
import javafx.stage.StageStyle;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("Computer_Object_Gui"), 1041, 804);
        stage.setScene(scene);
        //stage.getIcons().add(new Image(getClass().getResource("src/main/resources/icons8-computer-80.png").toString(), true));
        //How to change the image icon on decorator?? Cannot get the path to take so leaving this commented out for now
        stage.setTitle("Graphing Computer Objects"); 
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}