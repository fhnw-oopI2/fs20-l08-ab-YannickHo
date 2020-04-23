package ch.fhnw.oop2.module08.ab1;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class PresentationModel {

    StringProperty buttonText;
    StringProperty appTitle;

    public PresentationModel(){
        this.buttonText = new SimpleStringProperty("Hello World");
        this.appTitle = new SimpleStringProperty("JavaFX App");
    }   //StringProperty damit es observable ist

    public StringProperty getAppTitle() {
        return appTitle;
    }

    public void setAppTitle(String appTitle) {
//        this.appTitle.set(appTitle);
        this.appTitle = new SimpleStringProperty(appTitle);
    }

    public StringProperty getButtonText() {
        return buttonText;
    }

    public void setButtonText(String buttonText) {
//        this.buttonText.set(buttonText);
        this.buttonText = new SimpleStringProperty(buttonText);
    }

}
