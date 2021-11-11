module com.example.loginapp01 {
    requires javafx.controls;
    requires javafx.fxml;




    opens com.example.loginapp01 to javafx.fxml;
    exports com.example.loginapp01;
}