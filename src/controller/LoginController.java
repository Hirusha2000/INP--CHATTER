package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    public AnchorPane main;
    public TextField clientName;
    static String userName;

    public void loginOnAction(ActionEvent actionEvent) throws IOException {
        userName=clientName.getText();
        Stage stage = new Stage();
        stage.setScene(new Scene(FXMLLoader.load(LoginController.class.getResource("../view/ClientForm.fxml"))));
        stage.close();
        stage.centerOnScreen();
        stage.show();
    }
}


