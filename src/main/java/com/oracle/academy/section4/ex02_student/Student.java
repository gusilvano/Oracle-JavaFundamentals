/*
 * Classname: Student
 *
 * Date: 27/05/2026
 *
 * Author: Gustavo Silvano
 *
 * Description:
 *
 * Java application responsible for student
 * information.
 */

package com.oracle.academy.section4.ex02_student;

public class Student {

    private String fName;
    private String lName;
    private int stuId;
    private boolean stuStatus;

   public static void main(String[] args){
       Student student = new Student();

       student.fName = "Lisa";
       student.lName = "Palombo";
       student.stuId = 123456789;
       student.stuStatus = true;

       System.out.printf("%nStudent Name: %s %s%n",
            student.fName,
            student.lName);
       System.out.println("Student ID: " + student.stuId);
       System.out.println("Student Status: " + student.stuStatus);
   }
}