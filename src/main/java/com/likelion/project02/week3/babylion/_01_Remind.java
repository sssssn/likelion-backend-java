package com.likelion.project02.week3.babylion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class _01_Remind {
    public static void main(String[] args) {
//        int number; // 변수 선언
//        number = 3; // 할당(초기화)
        int number = 3; // 변수 선언 및 초기화를 한 번에!
//        데이터 타입(자료형)
//        기본 타입
//        참조 타입 - 기본 타입을 제외한 타입 (String), Heap 영역
        String str = "a"; // 주소값
        String str2 = "a";
        System.out.println(str == str2);

//        입력하면 생각나야하는 3가지!
//        Scanner vs BufferedReader
//        BufferedReader가 더 빠르다!
        Scanner sc = new Scanner(System.in);
        InputStreamReader is = new InputStreamReader(System.in); // 한 글자 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 여러 글자 입력
    }
}
