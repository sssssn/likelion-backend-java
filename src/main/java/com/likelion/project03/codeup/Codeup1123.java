package com.likelion.project03.codeup;

/* 문제 1123
섭씨 온도가 입력되면 화씨 온도로 변환하시오.

화씨 온도 = 9 / 5 * 섭씨온도 + 32
 */
import java.util.Scanner;

public class Codeup1123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double val = sc.nextDouble();

        System.out.printf("%.3f", 9.0 / 5.0 * val + 32);
    }
}