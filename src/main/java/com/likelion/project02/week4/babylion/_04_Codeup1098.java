package com.likelion.project02.week4.babylion;

import java.util.Scanner;
public class _04_Codeup1098 {
    public static void main(String[] args) {
//        1. 첫 번째 줄 가로(w) 세로(h) 공백두고 입력
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[sc.nextInt()][sc.nextInt()];
//        2. 두 번째 줄 놓을 수 있는 막대의 개수 (n)
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
//        3. 세 번째 줄 각 막대의 길이 (l) 방향 (d) 좌표 (x, y)
            int l = sc.nextInt();
            int d = sc.nextInt();
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
//        4. 막대를 놓을건데 가로 (0) 세로 (1) 구분을 해야됨
            for (int k = 0; k < l; k++) {
                if (d == 0) {
                    // 막대 놓는 방향이 가로일 때
                    arr[x][y + k] = 1;
                } else {
                    // 막대 놓는 방향이 세로일 때
                    arr[x + k][y] = 1;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
