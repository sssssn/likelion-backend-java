package com.likelion.project02.week7.day2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void checkLeapYear() {
        assertEquals(false, MyUtils.checkLeapYear(1700));
    }

    void testLeapYear() {
        assertEquals(true, MyUtils.isLeapYear(2020));
        assertEquals(false, MyUtils.isLeapYear(1900));
        assertEquals(true, MyUtils.isLeapYear(2400));
    }

    void testis369() {
        assertEquals("*", MyUtils.is369(3));
        assertEquals("", MyUtils.is369(15));
        assertEquals("**", MyUtils.is369(33));
        assertEquals("***", MyUtils.is369(333));
        assertEquals("****", MyUtils.is369(3369));
    }
}