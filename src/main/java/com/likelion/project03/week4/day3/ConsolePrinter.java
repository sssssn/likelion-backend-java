package com.likelion.project03.week4.day3;

public class ConsolePrinter implements Printer {
    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
