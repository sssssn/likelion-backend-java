package com.likelion.project03.codeup;

/* 문제 1121
정수 계산에서 나머지를 구하시오.

예를 들어

7 / 5 의 나머지는 2입니다.
 */
import java.util.Scanner;

public class Codeup1121 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();

        System.out.println(val1 % val2);
    }
}

