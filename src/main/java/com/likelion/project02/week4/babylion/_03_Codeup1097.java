package com.likelion.project02.week4.babylion;

import java.util.Scanner;
public class _03_Codeup1097 {
    public static void main(String[] args) {
//        1. 우선 바둑판을 세팅한다. (19*19)
        int[][] arr = new int[19][19];
//        2. 바둑판에 돌을 놓는다. 입력값을 받아서
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 19; i++) {
            String[] line = sc.nextLine().split(" ");
            for (int j = 0; j < 19; j++) {
                arr[i][j] = Integer.parseInt(line[j]);
            }
        }
//        3. 뒤집기 횟수가 입력됨. 단, n은 10 이하의 자연수
        int reverseCount = Integer.parseInt(sc.nextLine());
//        4. 뒤집어야 할 좌표가 횟수만큼 입력이 된다.
        for (int i = 0; i < reverseCount; i++) {
//        5. 좌표를 찾아서 뒤집는다.
            String[] location = sc.nextLine().split(" ");
            int x = Integer.parseInt(location[0]) - 1;
            int y = Integer.parseInt(location[1]) - 1;

            for (int j = 0; j < 19; j++) {
                arr[x][j] = arr[x][j] == 1 ? 0 : 1;
            }
            for (int j = 0; j < 19; j++) {
                arr[j][y] = arr[j][y] == 1 ? 0 : 1;
            }
        }
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
