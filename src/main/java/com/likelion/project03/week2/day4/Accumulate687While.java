package com.likelion.project03.week2.day4;

public class Accumulate687While {
    public static void main(String[] args) {
        int num = 687;
        int answer = 0; // 누적할 변수 선언

        while (num > 0){
            answer = answer + (num % 10);
            num = num / 10;
        }
        System.out.printf("num:%d, answer:%d\n", num, answer);

    }
}
