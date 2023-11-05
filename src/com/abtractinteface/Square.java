package com.abtractinteface;

public class Square extends GeometricObject {
    protected double side;

    public Square(){}

    public Square(double s){
        this.side=s;
    }
    public  Square(String color,boolean filled,double s){
        super(color,filled);
        this.side=s;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return 4*side;
    }

    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public String getShape() {
        return "square";
    }
    public String toString(){
        return super.toString()+" Side "+ getSide();
    }

}
