package com.likelion.project03.week1.day4;

import com.likelion.project03.week1.day3.PrintHello;

public class VariableEx {
    public static void main(String[] args) {
        int iVal; // ���� ����
        iVal = 0; // �ʱ�ȭ_1 (���ʷ� �� ����)

        PrintHello printHello; // ���� ����
        printHello = new PrintHello(); // �ʱ�ȭ_2 (new �ν��Ͻ�ȭ)

        System.out.println(iVal);
        printHello.print();
    }
}
