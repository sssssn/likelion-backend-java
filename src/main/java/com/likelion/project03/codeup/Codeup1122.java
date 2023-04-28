package com.likelion.project03.codeup;

/* 문제 1122
초를 입력받아 분 / 초의 형태로 출력하시오.

예)

60  ====>   1 0    (1분 0초를 뜻함)

70    ====>    1  10       (1분 10초를 뜻함)
 */
import java.util.Scanner;

public class Codeup1122 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();

        System.out.println(val / 60 + " " + val % 60);
    }
}

