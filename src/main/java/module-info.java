module com.example.hola_mundo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hola_mundo to javafx.fxml;
    exports com.example.hola_mundo;
}