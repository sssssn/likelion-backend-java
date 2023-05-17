package com.likelion.project02.codeup;

/* 문제 1671
광현이와 컴퓨터가 가위바위보 게임을 한다.

가위바위보 게임의 규칙이 다음과 같을때 결과를 출력하시오.

(※ 바위=0, 가위=1, 보=2를 말한다.)

1. 바위(0)는 가위(1)를 이긴다.
2. 가위(1)는 보(2)를 이긴다.
3. 보(2)는 바위(0)를 이긴다.
4. 같은 것을 내면 비긴다.

입출력의 설명을 참고하여 가위바위보 게임의 결과를 출력하시오.

결과는 광현이 중심으로 출력한다.
 */

import java.util.Scanner;

public class Codeup1671 {
    // win, tie, lose
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kwanghyun = scanner.nextInt();
        int computer = scanner.nextInt();

        if (kwanghyun == computer) {
            System.out.println("tie");
        } else if ((kwanghyun == 0 && computer == 1) || (kwanghyun == 1 && computer == 2) || (kwanghyun == 2 && computer == 0)) {
            System.out.println("win");
        } else {
            System.out.println("lose");
        }

        scanner.close();
    }
}