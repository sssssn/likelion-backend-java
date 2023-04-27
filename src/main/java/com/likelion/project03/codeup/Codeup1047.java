package com.likelion.project03.codeup;

/* 문제 1047
정수 1개를 입력받아 2배 곱해 출력해보자.
참고
*2 의 값을 출력해도 되지만,
정수를 2배로 곱하거나 나누어 계산해 주는 비트단위시프트연산자 <<, >>를 이용한다.
 */
import java.util.Scanner;

public class Codeup1047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println(num << 1);
    }
}

