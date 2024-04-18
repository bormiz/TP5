/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp5ex2;

/**
 *
 * @author aziz
 */
import java.lang.Math;
public class MathOperations {
    public int calculateFactorial(double num){
        int factorielle=1;
        if (num<0){
            throw new IllegalArgumentException("Factoriel d'un number cannot be négatif");
        }
        return factorielle;
        }
    
    public double calculateSquareRoot(int num){
    if (num<0){
            throw new ArithmeticException("square of a negative number");
                }
    return Math.sqrt(num);
}
}
    

