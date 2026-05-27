/*
 * Classname: Person
 *
 * Date: 27/05/2026
 *
 * Author: Gustavo Silvano
 *
 * Description:
 * Java application responsible for register
 * person age and name in methods and constructors
 */

package com.oracle.academy.section4.ex03_person;

import java.util.Scanner;

public class Person {
    private String personName;
    private int personAge;

    public Person(String name, int age){
         this.personName = name;
        this.personAge = age;
    }

    public String getName(){
        return personName;
    }

    public int getAge(){
        return personAge;
    }

    public static void main(String[] args){
        Person person1 = new Person("Maria", 34);
        Person person2 = new Person("Mario", 43);

        System.out.printf("First Person Name: %s and Age: %d%n",
            person1.getName(),
            person1.getAge());
        System.out.printf("Second Person Name: %s and Age: %d",
                person2.getName(),
                person2.getAge());
    }
}