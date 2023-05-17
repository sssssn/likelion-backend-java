package com.likelion.project02.codeup;

/* 문제 1053
1(true, 참) 또는 0(false, 거짓) 이 입력되었을 때
반대로 출력하는 프로그램을 작성해보자.
 */
import java.util.Scanner;

public class Codeup1053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println(num == 1 ? 0 : 1);
    }
}

