package com.likelion.project02.week5.day3;

public class Stack4 {

    private int[] arr = new int[10000];
    private int pointer = 0;

    public void push(int value) {
        this.arr[pointer++] = value;
//        System.out.println(Arrays.toString(arr));
//        System.out.println("pointer = " + pointer);;
    }

    public boolean isEmpty() {
        return this.pointer == 0;
    }
    public int peek() {
        /*
        push(10);
        0 1
        10 0 pointer:1
         */
        if(isEmpty()) throw new RuntimeException("스택이 비었습니다.");
        return this.arr[pointer - 1];
    }

    public static void main(String[] args) {
        Stack4 st = new Stack4();
        st.push(10);
        System.out.println(st.peek());
        System.out.println(st.peek());
        System.out.println(st.peek());
        st.push(20);
        System.out.println(st.peek());
    }
}
