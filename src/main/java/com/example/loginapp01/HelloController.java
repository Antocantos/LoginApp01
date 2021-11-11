package com.example.loginapp01;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {


    @FXML
    private Button btnCancel;

    @FXML
    private TextField txtUsername;

    @FXML
    private Label labelInvalid;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private Button btnLoggin;

    @FXML
    private ImageView imgLeft;

    @FXML
    private ImageView imgIcon;

    @FXML
    private void callBackLoggin(ActionEvent actionEvent) {

        if(txtUsername.getText().isBlank() == false && txtPassword.getText().isBlank() == false){
            labelInvalid.setText("You tried to login");
        } else {
            labelInvalid.setText("Enter username and password");
        }

    }

    @FXML
    private void callBackCancel(ActionEvent actionEvent) {
        Stage stage = (Stage) btnCancel.getScene().getWindow();
        stage.close();

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File brandingFile = new File("Recuross/LeftInterface.png");
        Image brandingImage = new Image(brandingFile.toURI().toString());
        imgLeft.setImage(brandingImage);

        File brandingFile2 = new File("Recuross/lockping.png");
        Image brandingImage2 = new Image(brandingFile2.toURI().toString());
        imgIcon.setImage(brandingImage2);

    }

    public void validateLogin(){

    }
}


