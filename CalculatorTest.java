package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5.0, calc.add(2.0, 3.0));
    }

    @Test
    void testSubtract() {
        assertEquals(1.0, calc.subtract(4.0, 3.0));
    }

    @Test
    void testMultiply() {
        assertEquals(12.0, calc.multiply(3.0, 4.0));
    }

    @Test
    void testDivide() {
        assertEquals(2.5, calc.divide(5.0, 2.0));
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calc.divide(10.0, 0));
    }

    @Test
    void testSqrt() throws InvalidInputException {
        assertEquals(4.0, calc.sqrt(16.0));
    }

    @Test
    void testSqrtZero() throws InvalidInputException {
        assertEquals(0.0, calc.sqrt(0.0));
    }

    @Test
    void testSqrtNegative() {
        assertThrows(InvalidInputException.class, () -> calc.sqrt(-9.0));
    }

    @Test
    void testAddNegativeNumbers() {
        assertEquals(-5.0, calc.add(-2.0, -3.0));
    }

    @Test
    void testSubtractNegativeResult() {
        assertEquals(-1.0, calc.subtract(2.0, 3.0));
    }

    @Test
    void testMultiplyByZero() {
        assertEquals(0.0, calc.multiply(5.0, 0.0));
    }

    @Test
    void testDivideNegative() {
        assertEquals(-2.0, calc.divide(-6.0, 3.0));
    }
}

