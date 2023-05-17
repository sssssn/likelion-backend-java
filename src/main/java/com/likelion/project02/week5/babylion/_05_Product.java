package com.likelion.project02.week5.babylion;

public abstract class _05_Product {
//    추상화 - 일반 클래스, 추상 클래스
//    추상 클래스는 객체 생성이 불가, 자식 클래스에게 추상 메소드 구현을 강제한다.
//    추상 클래스는 is-a, 인터페이스는 has-a (~할 수 있는)
    int price;
    boolean power;
    public _05_Product (int price) {
        this.price = price;
    }
    public void power() {
        this.power = !power;
    }
    abstract void print();

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", power=" + power +
                '}';
    }
}
