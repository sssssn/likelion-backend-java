package com.likelion.project02.week3.day1;

public class MultiplicationTableDan {
    public static void main(String[] args) {

        int[] dan = {2, 4, 8, 9};
        for (int j = 0; j < dan.length; j++) {
            for (int i = 1; i <= 9 ; i++) {
                System.out.printf("%d * %d = %d\n",dan[j], i, i * dan[j]);
            }
            System.out.println("--------");
        }

    }
}

