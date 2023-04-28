package com.likelion.project03.codeup;

/* 문제 1117
두 실수를 입력받아 두 실수의 곱을 출력하되 소수 둘째자리까지 출력하시오.
 */
import java.util.Scanner;

public class Codeup1117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double val1 = sc.nextDouble();
        double val2 = sc.nextDouble();

        System.out.printf("%.2f", val1 * val2);
    }
}

