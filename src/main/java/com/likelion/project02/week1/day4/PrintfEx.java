package com.likelion.project02.week1.day4;

public class PrintfEx {
    public void print() {
        System.out.printf("%s", "Hello\n"); // 개행(줄바꿈) 안되므로 \n
        System.out.printf("%s", "bye");
    }

    public static void main(String[] args) {
        PrintfEx printfEx = new PrintfEx(); // PrintEx 나와줘!
        printfEx.print(); // printEX 물대포 쏴줘!
    }
}
