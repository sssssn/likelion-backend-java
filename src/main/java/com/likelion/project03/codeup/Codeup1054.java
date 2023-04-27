package com.likelion.project03.codeup;

/* 문제 1054
두 개의 참(1) 또는 거짓(0)이 입력될 때,
모두 참일 때에만 참을 출력하는 프로그램을 작성해보자.
 */
import java.util.Scanner;

public class Codeup1054 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int val1 = sc.nextInt();
        int val2 = sc.nextInt();

        System.out.println((val1 == 1 && val2 == 1) ? 1 : 0);
    }
}

