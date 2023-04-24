package com.likelion.project03.codeup;

/* 문제 1028
정수 1개를 입력받아 그대로 출력해보자.
(단, 입력되는 정수의 범위는 0 ~ 4,294,967,295 이다.)
 */
import java.util.Scanner;

public class Codeup1028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("%d", sc.nextLong()); // float보다 큰 건 double, int보다 큰 건 long
    }
}
