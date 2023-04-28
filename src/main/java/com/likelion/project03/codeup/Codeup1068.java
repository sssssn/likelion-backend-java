package com.likelion.project03.codeup;

/* 점수(정수, 0 ~ 100)를 입력받아 평가를 출력해보자.


평가 기준
점수 범위 : 평가
 90 ~ 100 : A
 70 ~   89 : B
 40 ~   69 : C
   0 ~   39 : D
로 평가되어야 한다.
 */
import java.util.Scanner;

public class Codeup1068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num >= 90) {
            System.out.println("A");
        }
        else if (num >= 70) {
            System.out.println("B");
        }
        else if (num >= 40) {
            System.out.println("C");
        }
        else {
            System.out.println("D");
        }
    }
}

