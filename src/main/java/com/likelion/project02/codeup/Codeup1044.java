package com.likelion.project02.codeup;

/* 문제 1044
정수를 1개 입력받아 1만큼 더해 출력해보자.
단, -2147483648 ~ +2147483647 의 범위로 입력된다.
 */
import java.util.Scanner;

public class Codeup1044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long val = sc.nextLong();
        System.out.println(val + 1);
    }
}




