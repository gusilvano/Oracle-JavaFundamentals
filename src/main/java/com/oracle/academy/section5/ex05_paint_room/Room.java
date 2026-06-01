package com.oracle.academy.section5.ex05_paint_room;

public class Room{
    private double roomWidth;
    private double roomLength;
    private double roomHeight;

    public Room(double roomWidth,
                double length,
                double height){
        this.roomWidth = roomWidth;
        this.roomLength = length;
        this.roomHeight = height;
    }

    public double wallArea(){
        return 2 * roomHeight * (roomWidth + roomLength);
    }
}