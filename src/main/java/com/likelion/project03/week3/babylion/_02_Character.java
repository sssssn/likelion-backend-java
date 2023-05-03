package com.likelion.project03.week3.babylion;

public class _02_Character {
//    멤버 변수 : 클래스 안에서 선언된 변수
//    1. 클래스 변수(static 변수) : Static, Method 영역
//    2. 인스턴스 변수(전역 변수) : Heap 영역
//    초기화 해주지 않아도 됨! 자료형에 따라서 알아서 0, null로 초기화 해줌

    int level; // 2. 인스턴스 변수(전역 변수)
    static int maxLevel; // 1. 클래스 변수(static 변수)

    public void levelup() {
        int level = 1; // 지역 변수
        level = level + 1;
        System.out.println("레벨업!" + level);
    }

    public void levelup2() {
        level = level + 1;
        System.out.println("레벨업!" + level);
    }
}
