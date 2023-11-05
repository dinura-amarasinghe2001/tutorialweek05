package com.abtractinteface;

public class Circle extends GeometricObject {
    protected double radius;

    public  Circle(){}
    public Circle(double r){
        this.radius=r;
    }
    public Circle(String Color,boolean filled,double r){
        super(Color,filled);
        this.radius=r;
    }
    public double getRadius(){
        return radius;
    }
    public void  setRadius(double radius1){
        this.radius=radius1;
    }
    @Override
    public double getPerimeter() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getArea() {
        return 2*Math.PI*radius;
    }

    @Override
    public String getShape() {
        return "circle";
    }
    public String toString(){
        return super.toString()+" radius is"+ getRadius();
    }
}
