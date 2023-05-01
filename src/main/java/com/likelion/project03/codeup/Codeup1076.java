package com.likelion.project03.codeup;

/* 문제 1076
영문자(a ~ z) 1개가 입력되었을 때 그 문자까지의 알파벳을 순서대로 출력해보자.
 */

import java.util.Scanner;

public class Codeup1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);

        for(char i = 'a'; i <= ch; i++) {
            System.out.print(i + " ");
        }
    }
}