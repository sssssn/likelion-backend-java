package com.likelion.project02.week3.day2;

public class WhileCntHori {
    public static void main(String[] args) {

        int cnt = 0;
        while(cnt < 11){
            System.out.printf("%d ", cnt++); // 가로로 출력
        }
        System.out.println("cnt = " + cnt);
    }
}
