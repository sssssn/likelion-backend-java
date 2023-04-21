package com.likelion.project03.week1.day5;

public class UserTest {
    public static void main(String[] args) {
        User sn = new User();
        sn.name = "선녀";
        sn.phoneNumber = "010-8632-0282";
        sn.age = 30;

        System.out.printf("%s님은 성인입니까? %s\n", sn.name, sn.isAdult());
    }
}
