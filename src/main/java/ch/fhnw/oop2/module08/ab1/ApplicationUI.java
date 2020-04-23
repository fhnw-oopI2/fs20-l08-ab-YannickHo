package ch.fhnw.oop2.module08.ab1;

import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

import java.awt.print.PrinterAbortException;

public class ApplicationUI extends StackPane {

    private Button button;
    PresentationModel pm;

    public ApplicationUI(PresentationModel pm) {
        this.pm = pm;
        initializeControls();
        layoutControls();
    }

    private void initializeControls() {
        button = new Button();
        button.textProperty().bind(pm.getButtonText());
    }
 
    private void layoutControls() {
        getChildren().add(button);
    }
    
    
    



}
