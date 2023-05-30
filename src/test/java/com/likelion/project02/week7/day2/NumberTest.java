package com.likelion.project02.week7.day2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberTest {

    @Test
    void testPrime() {
        assertFalse( CMath.isPrime(1) );
        assertTrue( CMath.isPrime(2) );
        assertTrue( CMath.isPrime(3) );
        assertTrue( CMath.isPrime(7) );
        assertFalse( CMath.isPrime(10) );
    }

    @Test
    void testPerpectionNumber() {
        assertTrue( CMath.isPerpectionNumber(6) );
        assertTrue( CMath.isPerpectionNumber(28) );
        assertFalse( CMath.isPerpectionNumber(100) );
    }

    @Test
    void testFactors() {
        assertEquals("[1, 2, 4, 8]", CMath.factors(16));
    }
}