package com.likelion.project03.codeup;

/* 문제 1118
삼각형의 넓이를 구하는 프로그램을 작성한다.

삼각형의 넓이 = 밑변 * 높이 / 2
 */
import java.util.Scanner;

public class Codeup1118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double val1 = sc.nextDouble();
        double val2 = sc.nextDouble();

        System.out.println((val1 * val2) / 2);
    }
}

