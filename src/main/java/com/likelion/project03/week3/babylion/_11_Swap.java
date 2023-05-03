package com.likelion.project03.week3.babylion;

import java.util.Arrays;

public class _11_Swap {
    public static void main(String[] args) {
//        첫번째 원소와 두번째 원소를 바꿔보자

//        두 손 위에 손바닥 위에 있는 물체가 있는데 이걸 바꿔볼거야
//        한 손에 있는 걸 다른 곳에 잠깐 둔다.
//        다른 손에 있는 걸 또 다른 손에 넣는다.
//        잠깐 둔 곳에 있던 걸 빈 손에 넣는다.
        int[] arr = {1,2,3,4,5};
        int temp;
        temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
        System.out.println(Arrays.toString(arr));

//        복합, 대입, 증감 연산자는 교재로 보자!
        int x = 10;
        int y = 5;
        // --x : 피연산자 x를 1감소 시키고 연산을 한다.
        // y++ : 연산을 하고 피연산자 y를 1증가 시킨다.
        System.out.println(--x + y++);
        System.out.println(y);

    }
}
