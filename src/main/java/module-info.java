module com.likelion.project03 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.likelion.project03 to javafx.fxml;
    exports com.likelion.project03;
}