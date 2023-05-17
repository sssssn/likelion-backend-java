package com.likelion.project02.week4.day2;

public class MultiplicationTable2 {
    // 멤버 변수 사용
    private String multipleSymbol;

    public MultiplicationTable2(String multipleSymbol) {
        this.multipleSymbol = multipleSymbol;
    }
    public void printDan(int dan) {
        for (int i = 1; i < 9; i++) {
            System.out.printf("%d %s %d = %d\n", dan, multipleSymbol, i, dan * i);
        }
        System.out.println("----------");
    }
    public static void main(String[] args) {
        // 2, 5, 7, 8
        MultiplicationTable2 mt = new MultiplicationTable2("*");
        mt.printDan(2);
        mt.printDan(5);
        MultiplicationTable2 mt2 = new MultiplicationTable2("*");
        mt2.printDan(7);
        mt2.printDan(8);
    }
}
