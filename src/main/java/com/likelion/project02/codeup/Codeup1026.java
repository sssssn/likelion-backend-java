package com.likelion.project02.codeup;

/* 문제 1026
입력되는 시:분:초 에서 분만 출력해보자.
 */

import java.util.Scanner;

public class Codeup1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h, m, s;
        String[] time = sc.next().split(":");

        h = Integer.parseInt(time[0]);
        m = Integer.parseInt(time[1]);
        s = Integer.parseInt(time[2]);

        System.out.println(m);
    }
}