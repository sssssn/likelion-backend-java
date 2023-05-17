package com.likelion.project02.week3.babylion;

import java.util.Arrays;

public class _10_Array2 {
    public static void main(String[] args) {
//        2차원 배열 : 수학에서의 행렬
        int[][] array = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(array[0]));
        System.out.println(Arrays.toString(array[1]));
        System.out.println(Arrays.toString(array[2]));

        array[1][1] = 100;
        System.out.println(array[1][1]);
        System.out.println(Arrays.deepToString(array)); // 이차원 배열 출력 방법
    }
}
