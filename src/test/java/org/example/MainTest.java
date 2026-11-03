package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    Main c = new Main();

    @Test
    public void testAddition() {
        assertEquals(30.0, c.add(10, 20));
    }

    @Test
    public void testSubtraction() {
        assertEquals(10.0, c.subtract(20, 10));
    }

    @Test
    public void testMultiplication() {
        assertEquals(200.0, c.multiply(10, 20));
    }

    @Test
    public void testDivision() {
        assertEquals(2.0, c.divide(20, 10));
    }

    @Test
    public void testDivisionByZero() {
        assertThrows(ArithmeticException.class,
                () -> c.divide(10, 0));
    }

    @Test
    public void testAdditionWithNegativeNumbers() {
        assertEquals(-10.0, c.add(-20, 10));
    }
}
