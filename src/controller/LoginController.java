package controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    public AnchorPane main;
    public TextField clientName;
    static String userName;

    public void loginOnAction() throws IOException {
        userName=clientName.getText();
        Stage stage = new Stage();
        stage.setScene(new Scene(FXMLLoader.load(LoginController.class.getResource("../view/ClientForm.fxml"))));
        stage.close();
        clientName.clear();
        stage.centerOnScreen();
        stage.show();
    }

    public void HereWeGoOnAction(KeyEvent keyEvent) throws IOException {

            if (keyEvent.getCode() == KeyCode.ENTER) {
                loginOnAction();
            }
        }




}


