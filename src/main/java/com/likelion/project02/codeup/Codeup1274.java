package com.likelion.project02.codeup;

/* 문제 1274
소수란, 약수가 1과 자기 자신 두 개 뿐인 수를 말한다.

어떤 수가 입력되면 그 수가 소수인지 판단하시오.
 */

import java.util.Scanner;

public class Codeup1274 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int factors = 0; // 약수의 개수
        for (int i = 2; i < num; i++) {
            if(num % i == 0) factors++;
        }
        System.out.println(factors == 0 ? "prime": "not prime");
    }
}