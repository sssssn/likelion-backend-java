package com.likelion.project03.week2.day3;

import java.util.Arrays;

public class SwapEx {
    public static void main(String[] args) {
        // 오름차순으로 정렬하는 알고리즘을 만들어 보자.
        int[] arr = {2, 1, 4, 8, 7, 6};

        int temp = arr[0]; // 임시 변수 공간에 저장
        arr[0] = arr[1];
        arr[1] = temp;

        System.out.println(Arrays.toString(arr));
    }
}
