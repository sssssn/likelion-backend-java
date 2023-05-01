package com.likelion.project03.codeup;

/* 문제 1078
정수(1 ~ 100) 1개를 입력받아 1부터 그 수까지 짝수의 합을 구해보자.
 */

import java.util.Scanner;

public class Codeup1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = 0;

        for(int i = 1; i <= num; i++) {
            if(i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println(sum);
    }
}