module com.example.graphsplotting {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.graphsplotting to javafx.fxml;
    exports com.example.graphsplotting;
}