module com.example.calculator22 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calculator22 to javafx.fxml;
    exports com.example.calculator22;
}