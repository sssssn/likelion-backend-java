package com.likelion.project03.week2.day2;

public class StringFormatting {
    public static void main(String[] args) {
        String name = "선녀";
        int balance = 2_000_000;

        String result = String.format("%s님의 통장 잔고는 %d원 입니다.", name, balance);
        System.out.println(result);
    }
}
