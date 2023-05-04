package com.likelion.project03.week3.day4;

public class GetMax {
    public static void main(String[] args) {
        int[] arr = {2, 1, 31, 9, 7};

        // 최대값 구하기
        int targetValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(targetValue < arr[i]) {
                targetValue = arr[i];
            }
        }
        System.out.println(targetValue);
    }
}
