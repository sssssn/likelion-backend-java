package com.likelion.project03.codeup;

/* 문제 1035
16진수로 입력된 정수 1개를 8진수로 바꾸어 출력해보자.

참고
%x(영문자 소문자) 나 %X(영문자 대문자)로 입력 받으면
16진수로 인식시켜 저장시킬 수 있다. %o로 출력하면 8진수로 출력된다.
 */
import java.util.Scanner;

public class Codeup1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hex = sc.next();
        int decimal = Integer.parseInt(hex, 16);
        String octal = Integer.toOctalString(decimal);
        System.out.println(octal);
    }
}





