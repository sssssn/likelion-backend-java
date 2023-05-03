package com.likelion.project03.week2.babylion;

/* User의 이름, 성별, 나이를 입력받아서 지정해주고 출력해보세요.
해당 User가 성인인지 아닌지 판별하는 메소드를 만들고 출력해보세요.
 */

import java.util.Scanner;
public class _10_UserTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름: ");
        String name = sc.next();
        System.out.print("성별: ");
        String sex = sc.next();
        System.out.print("나이: ");
        int age = sc.nextInt();

        _08_User user = new _08_User();
        user.name = name;
        user.age = age;
        user.sex = sex;

        user.printAge();
        user.printName();
        user.isAdult();
    }
}
