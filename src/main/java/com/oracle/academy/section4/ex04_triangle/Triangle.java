/*
 * Classname: Triangle
 *
 * Author: Gustavo Silvano
 *
 * Description:
 * Java application responsible for calculate Triangle area,
 * base or height.
 */

package com.oracle.academy.section4.ex04_triangle;

import java.util.Scanner;

public class Triangle{
    public static double calculateArea(double base, double height){
        return (base * height) / 2;
    }

    public static double calculateBase(double area, double height){
        return (area * 2) / height;
    }

    public static double calculateHeight(double area, double base){
        return (area * 2) / base;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("=======================================");
        System.out.println("  Welcome the TRIANGLE CALCULATOR!!");
        System.out.println("    Set the unknown variable to 0!");
        System.out.println("=======================================");
        System.out.print("Base: ");
        double base = scanner.nextDouble();
        System.out.print("\nHeight: ");
        double height = scanner.nextDouble();
        System.out.print("\nArea: ");
        double area = scanner.nextDouble();

        double result;
        if (area == 0 && base != 0 && height != 0){
            result = calculateArea(base, height);
            System.out.printf("%nTriangle Area: %.2f", result);
        }
        else if (base == 0 && area != 0 && height != 0){
            result = calculateBase(area, height);
            System.out.printf("%nTriangle Base: %.2f ", result);
        }
        else if (height == 0 && area != 0 && base != 0){
            result = calculateHeight(area, base);
            System.out.printf("%nTriangle Height: %.2f ", result);
        }
        else{
            System.out.println("Noting to do :(");
        }

        scanner.close();
    }
}
