package Exp5_Test;

import Exp5.MathFunction;
import java.util.Scanner;

public class test3 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter any decimal number: ");
            double num = sc.nextDouble();
            MathFunction.Floor(num);
            MathFunction.Ceil(num);
            MathFunction.Round(num);
        }
    }

}

/*
 * output:
 * Enter any decimal number: 25.50
 * Floor : 25.0
 * Ceil:26.0
 * Round of :26
 * 
 */