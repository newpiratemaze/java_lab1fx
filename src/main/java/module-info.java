module com.example.lab1fx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab1fx to javafx.fxml;
    exports com.example.lab1fx;
}