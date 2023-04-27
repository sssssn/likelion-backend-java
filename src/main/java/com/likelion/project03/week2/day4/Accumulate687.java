package com.likelion.project03.week2.day4;

public class Accumulate687 {
    public static void main(String[] args) {
        int num = 687;
        int answer = 0; // 누적할 변수 선언

        // 나머지를 먼저 구하고
        answer = answer + (num % 10);
        // 그 뒤에 몫을 구해야 한다.
        num = num / 10;
        // 68 --> 10으로 나눈 나머지 8
        System.out.printf("num:%d, answer:%d\n", num, answer);

        // 반복 (while문으로 가능)
        answer = answer + (num % 10);
        num = num / 10;
        System.out.printf("num:%d, answer:%d\n", num, answer);

        answer = answer + (num % 10);
        num = num / 10;
        System.out.printf("num:%d, answer:%d\n", num, answer);
    }
}
