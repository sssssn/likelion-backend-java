package com.likelion.project03.codeup;

/* 문제 1032
10진수를 입력받아 16진수(hexadecimal)로 출력해보자.

참고
%d(10진수 형태)로 입력받고
%x로 출력하면 16진수(hexadecimal) 소문자로 출력된다.
 */
import java.util.Scanner;

public class Codeup1032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iDecimal = sc.nextInt();
        String hexadecimal = Integer.toHexString(iDecimal);
        System.out.println(hexadecimal);
    }
}


