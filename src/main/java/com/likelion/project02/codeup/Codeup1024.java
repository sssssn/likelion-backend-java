package com.likelion.project02.codeup;

/* 문제 1024
단어를 1개 입력받는다. 입력받은 단어(영어)의 각 문자를 한줄에 한 문자씩 분리해 출력한다.
 */

import java.util.Scanner;

public class Codeup1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        for (int i = 0; i < word.length(); i++) {
            System.out.println("'" + word.substring(i, i + 1) + "'");
        }
    }
}
