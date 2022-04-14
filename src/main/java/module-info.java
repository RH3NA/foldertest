module com.example.guitest {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.guitest to javafx.fxml;
    exports com.example.guitest;
}