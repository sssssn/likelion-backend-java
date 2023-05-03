package com.likelion.project03.week3.babylion;

import java.util.Arrays;

public class _08_Array {
    public static void main(String[] args) {
//        한번 배열의 크기가 정해지면 나중에 바꿀 수 없음
//        크기 고려하지 않는 건 연결 리스트 (나중에 배울거임)

        // 배열 초기화 방법
//        int[] array = new int[5];
//        int[] arr = new int[] {1,2,3,4,5};
        int[] arr = {1,2,3,4,5};
//        {1,2,4,5,6}
//        System.out.println(Arrays.toString(array));
//        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr)); // 일차원 배열 출력 방법
        arr[0] = 100;
        System.out.println(arr[0]);

        // 참조 타입
        // 참조 변수가 객체를 가리키지 않을 때 명시하기 위해 기본적으로 null로 초기화된다.
        String[] strArray = new String[5];
        System.out.println(Arrays.toString(strArray));
        _09_Student[] students = new _09_Student[3];
        System.out.println(Arrays.toString(students));
        _09_Student st1 = new _09_Student();
        st1.age = 10;
        st1.name = "학생1";
        students[0] = st1;
        students[1] = new _09_Student();
        students[1].name = "학생2";
        System.out.println(Arrays.toString(students));
    }
}
