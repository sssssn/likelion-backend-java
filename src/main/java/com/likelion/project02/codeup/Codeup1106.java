package com.likelion.project02.codeup;

/* 문제 1106
앞으로 많이 사용될 변수 int 자료형의 범위를 알아내는 것이 이번 문제의 정답이다.
int는 정수형이고 32비트 자료형이다.

2진수로 나타내면 가장 작은 숫자는
10000000 00000000 00000000 00000000
이고, 가장 큰 숫자는
01111111 11111111 11111111 11111111
이다.
우리는 16진수 입력방법을 이용하면 쉽게 이 문제를 해결할 수 있다.

int형의 가장 작은수a와 int형의 가장 큰수b를 차례대로 공백으로 분리하여 출력한다.
출력 예) a b       <--이런 형태(a, b는 숫자값)
 */

import java.util.Scanner;

public class Codeup1106 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int val1 = sc.nextInt();
        int val2 = sc.nextInt();

        System.out.println(Integer.MIN_VALUE + " " + Integer.MAX_VALUE);
    }
}