package com.oracle.academy.section5.ex05_paint_room;

public class PaintBucket{
    private double bucketPrice;
    private double bucketCovers;

    private PaintBucket(double bucketPrice, double bucketCovers){
        this.bucketPrice = bucketPrice;
        this.bucketCovers = bucketCovers;
    }

    public double getPrice(){
        return bucketPrice;
    }

    public double getCovers(){
        return bucketCovers;
    }

    public static final PaintBucket SMALL = new PaintBucket(4,30);
    public static final PaintBucket LARGE = new PaintBucket(15,150);
}