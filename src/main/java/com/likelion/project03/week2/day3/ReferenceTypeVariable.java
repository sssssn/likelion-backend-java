package com.likelion.project03.week2.day3;

public class ReferenceTypeVariable {
    public static void main(String[] args) {
        // Student 타입
        Student student = new Student(); // new를 써서 Student객체를 인스턴스화
        Student[] students = new Student[30]; // 배열의 초기화

        students[0] = new Student(); // Student 클래스의 초기화

        students[0].name = "선녀"; // Student 클래스 초기화 후 가능
        students[0].phoneNumber = "010-1004-1004";
        students[0].age = 30;
        students[1].name = "아무개";
        students[1].phoneNumber = "010-1234-1234";
        students[1].age = 20;

    }
}
