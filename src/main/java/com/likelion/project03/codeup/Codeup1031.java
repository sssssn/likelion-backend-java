package com.likelion.project03.codeup;

/* 문제 1031
10진수를 입력받아 8진수(octal)로 출력해보자.
 */
import java.util.Scanner;

public class Codeup1031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        System.out.printf(Integer.toOctalString(decimal));
    }
}

