package com.likelion.project03.codeup;

/* 문제 1287
구구단을 입력받아 *로 출력하라.
 */

import java.util.Scanner;

public class Codeup1287 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < n * i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}