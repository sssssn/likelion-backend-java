package com.likelion.project02.codeup;

/* 문제 1048
정수 2개(a, b)를 입력받아 a를 2b배 곱한 값으로 출력해보자.
0 <= a <= 10, 0 <= b <= 10
 */
import java.util.Scanner;

public class Codeup1048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int val1 = sc.nextInt();
        int val2 = sc.nextInt();

        System.out.println(val1 << val2);
    }
}

