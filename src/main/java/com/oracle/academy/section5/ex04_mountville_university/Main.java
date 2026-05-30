/*
 * Classname: Main
 *
 * Author: Gustavo Silvano
 *
 * Description:
 * Java application responsible to use object student
 * and defines approved or reproved for University
 */

package com.oracle.academy.section5.ex04_mountville_university;

import java.util.Scanner;

public class Main {

    public static boolean isAproved(Student student){
        return (student.getGpa() >= 4.0
            && student.getSatScore() >= 1100)
        || (student.getGpa() >= 3.5
            && student.getSatScore() >= 1300)
        || (student.getGpa() >= 3.0
            && student.getSatScore() >= 1500);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("=========================");
        System.out.println("        Welcome to:      ");
        System.out.println("  Mountville University  ");
        System.out.println("      Approve system     ");
        System.out.println("=========================");
        System.out.println();

        System.out.println("- STUDENT INFO - ");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("\nGPA: ");
        double gpa = scanner.nextDouble();
        System.out.print("\nSAT Score: ");
        int satScore = scanner.nextInt();
        System.out.println();

        Student student = new Student(name, gpa, satScore);

        System.out.println("=========================");
        if (isAproved(student)){
            System.out.printf("%n %s is Approved!!!",
                student.getName());
            System.out.println("Congratulations!");
        }
        else {
            System.out.printf("%n %s is Reproved!",
                    student.getName());
            System.out.println("Good luck in next time.");
        }
        System.out.println("=========================");
        scanner.close();
    }
}