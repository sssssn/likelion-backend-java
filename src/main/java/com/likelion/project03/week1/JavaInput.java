package com.likelion.project03.week1;

import java.io.IOException;
import java.io.InputStreamReader;
public class JavaInput {
    public void readAChar() throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        System.out.println(is.read());
    }

    public void readTwoChars() throws IOException {

        InputStreamReader is = new InputStreamReader(System.in);
        int asciiCode1 = is.read();
        int asciiCode2 = is.read();

        // soutv!!!
        System.out.println("asciiCode2 = " + asciiCode2);
    }
}
