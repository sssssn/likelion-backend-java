package com.likelion.project03.week2.babylion;

/* 스캐너 사용해서 숫자 3개 받아서 평균을 구하시오.
(단, 소수점 둘째자리에서 반올림하세요.)
 */
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("%.1f", (sc.nextFloat() + sc.nextFloat() + sc.nextFloat()) /3 );
    }
}
