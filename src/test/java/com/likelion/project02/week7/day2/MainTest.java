package com.likelion.project02.week7.day2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void checkLeapYear() {
        assertEquals(false, Main.checkLeapYear(1700));
    }

    void testLeapYear() {
        assertEquals(true, Main.isLeapYear(2020));
        assertEquals(false, Main.isLeapYear(1900));
        assertEquals(true, Main.isLeapYear(2400));
    }

    void testis369() {
        assertEquals("*", Main.is369(3));
        assertEquals("", Main.is369(15));
        assertEquals("**", Main.is369(33));
        assertEquals("***", Main.is369(333));
        assertEquals("****", Main.is369(3369));
    }
}