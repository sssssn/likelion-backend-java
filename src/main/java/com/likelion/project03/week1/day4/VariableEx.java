package com.likelion.project03.week1.day4;

import com.likelion.project03.week1.day3.PrintHello;

public class VariableEx {
    public static void main(String[] args) {
        int iVal; // 변수 선언
        iVal = 0; // 초기화_1 (최초로 값 지정)

        PrintHello printHello; // 변수 선언
        printHello = new PrintHello(); // 초기화_2 (new 인스턴스화)

        System.out.println(iVal);
        printHello.print();
    }
}
