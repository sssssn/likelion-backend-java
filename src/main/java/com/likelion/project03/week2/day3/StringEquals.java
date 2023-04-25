package com.likelion.project03.week2.day3;

import java.util.Scanner;

public class StringEquals {
    public static void main(String[] args) {
        System.out.println("GOLD" == "GOLD"); // GOLD는 두 번 사용 되었으나 한 번만 만들어줌

        String str1 = "GOLD";
        String str2 = "G";

        System.out.println("GOLD-->" + str1.hashCode());
        System.out.println("G-->" + str2.hashCode());

        boolean isSame = str1.substring(0, 1) == str2;
        isSame = str1.substring(0, 1).equals(str2);
        System.out.println(isSame);
    }
}
