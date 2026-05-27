/*
 * Classname: GalToLit
 *
 * Date: 27/05/2026
 *
 * Author: Gustavo Silvano
 *
 * Description:
 * Java application responsible for converting gallons
 * to liters.
 */

package com.oracle.academy.section4.ex01_gal_to_lit;

import java.util.Scanner;

public class GalToLit {

    private static final double LITERS_PER_GALLON = 3.785;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount of gallons: ");
        int gallons = scanner.nextInt();

        double litersTotal = gallons * LITERS_PER_GALLON;
        System.out.printf("%nTotal litters: %.3f L%n", litersTotal);
    }
}