package com.likelion.project02.week7.day2;

public class main {
    public static void main(String[] args) {
        checkLeapYear();
    }

    private static void checkLeapYear() {
        int year = 2020;
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " O");
        } else {
            System.out.println((year + " X"));
        }
    }
}