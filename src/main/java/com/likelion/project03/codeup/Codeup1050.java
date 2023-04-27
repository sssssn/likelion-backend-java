package com.likelion.project03.codeup;

/* 문제 1050
두 정수(a, b)를 입력받아
a와 b가 같으면 1을, 같지 않으면 0을 출력하는 프로그램을 작성해보자.
 */
import java.util.Scanner;

public class Codeup1050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int val1 = sc.nextInt();
        int val2 = sc.nextInt();

        System.out.println(val1 == val2 ? 1 : 0);
    }
}

