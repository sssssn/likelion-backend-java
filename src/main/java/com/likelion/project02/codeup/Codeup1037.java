package com.likelion.project02.codeup;

/* 문제 1037
10진 정수 1개를 입력받아 아스키 문자로 출력해보자.
단, 0 ~ 255 범위의 정수만 입력된다.
 */
import java.util.Scanner;

public class Codeup1037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ascii = sc.nextInt();
        char character = (char) ascii;
        System.out.println(character);
    }
}







