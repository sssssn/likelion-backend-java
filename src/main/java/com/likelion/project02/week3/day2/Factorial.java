package com.likelion.project02.week3.day2;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        int answer = 1; // 0으로 하면 안됨!
        // +=, *=
        for (int i = n; i > 0; i--) {
            answer *= i;
        }
        System.out.println(answer);
    }
}
