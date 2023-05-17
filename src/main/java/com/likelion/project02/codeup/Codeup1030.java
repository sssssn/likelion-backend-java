package com.likelion.project02.codeup;

/* 문제 1030
정수 1개를 입력받아 그대로 출력해보자.
단, 입력되는 정수의 범위는
-9,223,372,036,854,775,808 ~ +9,223,372,036,854,775,807 이다.
 */
import java.util.Scanner;

public class Codeup1030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("%d", sc.nextLong());
    }
}
