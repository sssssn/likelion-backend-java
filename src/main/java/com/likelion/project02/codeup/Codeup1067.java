package com.likelion.project02.codeup;

/* 문제 1067
정수 1개가 입력되었을 때, 음(minus)/양(plus)과 짝(even)/홀(odd)을 출력해보자.
 */
import java.util.Scanner;

public class Codeup1067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println(num > 0 ? "plus" : "minus");
        System.out.println(num % 2 == 0 ? "even" : "odd");
    }
}

