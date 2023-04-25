package com.likelion.project03.codeup;

/* 문제 1041
영문자 1개를 입력받아 그 다음 문자를 출력해보자.
영문자 'A'의 다음 문자는 'B'이고, 영문자 '0'의 다음 문자는 '1'이다.
 */
import java.util.Scanner;

public class Codeup1041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        System.out.println((char) (ch + 1));
    }
}







