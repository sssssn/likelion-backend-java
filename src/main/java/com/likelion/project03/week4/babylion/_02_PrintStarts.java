package com.likelion.project03.week4.babylion;

public class _02_PrintStarts {
    public static void main(String[] args) {
        // 별 (*) 오른쪽 삼각형 만들기
        /*
         *****    = *****
          ****    = S****
           ***    = SS***
            **    = SSS**
             *    = SSSS*
         */
//        i = 0 (행), j = 5 (열), k (공백)
//        i = 1, k = 1, j = 4
        for (int i = 0; i < 5; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = 5; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
