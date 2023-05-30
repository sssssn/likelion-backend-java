package com.likelion.project02.week7.day2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void checkLeapYear() {
        assertEquals(false, Main.checkLeapYear(1700));
    }
}