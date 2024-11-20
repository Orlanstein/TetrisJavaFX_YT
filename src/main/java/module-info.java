module com.example.tetrisenjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tetrisenjavafx to javafx.fxml;
    exports com.example.tetrisenjavafx;
}