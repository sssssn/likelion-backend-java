package com.likelion.project03.codeup;

/* 문제 1120
세 정수가 입력되면 평균을 출력하시오.
 */
import java.util.Scanner;

public class Codeup1120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        int val3 = sc.nextInt();

        System.out.printf("%.2f", (val1 + val2 + val3) / 3.0);
    }
}

