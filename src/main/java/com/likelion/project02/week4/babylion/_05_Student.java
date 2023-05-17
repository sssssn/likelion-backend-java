package com.likelion.project02.week4.babylion;

public class _05_Student {
    String name;
    int age;
//    클래스를 정의할 때 생성자를 생략하면 컴파일러가 자동으로 기본 생성자를 생성해줌
//    생성자 오버로딩 가능
//    오버로딩? 같은 이름의 메소드 타입과 갯수를 다르게 만든 것
//    사용자 정의된 생성자가 있다면 (매개변수가 있는 생성자) 기본 생성자를 생성해주지 않는다.
    public _05_Student() {

    }
    public _05_Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    private boolean 쇼츠() {
        return true;
    }
    private boolean 게임() {
        return true;
    }
//    1. 접근제한자 - public (어디서든 접근 가능)
//    2. 리턴 값 - 메소드가 반환하는 타입 (자료형) 원시타입, 참조타입
//    3. 메소드 명 - 메소드의 이름. 기능을 유추할 수 있게끔 네이밍하면 됨
    public void study(int i) {
        쇼츠();
        게임();
        if(쇼츠() && 게임()) {
            System.out.println(i + "시간 공부함!");
        }
    }
    public boolean isAdult() {
        return age >= 18;
    }
}
