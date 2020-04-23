package ch.fhnw.oop2.module08.ab2;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class PresentationModel {

   private StringProperty buttonText;
    private StringProperty appTitle;

    private enum ButtonText{OFF, ON};
    private enum TitleText{ToggleAppOff, ToggleAppOn};

    public PresentationModel(){
        this.buttonText = new SimpleStringProperty(ButtonText.OFF.toString());
        this.appTitle = new SimpleStringProperty(TitleText.ToggleAppOff.toString());
    }

    public StringProperty getAppTitle() {
        return appTitle;
    }
    public StringProperty getButtonText() {
        return buttonText;
    }

    public void setAppTitle(String appTitle) {
        this.appTitle.set(appTitle);
    }

    public void setButtonText(String buttonText) {
        this.buttonText.set(buttonText);
    }

    public void toggleButton(){
        if(buttonText.get().equals(ButtonText.OFF.toString())){
            setButtonText(ButtonText.ON.toString());
        }
        else {
            setButtonText(ButtonText.OFF.toString());}
    }

    public void toggleTitle(){
        if(appTitle.get().equals(TitleText.ToggleAppOff.toString())){
            setAppTitle(TitleText.ToggleAppOn.toString());
        }
        else {
            setAppTitle(TitleText.ToggleAppOff.toString());}
    }

}
