package com.likelion.project02.week5.babylion;

import java.util.Arrays;

public class _02_Store {
    public static void main(String[] args) {
//        getter, setter 사용은 지양하는게 좋다. 특히 setter! 사이드 이펙트 때문에!

//        다형성? 여러 가지 형태를 가질 수 있는 능력
//        오버로딩? 하나의 객체에서 이름이 같은 메소드를 여러 개 정의하여 사용하는 것
//        오버라이딩? 상속을 받은 하위 객체가 상위 객체의 메소드를 새롭게 정의하고 그대로 덮어쓰고
//        상속의 다형성? 부모 타입 변수로 자식 타입 객체를 다루는 것
        _01_Buyer buyer = new _01_Buyer();
        _03_TV tv = new _03_TV(2000);
        _04_Computer computer = new _04_Computer(1000);
        // 업 캐스팅
        // 장점 : 다형적 매개변수 사용 가능, 하나의 배열에 여러 종류의 객체 저장 가능
        _05_Product pTv = new _03_TV(2000);
        pTv.print();
        // 다운 캐스팅
        ((_03_TV) pTv).test();
        buyer.buy(tv);
        buyer.buy(computer);
//        요구사항! 바이어가 구매하면 장바구니로 상품 목록이 생성되어야한다.
//        System.out.println(Arrays.toString(buyer.carts));
        System.out.println(buyer.cartList);
    }
}
