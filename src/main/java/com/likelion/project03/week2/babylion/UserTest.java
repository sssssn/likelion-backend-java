package com.likelion.project03.week2.babylion;

public class UserTest {
    public static void main(String[] args) {
        User user = new User();

        user.age = 10;
        user.name = "아기사자";

        user.printAge();
        user.printName();
    }
}
