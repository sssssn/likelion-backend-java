package com.likelion.project03.week1.day4;

public class PrintfEx {
    public void print() {
        System.out.printf("%s", "Hello\n"); // ����(�ٹٲ�) �ȵǹǷ� \n �ؾߵ�
        System.out.printf("%s", "bye");
    }

    public static void main(String[] args) {
        PrintfEx printfEx = new PrintfEx(); // PrintEx ������!
        printfEx.print(); // printEX ������ ����!
    }
}
