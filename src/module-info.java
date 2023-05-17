module com.likelion.project02 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.likelion.project02 to javafx.fxml;
    exports com.likelion.project02;
    exports com.likelion.project02.week1;
    opens com.likelion.project02.week1 to javafx.fxml;
    exports com.likelion.project02.week1.day4;
    opens com.likelion.project02.week1.day4 to javafx.fxml;
    exports com.likelion.project02.week1.day3;
    opens com.likelion.project02.week1.day3 to javafx.fxml;
}