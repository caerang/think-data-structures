package com.caerang.thinkdast;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


class ListClientExampleTest {
    @Test
    public void testListClientExample() {
        ListClientExample lce = new ListClientExample();
        List list = lce.getList();
        assertTrue(list instanceof LinkedList);
    }
}