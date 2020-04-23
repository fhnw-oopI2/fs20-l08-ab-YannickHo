package ch.fhnw.oop2.module08.ab2;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Starter extends Application {

    PresentationModel pm = new PresentationModel();

    @Override
    public void start(Stage primaryStage) {
        Parent rootPanel = new ApplicationUI(pm);
        Scene myScene = new Scene(rootPanel);

        primaryStage.setScene(myScene);
        primaryStage.titleProperty().bind(pm.getAppTitle());
        primaryStage.setWidth(400);
        primaryStage.setHeight(300);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        Application.launch();
    }

}
