package com.likelion.project03.week1.day5;

public class Point {
    int x;
    int y;

    boolean isSameXy() {
        // x와 y가 같니?
        return x == y;
    }

    public static void main(String[] args) {
        Point p = new Point();
        System.out.println(p.x);
    }
}
