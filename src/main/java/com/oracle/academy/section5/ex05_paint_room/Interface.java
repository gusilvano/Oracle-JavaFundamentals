package com.oracle.academy.section5.ex05_paint_room;

import java.util.Scanner;

public class Interface{

    public void showHeader(){
        System.out.println("======================");
        System.out.println("     PAINT BUCKET");
        System.out.println("      CALCULATOR");
        System.out.println("======================");
        System.out.println();
    }

    public Room readRoom(Scanner scanner){
        System.out.println("DEFINE ROOM DIMENSIONS");
        System.out.print("Width: ");
        double width = scanner.nextDouble();
        System.out.print("Length: ");
        double length = scanner.nextDouble();
        System.out.print("Height: ");
        double height = scanner.nextDouble();

        return new Room(width, length, height);
    }

    public void showResult(PaintCalculator calculator){
        System.out.println("\n\nYou needed:");
        System.out.printf("%d Large Buckets%n",
                calculator.getCountLarge());
        System.out.printf("%d Small Buckets%n",
                calculator.getCountSmall());
        System.out.println("-----------------------------");
        System.out.printf("Total Price: $%.2f%n",
                calculator.getTotalPrice());
        System.out.printf("Rest in buckets: %.2f m²%n",
                calculator.getRestArea());
    }
}