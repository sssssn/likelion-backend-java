package com.likelion.project02.codeup;

/* 문제 1025
다섯 자리의 정수 1개를 입력받아 각 자리별로 나누어 출력한다.
 */

import java.util.Scanner;

public class Codeup1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] digits = new int[5];

        for (int i = 4; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }

        for (int i = 0; i < digits.length; i++) {
            System.out.println("[" + digits[i] * (int) Math.pow(10, 4 - i) + "]");
        }
    }
}