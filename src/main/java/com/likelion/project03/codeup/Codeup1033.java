package com.likelion.project03.codeup;

/* 문제 1033
10진수를 입력받아 16진수(hexadecimal)로 출력해보자.

참고
%d(10진수 형태)로 입력받고
%X로 출력하면 16진수(hexadecimal) 대문자로 출력된다.
 */
import java.util.Scanner;

public class Codeup1033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iDecimal = sc.nextInt();
        String hexadecimal = Integer.toHexString(iDecimal);
        // toUpperCase() : 대문자
        System.out.println(hexadecimal.toUpperCase());
    }
}

/* 이 코드의 경우 iDecimal 이라는 변수명으로 int를 입력 받는 다는 것을 표현 할 수 있습니다.
변수명 hexadecimal의 경우 이 변수에는 16진수값이 들어간다는 것에 집중 할 수 있습니다.
- 앞에서 받은 iDecimal이 int라는 것을 변수명에서 알 수 있기 때문에 10진수를 16진수로 바꾼다는 흐름이 자연스럽게 그려집니다.
 */



