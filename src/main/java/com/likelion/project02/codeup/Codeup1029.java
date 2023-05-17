package com.likelion.project02.codeup;

/* 문제 1029
실수 1개를 입력받아 그대로 출력해보자.
(단, 입력되는 실수의 범위는 +- 1.7*10-308 ~ +- 1.7*10308 이다.)
 */
import java.util.Scanner;

public class Codeup1029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("%.11f", sc.nextDouble());
    }
}
