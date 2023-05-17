package com.likelion.project02.codeup;

/* 문제 1039
정수 2개를 입력받아 합을 출력해보자.
단, 입력되는 정수는 -2147483648 ~ +2147483648 이다.
 */
import java.util.Scanner;

public class Codeup1039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num1 = sc.nextLong();
        long num2 = sc.nextLong();

        System.out.println(num1 + num2);
    }
}







