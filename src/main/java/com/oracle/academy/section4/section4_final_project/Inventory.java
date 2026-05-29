/*
 * Classname: Inventory
 *
 * Author: Gustavo Silvano
 *
 * Description:
 * Java application responsible for a simple product
 * registration in Inventory.
 */

package com.oracle.academy.section4.section4_final_project;

import java.util.Scanner;

public class Inventory{
    private String productName;
    private double productPrice;
    private int productInStock;
    private int productNumber;

    public Inventory(String name, double price, int stock, int number){
        this.productName = name;
        this.productPrice = price;
        this.productInStock = stock;
        this.productNumber = number;
    }

    public String showName(){
        return productName;
    }

    public double showPrice(){
        return productPrice;
    }

    public int showInStock(){
        return productInStock;
    }

    public int showNumber(){
        return productNumber;
    }

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("============================");
        System.out.println("   INVENTORY REGISTRATION   ");
        System.out.println("============================");

        System.out.print("\nProduct name: ");
        String name = scanner.nextLine();
        System.out.print("Product price: ");
        double price = scanner.nextDouble();
        System.out.print("Total in Stock: ");
        int stock = scanner.nextInt();
        int number = 3;


        Inventory product1 = new Inventory(
                "Mouse",
                43.23,
                234,
                1);

        Inventory product2 = new Inventory(
                "CPU",
                232.10,
                21,
                2);

        Inventory productUser = new Inventory(
            name,
            price,
            stock,
            number);

        System.out.println("\n============================");
        System.out.println("       FINAL INVENTORY    ");
        System.out.println("============================");

        System.out.printf("%n%d Name: %s, Price: $ %.2f, Stock: %d",
            product1.showNumber(),
            product1.showName(),
            product1.showPrice(),
            product1.showInStock());

        System.out.printf("%n%d Name: %s, Price: $ %.2f, Stock: %d",
                product2.showNumber(),
                product2.showName(),
                product2.showPrice(),
                product2.showInStock());

        System.out.printf("%n%d Name: %s, Price: $ %.2f, Stock: %d",
                productUser.showNumber(),
                productUser.showName(),
                productUser.showPrice(),
                productUser.showInStock());

        scanner.close();
    }
}