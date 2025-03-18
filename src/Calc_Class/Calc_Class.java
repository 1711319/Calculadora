/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calc_Class;

/**
 *
 * @author 1711319
 */
public class Calc_Class {
    public static double soma(double a, double b) {
        return a + b;
    }

    public static double subtrai(double a, double b) {
        return a - b;
    }

    public static double multiplica(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) throws ArithmeticException {
        if (b == 0) throw new ArithmeticException("Divisão por zero!");
        return a / b;
    }
}