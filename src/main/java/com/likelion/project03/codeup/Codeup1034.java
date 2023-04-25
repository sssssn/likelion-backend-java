package com.likelion.project03.codeup;

/* 문제 1034
8진수로 입력된 정수 1개를 10진수로 바꾸어 출력해보자.
 */
import java.util.Scanner;

public class Codeup1034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String octal = sc.next();
        int decimal = Integer.parseInt(octal, 8);
        System.out.println(decimal);
    }
}




