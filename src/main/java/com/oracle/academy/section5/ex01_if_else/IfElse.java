/*
 * Classname: IfElse
 *
 * Author: Gustavo Silvano
 *
 * Description:
 * Java application responsible for different
 * methods of variable comparison.
 */



package com.oracle.academy.section5.ex01_if_else;

import java.util.Scanner;

public class IfElse{
    private int x;

    public static boolean CompareMethod1(int x){
        if (x >= 7){
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean CompareMethod2(int x){
        return x >= 7 ? true : false;
    }

    public static boolean CompareMethod3(int x){
        return x >= 7;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("X value: ");
        int x = scanner.nextInt();

        System.out.println();
        boolean one = CompareMethod1(x);
        System.out.println(one);
        boolean two = CompareMethod2(x);
        System.out.println(two);
        boolean three = CompareMethod3(x);
        System.out.println(three);
    }


}