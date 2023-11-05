package com.abtractinteface;

public class Rectangle extends GeometricObject {
    protected double Length;
    protected double Width;

    public  Rectangle(){}



    public Rectangle(double l,double w){
        this.Length=l;
        this.Width=w;

    }
    public  Rectangle(String color,boolean filled,double l , double w){
        super(color,filled);
        this.Length=l;
        this.Width=w;
        this.color=color;
    }

    public double getLength() {
        return Length;
    }

    public void setLength(double length) {
        Length = length;
    }

    public double getWidth() {
        return Width;
    }

    public void setWidth(double width) {
        Width = width;
    }
    @Override
    public double getPerimeter() {
        return 2*Length+2*Width;
    }

    @Override
    public double getArea() {
        return Length*Width;
    }

    @Override
    public String getShape() {
        return "Rectangle";
    }

    @Override
    public String toString() {
        return super.toString()+"  Length "+getLength()+"  width  "+getWidth();
    }
}
