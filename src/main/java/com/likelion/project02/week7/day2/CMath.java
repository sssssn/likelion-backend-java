package com.likelion.project02.week7.day2;

import java.util.ArrayList;
import java.util.List;

public class CMath {
    public static boolean isPrime(int num) {
        int count = 0;
        for(int i = 1; i < num; i++) {
            if (num % i == 0) count++;
        }
        return (count == 1);
    }

    public static boolean isPerpectionNumber(int num) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < num; i++) {
            if (num % i == 0)
                numbers.add(i);
        }

        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        return (sum == num);
    }

    public static String factors(int num) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < num; i++) {
            if (num % i == 0)
                numbers.add(i);
        }
        return numbers.toString();
    }
}