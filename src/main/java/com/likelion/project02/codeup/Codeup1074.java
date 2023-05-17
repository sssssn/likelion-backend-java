package com.likelion.project02.codeup;

/* 문제 1074
정수(1 ~ 100) 1개가 입력되었을 때 카운트다운을 출력해보자.
 */

import java.util.Scanner;

public class Codeup1074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = sc.nextInt() -1; i >= 0; i--) {
            System.out.println(i);
        }
    }
}