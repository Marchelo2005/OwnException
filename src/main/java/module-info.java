module com.example.ownexception {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ownexception to javafx.fxml;
    exports com.example.ownexception;
}