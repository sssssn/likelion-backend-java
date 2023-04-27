package com.likelion.project03.week2.day4;

public class DecreaseOperator2 {
    public static void main(String[] args) {
        int i = 10;
        // --가 앞에 오는 경우 --> 사채에서 빌린 돈
        System.out.println(--i); // 선감소 후사용
        System.out.println(i); // 감소된 i값 출력

        System.out.println(i += 1); // i++ (선사용 후증가)만 대체 가능은 하지만 sout 사용 어려움
    }
}
