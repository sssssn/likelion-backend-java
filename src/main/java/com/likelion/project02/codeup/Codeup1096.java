package com.likelion.project02.codeup;

/* 문제 1096
기숙사 생활을 하는 학교에서 어떤 금요일(전원 귀가일)에는 모두 집으로 귀가를 한다.

오랜만에 집에 간 영일이는 아버지와 함께 두던 매우 큰 오목에 대해서 생각해 보다가
"바둑판에 돌을 올린 것을 프로그래밍 할 수 있을까?"하고 생각하였다.

바둑판(19 * 19)에 n개의 흰 돌을 놓는다고 할 때,
n개의 흰 돌이 놓인 위치를 출력하는 프로그램을 작성해보자.


참고
가로번호, 세로번호를 사용할 수 있는 2차원 배열을 사용하면
이러한 형태를 쉽게 기록하고 사용할 수 있다. 물론 더 확장한 n차원 배열도 만들 수 있다.
 */

import java.util.Scanner;

public class Codeup1096 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int[][] arr = new int[20][20]; // 바둑판의 크기는 19x19이지만, 인덱스는 1부터 시작하기 때문에 20x20 배열로 설정

        for (int i = 0; i < input; i++) {
            int xLocation = sc.nextInt();
            int yLocation = sc.nextInt();
            arr[xLocation][yLocation] = 1;
        }

        for (int i = 1; i < 20; i++) {
            for (int j = 1; j < 20; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}