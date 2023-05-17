package com.likelion.project02.codeup;

/* 문제 1620
어떤 수 n이 입력되면 n의 각 자릿수의 합이 한 자리가 될때까지 계산하여 출력하시오.

예) 1234567

1234567 → 1+2+3+4+5+6+7 = 28 → 2 + 8 = 10 → 1 + 0 = 1
 */

import java.util.Scanner;

public class Codeup1620 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(digitSum(n));
    }

    public static int digitSum(long n) {
        if (n < 10) return (int)n;

        long sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return digitSum(sum);
    }
}