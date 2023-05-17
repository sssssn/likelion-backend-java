package com.likelion.project02.week3.babylion;

public class _12_For {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        int[][] arr2 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for (int i = 0; i < array.length; i++) {
            System.out.println(i);
        }

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.printf("arr[%d][%d] = %d ", i, j, arr2[i][j]);
                if(j == arr2[i].length -1) {
                    System.out.println();
                }
            }
        }
    }
}
