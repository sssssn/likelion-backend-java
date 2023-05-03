package com.likelion.project03.codeup;

/* 문제 1095
정보 선생님은 오늘도 이상한 출석을 부른다.

영일이는 오늘도 다른 생각을 해보았다.
출석 번호를 다 부르지는 않은 것 같은데... 가장 빠른 번호가 뭐였지?

출석 번호를 n번 무작위로 불렀을 때, 가장 빠른 번호를 출력해 보자.
 */

import java.util.Scanner;

public class Codeup1095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        int min = 24; // 입력 범위가 1 ~ 23이므로, 처음 최솟값은 24로 설정

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        sc.close();

        System.out.println(min);
    }
}