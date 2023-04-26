package com.likelion.project03.week2.babylion;

public class User {
    String name;
    int age;

    String sex;

    public void printAge(){
        System.out.println(age);
    }

    public void printName() {
        System.out.println(name);
    }

    public void isAdult() {
        if(age >= 18) {
            System.out.println("성인이네요!");
        }else {
            System.out.println("아직 애기네요!");
        }
    }
}
