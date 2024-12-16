package com.example.testgeneration;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    final Calculator c = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(5, c.add(3, 2));
    }

    @Test
    public void testMultiply() {
        // TODO: Implement test for multiply
        assertEquals(6, c.multiply(3, 2));
    }

    @Test
    public void testSubtract() {
        // TODO: Implement test for subtract
        assertEquals(1, c.subtract(3, 2));
    }

    @Test
    public void testDivide() {
        // TODO: Implement test for divide
        assertEquals(2, c.subtract(4, 2));
    }
}

