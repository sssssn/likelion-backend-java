package com.likelion.project02.codeup;

/* 문제 1079
'q'가 입력될 때까지 입력한 문자를 계속 출력하는 프로그램을 작성해보자.
 */

import java.util.Scanner;

public class Codeup1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch;

        do {
            ch = sc.next().charAt(0);
            System.out.println(ch);
        } while(ch != 'q');
    }
}