package com.likelion.project02.codeup;

/* 문제 1077
정수(0 ~ 100) 1개를 입력받아 0부터 그 수까지 순서대로 출력해보자.
 */

import java.util.Scanner;

public class Codeup1077 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i = 0; i <= num; i++) {
            System.out.println(i);
        }
    }
}