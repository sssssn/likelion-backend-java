package com.likelion.project03.codeup;

/* 문제 1063
입력된 두 정수 a, b 중 큰 값을 출력하는 프로그램을 작성해보자.
단, 조건문을 사용하지 않고 3항 연산자 ? 를 사용한다.
 */
import java.util.Scanner;

public class Codeup1063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int val1 = sc.nextInt();
        int val2 = sc.nextInt();

        System.out.println((val1 > val2) ? val1 : val2);
    }
}

