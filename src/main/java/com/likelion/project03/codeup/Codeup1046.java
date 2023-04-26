package com.likelion.project03.codeup;

/* 문제 1046
정수 3개를 입력받아 합과 평균을 출력해보자.
단, -2147483648 ~ +2147483647
 */
import java.util.Scanner;

public class Codeup1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long val1 = sc.nextLong();
        long val2 = sc.nextLong();
        long val3 = sc.nextLong();

        long sum = val1 + val2 + val3;
        double avg = (double) sum / 3;

        System.out.println(sum);
        System.out.printf("%.1f", avg);
    }
}

