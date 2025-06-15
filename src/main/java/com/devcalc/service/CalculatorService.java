package com.devcalc.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    /**
    * Serviço que implementa operações matemáticas básicas:
    * - Adição
    * - Subtração
    * - Multiplicação
    * - Divisão
    * Este serviço é utilizado pelo CalculatorController para expor os endpoints da API
    */
    public double add(double a, double b) {
        return a + b;
    }
    
    public double subtract(double a, double b) {
        return a - b;
    }
    
    public double multiply(double a, double b) {
        return a * b;
    }
    
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida!");
        }
        return a / b;
    }
 
    public double average(double a, double b) {
        return (a + b) / 2;
    }
} 
