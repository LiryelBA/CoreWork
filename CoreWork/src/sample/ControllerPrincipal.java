package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.awt.event.ActionEvent;

public class ControllerPrincipal {

    @FXML
    private Button buttonEntrar;

    @FXML
    private TextField textFieldCA;

    private Integer cod = 0001;


    public void entrar(javafx.event.ActionEvent actionEvent) throws Exception{
        if(textFieldCA.getText().hashCode() == cod){
            System.out.println("Entrou!");
        }
    }
}
