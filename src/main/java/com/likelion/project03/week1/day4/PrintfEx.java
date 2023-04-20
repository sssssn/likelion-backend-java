package com.likelion.project03.week1.day4;

public class PrintfEx {
    public void print() {
        System.out.printf("%s", "Hello\n"); // °³Çà(ÁÙ¹Ù²Þ) ¾ÈµÇ¹Ç·Î \n ÇØ¾ßµÊ
        System.out.printf("%s", "bye");
    }

    public static void main(String[] args) {
        PrintfEx printfEx = new PrintfEx(); // PrintEx ³ª¿ÍÁà!
        printfEx.print(); // printEX ¹°´ëÆ÷ ½÷Áà!
    }
}
