module com.example.seventhseacharactergenerator {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.xerial.sqlitejdbc;

    opens com.example.seventhseacharactergenerator to javafx.fxml;
    opens com.example.seventhseacharactergenerator.Controllers to javafx.fxml;
    opens com.example.seventhseacharactergenerator.Models to javafx.base;
    exports com.example.seventhseacharactergenerator;
    exports com.example.seventhseacharactergenerator.Helper;
    opens com.example.seventhseacharactergenerator.Helper to javafx.fxml;
}