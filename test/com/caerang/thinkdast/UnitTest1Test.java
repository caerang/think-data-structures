package com.caerang.thinkdast;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnitTest1Test {
    @Test
    public void test() {
        UnitTest1 test = new UnitTest1();
        int result = test.addNumber(5, 6);
        assertEquals(11, result);
    }
}