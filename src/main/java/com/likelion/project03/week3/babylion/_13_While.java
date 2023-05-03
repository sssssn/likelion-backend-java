package com.likelion.project03.week3.babylion;

public class _13_While {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
//        --x : 피연산자 1 감소 시키고 연산, x++ : 연산하고 피연산자 1 증가
        System.out.println(--x + --y);
        int count = 10;
        while(count > 0) {
            System.out.println(--count);
        }
    }
}
