package com.oracle.academy.section5.ex05_paint_room;

public class PaintCalculator{
    private int countSmallBuckets;
    private int countLargeBuckets;
    private double totalPrice;
    private double restArea;

    public PaintCalculator(double wallArea){
       double paintArea = wallArea;

        while (paintArea > 0){
            if (paintArea >= PaintBucket.LARGE.getCovers()){
                countLargeBuckets ++;
                totalPrice += PaintBucket.LARGE.getPrice();
                paintArea -= PaintBucket.LARGE.getCovers();
                continue;
            }
            countSmallBuckets ++;
            totalPrice += PaintBucket.SMALL.getPrice();
            paintArea -= PaintBucket.SMALL.getCovers();
        }

        restArea = - paintArea;
    }

    public int getCountSmall(){
        return countSmallBuckets;
    }

    public int getCountLarge(){
        return countLargeBuckets;
    }

    public double getRestArea(){
        return restArea;
    }

    public double getTotalPrice(){
        return totalPrice;
    }
}