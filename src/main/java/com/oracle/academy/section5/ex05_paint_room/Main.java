package com.oracle.academy.section5.ex05_paint_room;

import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ConsoleUI ui = new ConsoleUI();

        ui.showHeader();

        Room room = ui.readRoom(scanner);

        PaintCalculator calculator =
            new PaintCalculator(room.wallArea());

        ui.showResult(calculator);
        scanner.close();
    }
}