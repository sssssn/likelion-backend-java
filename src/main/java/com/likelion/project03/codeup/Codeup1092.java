package com.likelion.project03.codeup;

/* 문제 1092
온라인 채점시스템에는 초등학생, 중고등학생, 대학생, 대학원생,
일반인, 군인, 프로그래머, 탑코더 등 아주 많은 사람들이 들어와 문제를 풀고 있는데,

실시간 채점 정보는 메뉴의 채점기록(Judge Status)을 통해 살펴볼 수 있다.

자! 여기서...잠깐..
같은 날 동시에 가입한 3명의 사람들이 온라인 채점시스템에 들어와 문제를 푸는 날짜가
매우 규칙적이라고 할 때, 다시 모두 함께 문제를 풀게 되는 그날은 언제일까?

예를 들어 3명이 같은 날 가입/등업하고, 각각 3일마다, 7일마다, 9일마다
한 번씩 들어온다면, 처음 가입하고 63일 만에 다시 3명이 함께 문제를 풀게 된다.
 */

import java.math.BigInteger;
import java.util.Scanner;

public class Codeup1092 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int lcm_ab = lcm(a, b);
        int lcm_abc = lcm(lcm_ab, c);

        System.out.println(lcm_abc);
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return Math.abs(a);
    }

    static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }
}