package com.likelion.project02.codeup;

/* 문제 1023
실수 1개를 입력받아 정수 부분과 실수 부분으로 나누어 출력한다.
 */

import java.util.Scanner;

public class Codeup1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = sc.next().split("\\."); // "[.]" <- 이렇게도 가능
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
}
