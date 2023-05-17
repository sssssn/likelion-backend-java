package com.likelion.project02.codeup;

/* 문제 1071
정수가 순서대로 입력된다.
-2147483648 ~ +2147483647, 단 개수는 알 수 없다.

0이 아니면 입력된 정수를 출력하고, 0이 입력되면 출력을 중단해보자.
 */

import java.util.Scanner;

public class Codeup1071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int num = sc.nextInt(); num != 0; num = sc.nextInt()) {
            System.out.println(num);
        }
    }
}