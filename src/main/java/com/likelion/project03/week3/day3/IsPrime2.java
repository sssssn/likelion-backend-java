package com.likelion.project03.week3.day3;

public class IsPrime2 {
    public static void main(String[] args) {
        // 2부터 n - 1 까지만 check
        // i * i <= 50
        // break; num % i == 0이면

        // 15
        int num = 992; // 소수 2_500_000
        boolean isPrime = true;
        for (int i = 2; i * i <= num; i++) {
            if(num % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime);
    }
}
