module com.likelion.project03 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.likelion.project03 to javafx.fxml;
    exports com.likelion.project03;
    exports com.likelion.project03.week1;
    opens com.likelion.project03.week1 to javafx.fxml;
    exports com.likelion.project03.week1.day4;
    opens com.likelion.project03.week1.day4 to javafx.fxml;
    exports com.likelion.project03.week1.day3;
    opens com.likelion.project03.week1.day3 to javafx.fxml;
}