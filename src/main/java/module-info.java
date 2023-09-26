module com.example.bbbbbd {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.bbbbbd to javafx.fxml;
    exports com.example.bbbbbd;
}