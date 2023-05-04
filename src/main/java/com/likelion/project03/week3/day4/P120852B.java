package com.likelion.project03.week3.day4;

import java.util.Arrays;

public class P120852B {
    public static void main(String[] args) {
        int n = 12;
        int divisor = 2;
        int[] arr = new int[n + 1]; // 12개나 만들어야하나?
        int idx = 0;

        while (n > 1) {
            if (n % divisor == 0) { // 나누어 떨어지는지?
                arr[idx++] = divisor;
                n /= divisor;
            } else {
                // 12 --> 6 --> 3 인 경우 2로 나누어 떨어지지 않음
                divisor++;
            }
        }
        for (int i = 0; i < arr.length; i++) System.out.printf("%d ", arr[i]);
    }
}
