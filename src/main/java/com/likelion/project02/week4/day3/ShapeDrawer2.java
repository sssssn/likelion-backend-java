package com.likelion.project02.week4.day3;

public abstract class ShapeDrawer2 {
    public abstract String makeALine(int h, int i);
//    {
//        return String.format("%s%s\n", "0".repeat(h - i), "*".repeat(2 * i - 1));
//    }

    public void printShape(int height) {
        for (int i = 1; i <= height; i++) {
            System.out.printf("%s", makeALine(height, i));
        }
    }
}
