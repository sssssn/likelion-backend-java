package com.likelion.project03.week2.babylion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _03_JavaInput {
    public void read() throws IOException {
        InputStreamReader is = new InputStreamReader(System.in); // 한 글자씩
        BufferedReader br = new BufferedReader(is); // 여러 글자
        System.out.println(br.readLine());
    }
}