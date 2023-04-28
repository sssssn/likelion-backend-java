package com.likelion.project03.codeup;

/* 문제 1119
하루는 24시간이다.

일(day)이 입력으로 주어지면 시간으로 변환하시오.
 */
import java.util.Scanner;

public class Codeup1119 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(num * 24);
    }
}

