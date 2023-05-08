package com.likelion.project03.codeup;

/* 문제 1256
별(*)을 n개 만큼 출력한다.
 */

import java.util.Scanner;

public class Codeup1256 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Java11버전부터 repeat()으로도 가능
//        System.out.println("*".repeat(sc.nextInt()));
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.printf("*");
        }
    }
}