/*
 * Classname: SwitchOrIfElse
 *
 * Author: Gustavo Silvano
 *
 * Description:
 * Java application for make calculator witch
 * different methods, if/else and switch.
 */

package com.oracle.academy.section5.ex02_switch_or_if_else;

import java.util.Scanner;

public class SwitchOrIfElse{

    public static double IfElse(double x, double y, char operator){
        if (operator == '*'){
            return x * y;
        }
        else if (operator == '+'){
            return x + y;
        }
        else if (operator == '/'){
            return x / y;
        }
        else if (operator == '-'){
            return x - y;
        }
        else if (operator == '%'){
            return x % y;
        }
        else {
            return 0;
        }
    }

    public static double Switch(double x, double y, char operator){
        return switch (operator) {
            case '*' -> x * y;
            case '+' -> x + y;
            case '/' -> x / y;
            case '-' -> x - y;
            case '%' -> x % y;
            default -> 0;
        };
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("=====================");
        System.out.println("  Simple Calculator  ");
        System.out.println("=====================\n");

        System.out.print("Define X value: ");
        double x = scanner.nextDouble();
        System.out.print("\nDefine Y value: ");
        double y = scanner.nextDouble();

        System.out.print("\nDefine Operator(+,-,*,/,%): ");
        char operator = scanner.next().charAt(0);

        double resultIfElse = IfElse(x, y, operator);
        double resultSwitch = Switch(x, y, operator);

        if (resultIfElse == 0 && resultSwitch == 0){
            System.out.println("Wrong Operator!");
        }
        else{
            System.out.printf("%nIf Else Calculator result: %.2f",
                resultIfElse);
            System.out.printf("%nSwitch Calculator result: %.2f",
                resultSwitch);
        }
    }
}