package com.likelion.project02.codeup;

/* 문제 1036
영문자 1개를 입력받아 아스키 코드표의 10진수 값으로 출력해보자.
 */
import java.util.Scanner;

public class Codeup1036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char inputChar = sc.next().charAt(0);
        int ascii = inputChar;
        System.out.println(ascii);
    }
}






