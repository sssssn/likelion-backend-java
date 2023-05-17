package com.likelion.project02.codeup;

/* 문제 1065
세 정수 a, b, c가 입력되었을 때, 짝수만 출력해보자.
 */
import java.util.Scanner;

public class Codeup1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        int val3 = sc.nextInt();

        if(val1 % 2 == 0) System.out.println(val1);
        if(val2 % 2 == 0) System.out.println(val2);
        if(val3 % 2 == 0) System.out.println(val3);
    }
}

