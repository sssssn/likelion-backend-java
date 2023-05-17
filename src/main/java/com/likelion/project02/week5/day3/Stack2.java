package com.likelion.project02.week5.day3;

public class Stack2 {

    private int[] arr = new int[10000];
    private int pointer = 0;

    public void push(int value) {
        this.arr[pointer++] = value;
//        System.out.println(Arrays.toString(arr));
//        System.out.println("pointer = " + pointer);;
    }

    public int pop() {
        return this.arr[--pointer];
    }

    public static void main(String[] args) {
        Stack2 st = new Stack2();
        st.push(10);
        st.push(20);
        System.out.println(st.pop());
        System.out.println(st.pop());
    }
}
