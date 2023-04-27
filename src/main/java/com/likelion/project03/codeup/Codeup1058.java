package com.likelion.project03.codeup;

/* 문제 1058
두 개의 참(1) 또는 거짓(0)이 입력될 때,
모두 거짓일 때에만 참이 계산되는 프로그램을 작성해보자.
 */
import java.util.Scanner;

public class Codeup1058 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int val1 = sc.nextInt();
        int val2 = sc.nextInt();

        System.out.println((val1 == 0 && val2 == 0) ? 1 : 0);
    }
}

