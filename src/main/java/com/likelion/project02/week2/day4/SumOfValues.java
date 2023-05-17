package com.likelion.project02.week2.day4;

public class SumOfValues {
    public static void main(String[] args) {
        int answer = 0;
        int[] arr = {2, 1, 7, 4};

        // 배열 요소 값 나타내는 방법
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);

        // 배열 요소 총합 구하는 방법 1
        System.out.println(arr[0] + arr[1] + arr[2] + arr[3]);

        // 배열 요소 총합 구하는 방법 2
        answer += arr[0];
        answer += arr[1];
        answer += arr[2];
        answer += arr[3];

        System.out.println(answer);
        System.out.printf("answer: %d", answer);
    }
}
