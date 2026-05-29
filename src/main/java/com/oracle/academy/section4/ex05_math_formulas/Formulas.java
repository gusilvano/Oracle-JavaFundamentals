/*
 * Classname: Formulas
 *
 * Author: Gustavo Silvano
 *
 * Description:
 * Transform the exercises formulas in Java code.
 */

package com.oracle.academy.section4.ex05_math_formulas;

import java.util.Scanner;

public class Formulas{

    public static double aFormula(double x){
        return (Math.sqrt(Math.pow(x,5) - 6)) / 4;
    }

    public static double bFormula(double x, double y){
        return Math.pow(x, y) - Math.pow(6 , x);
    }

    public static double cFormula(double x, double z){
        return 4 * Math.cos(z/5) - Math.sin(Math.pow(x, 2));
    }

    public static double dFormula(double x, double y){
        return Math.pow(x, 4) - Math.sqrt((6 * x) - Math.pow(y, 3));
    }

    public static double eFormula(double x, double y){
        return 1 / (y - (1 / (x - Math.pow(2, y))));
    }

    public static double fFormula(double x){
        return 7 * (Math.cos(Math.sqrt(5 - Math.sin(Math.sqrt((3 * x) - 4)))));
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Set X value: ");
        double x = scanner.nextDouble();
        System.out.print("\nSet Y value: ");
        double y = scanner.nextDouble();
        System.out.print("\nSet Z value: ");
        double z = scanner.nextDouble();

        double a = aFormula(x);
        System.out.printf("%na formula result: %.2f", a);
        double b = bFormula(x, y);
        System.out.printf("%nb formula result: %.2f", b);
        double c = cFormula(x, z);
        System.out.printf("%nc formula result: %.2f", c);
        double d = dFormula(x, y);
        System.out.printf("%nd formula result: %.2f", d);
        double e = eFormula(x, y);
        System.out.printf("%ne formula result: %.2f", e);
        double f = fFormula(x);
        System.out.printf("%nf formula result: %.2f", f);

        scanner.close();
    }
}