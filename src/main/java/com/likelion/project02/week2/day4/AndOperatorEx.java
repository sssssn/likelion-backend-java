package com.likelion.project02.week2.day4;

/* AND 연산자
true && true = true
false && true = false
true && false = false
false && false = false
 */
public class AndOperatorEx {
    public static void main(String[] args) {
        boolean result = true && true;
        System.out.printf("%b\n", result);
        result = true && false;
        System.out.printf("%b\n", result);
        result = false && true;
        System.out.printf("%b\n", result);
        result = false && false;
        System.out.printf("%b\n", result);
    }
}