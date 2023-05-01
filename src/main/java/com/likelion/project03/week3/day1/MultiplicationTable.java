package com.likelion.project03.week3.day1;

public class MultiplicationTable {
    public static void main(String[] args) {

        for (int i = 1; i <= 9 ; i++) {
            System.out.printf("2 * %d = %d\n", i, i * 2);
        }
        System.out.println("---------");

        for (int i = 1; i <= 9 ; i++) {
            System.out.printf("3 * %d = %d\n", i, i * 3);
        }
        System.out.println("---------");

        for (int i = 1; i <= 9 ; i++) {
            System.out.printf("4 * %d = %d\n", i, i * 4);
        }
        System.out.println("---------");

        for (int j= 2; j < 4; j++) {
            for (int i = 1; i <= 9; i++) {
                System.out.printf("%d * %d = %d\n", j, i, i * j);
            }
            System.out.println("---------");
        }
    }
}
