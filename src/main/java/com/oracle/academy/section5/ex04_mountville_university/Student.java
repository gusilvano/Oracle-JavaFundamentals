/*
 * Classname: Student
 *
 * Author: Gustavo Silvano
 *
 * Description:
 * Java application responsible to create
 * object Student to use in Main.java
 */

package com.oracle.academy.section5.ex04_mountville_university;

public class Student{
    private String name;
    private double gpa;
    private int satScore;

    public Student(String name, double gpa, int satScore){
        this.name = name;
        this.gpa = gpa;
        this.satScore = satScore;
    }

    public double getGpa(){
        return gpa;
    }

    public int getSatScore(){
        return satScore;
    }

    public String getName(){
        return name;
    }
}