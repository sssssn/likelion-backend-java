package com.likelion.project03.codeup;

/* 문제 1084
빨강(red), 초록(green), 파랑(blue) 빛을 섞어
여러 가지 빛의 색을 만들어 내려고 한다.

빨강(r), 초록(g), 파랑(b) 각각의 빛의 개수가 주어질 때,
(빛의 강약에 따라 0 ~ n-1 까지 n가지의 빛 색깔을 만들 수 있다.)

주어진 rgb 빛들을 다르게 섞어 만들 수 있는 모든 경우의 조합(r g b)과
총 가짓 수를 계산해보자.
 */

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Codeup1084 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();

        BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0; i<r; i++) {
            for(int j=0; j<g; j++) {
                for(int k=0; k<b;k++) {
                    bf.write(i + " " + j + " " + k + "\n");
                }
            }
        }
        bf.flush(); // For loop 바깥으로 이동
        System.out.println(r*g*b);
    }
}