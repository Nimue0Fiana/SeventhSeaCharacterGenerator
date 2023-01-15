module com.example.seventhseacharactergenerator {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.xerial.sqlitejdbc;

    opens com.example.seventhseacharactergenerator to javafx.fxml;
    opens com.example.seventhseacharactergenerator.controllers to javafx.fxml;
    exports com.example.seventhseacharactergenerator;
}