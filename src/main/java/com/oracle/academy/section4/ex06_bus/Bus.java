/*
 * Classname: Buss
 *
 * Author: Gustavo Silvano
 *
 * Description:
 * Java application for solve this problem - bus holds
 * 45 people, and the school will only use a bus if
 * they can fill it completely. The rest will ride
 * in vans.
 */
package com.oracle.academy.section4.ex06_bus;

import java.util.Scanner;

public class Bus{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Students total: ");
        int student = scanner.nextInt();
        int bus = 0;
        while (student >= 45){
            student -= 45;
            bus += 1;
        }
        int studentInVan = student;

        System.out.printf("%nWe have %d buses and %d students in vans.",
            bus,
            studentInVan);
    }
}