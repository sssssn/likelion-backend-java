package com.likelion.project03.codeup;

/*
년, 월, 일을 입력받아 지정된 형식으로 출력하는 연습을 해보자.
 */
import java.util.Scanner;

public class Codeup1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("yyyy.m.d 형식으로 입력하세요: ");
        String[] strArr = sc.nextLine().split("\\."); // "."이 아닌 "\\."으로
        int year = Integer.parseInt(strArr[0]);
        int month = Integer.parseInt(strArr[1]);
        int day = Integer.parseInt(strArr[2]);

        System.out.printf("변환 값은: " + "%04d.%02d.%02d", year, month, day);
    }
}