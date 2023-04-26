package com.likelion.project03.codeup;

/* 문제 1045
정수 2개(a, b)를 입력받아 합, 차, 곱, 몫, 나머지, 나눈 값을 자동으로 계산해보자.
단 0 <= a, b <= 2147483647, b는 0이 아니다.
 */
import java.util.Scanner;

public class Codeup1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int val1 = sc.nextInt();
        int val2 = sc.nextInt();

        System.out.println(val1 + val2);
        System.out.println(val1 - val2);
        System.out.println(val1 * val2);
        System.out.println(val1 / val2);
        System.out.println(val1 % val2);
        System.out.printf("%.2f", (double) val1 / val2);
    }
}


