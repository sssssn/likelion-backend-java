package com.likelion.project02.codeup;

/* 문제 1049
두 정수(a, b)를 입력받아
a가 b보다 크면 1을, a가 b보다 작거나 같으면 0을 출력하는 프로그램을 작성해보자.
 */
import java.util.Scanner;

public class Codeup1049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int val1 = sc.nextInt();
        int val2 = sc.nextInt();

        System.out.println(val1 > val2 ? 1 : 0);
    }
}

