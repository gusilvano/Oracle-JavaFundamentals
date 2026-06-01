package com.oracle.academy.section5.ex05_paint_room;

import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Interface hud = new Interface();

        hud.showHeader();

        Room room = hud.readRoom(scanner);

        PaintCalculator calculator =
            new PaintCalculator(room.wallArea());

        hud.showResult(calculator);
        scanner.close();
    }
}