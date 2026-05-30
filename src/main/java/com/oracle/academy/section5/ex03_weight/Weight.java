/*
 * Classname: Weight
 *
 * Author: Gustavo Silvano
 *
 * Description:
 * Java application responsible to calculate user weight
 * in different planets in solar system.
 */

package com.oracle.academy.section5.ex03_weight;

import java.util.Scanner;

public class Weight{

    public static double Mercury(double weight){
        return weight * 0.38;
    }

    public static double Venus(double weight){
        return weight * 0.91;
    }

    public static double Mars(double weight){
        return weight * 0.38;
    }

    public static double Jupiter(double weight){
        return weight * 2.36;
    }

    public static double Saturn(double weight){
        return weight * 0.92;
    }

    public static double Uranus(double weight){
        return weight * 0.89;
    }

    public static double Neptune(double weight){
        return weight * 1.13;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("====================");
        System.out.println("  PLANETARY WEIGHT  ");
        System.out.println("====================\n");

        System.out.print("Define your weight (in kg): ");
        double weight = scanner.nextDouble();
        System.out.println();

        System.out.println("====================");
        System.out.println("PLANET LIST");
        System.out.println();
        System.out.println("1 - Mercury");
        System.out.println("2 - Venus");
        System.out.println("3 - Mars");
        System.out.println("4 - Jupiter");
        System.out.println("5 - Saturn");
        System.out.println("6 - Uranus");
        System.out.println("7 - Neptune");
        System.out.println("====================");
        System.out.print("Chose a planet number: ");
        int choice = scanner.nextInt();

        double result;
        switch (choice){
            case 1:
                result = Mercury(weight);
                System.out.printf("%nYour weight on Mercury is %.2f kg.",
                    result);
                break;
            case 2:
                result = Venus(weight);
                System.out.printf("%nYour weight on Venus is %.2f kg.",
                        result);
                break;
            case 3:
                result = Mars(weight);
                System.out.printf("%nYour weight on Mars is %.2f kg.",
                        result);
                break;
            case 4:
                result = Jupiter(weight);
                System.out.printf("%nYour weight on Jupiter is %.2f kg.",
                        result);
                break;
            case 5:
                result = Saturn(weight);
                System.out.printf("%nYour weight on Saturn is %.2f kg.",
                        result);
                break;
            case 6:
                result = Uranus(weight);
                System.out.printf("%nYour weight on Uranus is %.2f kg.",
                        result);
                break;
            case 7:
                result = Neptune(weight);
                System.out.printf("%nYour weight on Neptune is %.2f kg.",
                        result);
                break;
            default:
                System.out.printf("%nThe number '%d' isn't a valid number :(",
                    choice);
        }
        scanner.close();
    }
}