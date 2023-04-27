package com.likelion.project03.week2.day4;

/* OR 연산자
true && true = true
false && true = true
true && false = true
false && false = false
 */
public class OrOperatorEx {
    public static void main(String[] args) {
        boolean result = true || true;
        System.out.printf("%b\n", result);
        result = true || false;
        System.out.printf("%b\n", result);
        result = false || true;
        System.out.printf("%b\n", result);
        result = false || false;
        System.out.printf("%b\n", result);
    }
}
