package com.likelion.project03.week2.day3;

public class LikeAccumulate {
    public static void main(String[] args) {
        int likeCount = 0;

        likeCount = likeCount + 1;
        System.out.println(likeCount); // 좋아요를 한 개만 받은 경우

        likeCount = likeCount + 1; // 좋아요를 한 개 더 받은 경우
        System.out.println(likeCount);

        likeCount = likeCount - 1; // 좋아요를 취소한 경우
        System.out.println(likeCount);

        int myAccount = 1_000_000;

        myAccount = myAccount - 500_000;
        System.out.println(myAccount);

        myAccount = myAccount + 4_000_000;
        System.out.println(myAccount);
    }
}
