package com.likelion.project03.week3.babylion;

public class _04_TypeCasting {
    public static void main(String[] args) {
//        (암묵적인) 자동 형 변환 : 작은 타입을 큰 타입으로 변환
        System.out.println(1 + "1"); // int -> str
//        (명시적인) 강제 형 변환 : 큰 타입을 작은 타입으로 변환, 데이터 유실이 생길 수 있다
        double dVal = 123.456;
        int iVal = (int) dVal;
        System.out.println(iVal); // 소수점 이하가 사라짐

        System.out.println(1 + Integer.parseInt("1"));

//        Float.parseFloat();
//        Double.parseDouble();

//        float : 소수점 이하 일곱자리까지
//        double : 소수점 이하 열다섯자리까지
//        BigDecimal : 소수점 이하 더 많이

//        Q. 문자열 1.11111111, 2.11111111 더한 값이 정확하게?
        String str1 = "1.11111111";
        String str2 = "2.11111111";
        double result = Double.parseDouble(str1) + Double.parseDouble(str2);
        System.out.println(result);
    }
}
