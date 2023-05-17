package com.likelion.project02.codeup;

/* 문제 1057
두 개의 참(1) 또는 거짓(0)이 입력될 때,
참/거짓이 서로 같을 때에만 참이 계산되는 프로그램을 작성해보자.
 */
import java.util.Scanner;

public class Codeup1057 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int val1 = sc.nextInt();
        int val2 = sc.nextInt();

        System.out.println((val1 == val2) ? 1 : 0);
    }
}

