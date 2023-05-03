package com.likelion.project03.week3.babylion;

public class _03_Game {
    public static void main(String[] args) {
        _02_Character character = new _02_Character();
        character.levelup();
        character.levelup();
        character.levelup();

        character.levelup2();
        character.levelup2();
        character.levelup2();

//        new를 써서 클래스를 사용하고 나면 메모리 힙 영역에서 제거됨
//        누가? JVM에 탑재된 가비지 컬렉터가 알아서
    }
}
