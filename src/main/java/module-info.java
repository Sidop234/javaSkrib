module com.example.scribble {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.scribble to javafx.fxml;
    exports com.example.scribble;
}