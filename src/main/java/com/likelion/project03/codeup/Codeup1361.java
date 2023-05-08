package com.likelion.project03.codeup;

/* 문제 1361
n이 입력되면 n층의 별 계단을 출력하시오.

예) n= 5인 경우,

**
 **
  **
   **
    **
 */

import java.util.Scanner;

public class Codeup1361 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < i; j++) System.out.printf(" ");
            System.out.println("**");
        }
    }
}