package com.likelion.project02.week4.day2;

public class PyramidShapeDrawerTest {
    public static void main(String[] args) {
        ShapeDrawer shapeDrawer = new PyramidShapeDrawer();
        shapeDrawer.printShape(4);

        ShapeDrawer parallelogramSD = new ParallelogramShapeDrawer();
        parallelogramSD.printShape(5);
    }
}
