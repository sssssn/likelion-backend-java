package com.likelion.project02.week4.babylion;

public class _06_StudentTest {
    public static void main(String[] args) {
        _05_Student student = new _05_Student();
        _05_Student student2 = new _05_Student("선녀", 30);
        System.out.println(student2.age);
        student.study(5);
        student.isAdult();
    }
}
