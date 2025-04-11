module com.example.javamarathon {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javamarathon to javafx.fxml;
    exports com.example.javamarathon;
}