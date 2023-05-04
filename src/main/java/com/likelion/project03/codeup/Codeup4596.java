package com.likelion.project03.codeup;

/* 문제 4596
문제 1) 최대값 (중등1, 고등1)

<그림 1>과 같이 9×9 격자판에 쓰여진 81개의 자연수가 주어질 때, 이들 중 최대값을 찾고 그 최대값이 몇 행 몇 열에 위치한 수인지 구하는 프로그램을 작성하시오.
 */

import java.util.Scanner;
public class Codeup4596 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int xIdx = 0;
        int yIdx = 0;

        // O(N^2)
        int maxValue = 0;
        for (int row = 1; row <= 9; row++) {
            for (int col = 1; col <= 9; col++) {
                int now = sc.nextInt();
                if(maxValue < now){
                    maxValue = now;
                    xIdx = col;
                    yIdx = row;
                }
            }
        }
        System.out.println(maxValue);
        System.out.printf("%d %d\n", yIdx, xIdx);
    }
}