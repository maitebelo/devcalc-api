package com.devcalc.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    void testAdd() {
        assertEquals(15.0, calculatorService.add(10.0, 5.0));
        assertEquals(0.0, calculatorService.add(-5.0, 5.0));
        assertEquals(-10.0, calculatorService.add(-5.0, -5.0));
    }

    @Test
    void testSubtract() {
        assertEquals(5.0, calculatorService.subtract(10.0, 5.0));
        assertEquals(-10.0, calculatorService.subtract(-5.0, 5.0));
        assertEquals(0.0, calculatorService.subtract(-5.0, -5.0));
    }

    @Test
    void testMultiply() {
        assertEquals(50.0, calculatorService.multiply(10.0, 5.0));
        assertEquals(-25.0, calculatorService.multiply(-5.0, 5.0));
        assertEquals(25.0, calculatorService.multiply(-5.0, -5.0));
    }

    @Test
    void testDivide() {
        assertEquals(2.0, calculatorService.divide(10.0, 5.0));
        assertEquals(-1.0, calculatorService.divide(-5.0, 5.0));
        assertEquals(1.0, calculatorService.divide(-5.0, -5.0));
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calculatorService.divide(10.0, 0.0));
    }

    @Test
    void testSquareRoot() {
        assertEquals(4.0, calculatorService.squareRoot(16.0));
        assertEquals(0.0, calculatorService.squareRoot(0.0));
        assertEquals(1.4142135623730951, calculatorService.squareRoot(2.0));
    }

}