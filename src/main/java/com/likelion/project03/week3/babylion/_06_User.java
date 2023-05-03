package com.likelion.project03.week3.babylion;

public class _06_User {
    String name;
    int age;
    String sex;

    public void printAge(){
        System.out.println(age);
    }

    public void printName() {
        System.out.println(name);
    }

//    public void isAdult() {
//        if(age >= 18) {
//            System.out.println("성인이네요!");
//        }else {
//            System.out.println("아직 애기네요!");
//        };
//    }

    public boolean isAdult() {
        return age >= 18;
    }
}
