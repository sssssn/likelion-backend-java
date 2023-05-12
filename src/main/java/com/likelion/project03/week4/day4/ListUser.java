package com.likelion.project03.week4.day4;

import java.util.ArrayList;
import java.util.List;

public class ListUser {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        User user1 = new User("선녀", "010-1234-1234", 30);
        users.add(user1);

        User user2 = new User("두부", "010-1234-1235", 16);
        users.add(user2);

        for (User user : users) {
            System.out.printf("%s님의 전화번호는 %s입니다.\n", user.getName(), user.getPhoneNumber());
        }
    }
}
