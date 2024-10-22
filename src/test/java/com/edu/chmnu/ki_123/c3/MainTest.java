package com.edu.chmnu.ki_123.c3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void checkCreateNumber1() {
        double[] array = {2.0, 4.5, 4.7, 3.5, 6.8, 3.5, 7.4, 5.3, 5.4, 3.5};

        assertEquals(2, Main.createNumber(array));
    }

    @Test
    void checkCreateNumber2() {
        double[] array = {2.3, 2.6, 2.3, 4.5, 2.6, 4.5, 3.6};

        assertEquals(3, Main.createNumber(array));
    }

    @Test
    void checkCreateNumber3() {
        double[] array = {4.5};

        assertEquals(0, Main.createNumber(array));
    }

    @Test
    void checkCreateNumber4() {
        double[] array = {4.5, 4.6, 7.5, 7.4, 4.4, 4.7, 8.5};

        assertEquals(0, Main.createNumber(array));
    }

    @Test
    void checkCreateNumber5() {
        double[] array = {};

        assertEquals(0, Main.createNumber(array));
    }
}