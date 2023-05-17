package com.likelion.project02.week5.babylion;

import java.util.ArrayList;
import java.util.List;

public class _01_Buyer {
//    캡슐화? 객체의 내부 구조 및 데이터를 캡슐처럼 감싸 외부에서 직접 볼 수 없도록 은닉하거나 보호하는 것
//    클래스 내부에 변수, 메소드 만들거나 접근 제어자를 지정하면 된다.
    private int money = 10000;
//    상품이 들어가는 카트 배열
    _05_Product[] carts = new _05_Product[5];
    List<_05_Product> cartList = new ArrayList<>();
    int i = 0;

    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        if(money > 0) {
            this.money = money;
        }
    }
    public void buy(_05_Product product) {
        if(money >= product.price) {
            money -= product.price;
//            carts[i++] = product;
            cartList.add(product);
        }
        System.out.println(money);
    }
}
