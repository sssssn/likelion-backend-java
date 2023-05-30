package com.likelion.project02.week7.day2;

public class Main {
    public static void main(String[] args) {
        int i = 1700;
        if ( checkLeapYear(i) )
            System.out.println(i + " O");
        else
            System.out.println(i + " X");
    }

    public static boolean checkLeapYear(int year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0) ;
    }
}