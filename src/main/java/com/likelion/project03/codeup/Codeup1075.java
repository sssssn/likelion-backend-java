package com.likelion.project03.codeup;

/* 문제 1075
정수(1 ~ 100) 1개가 입력되었을 때 카운트다운을 출력해보자.
 */

import java.util.Scanner;

public class Codeup1075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = sc.nextInt(); i >= 1; i--) {
            System.out.println(i);
        }
    }
}