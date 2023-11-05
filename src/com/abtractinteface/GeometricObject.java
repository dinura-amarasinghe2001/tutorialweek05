package com.abtractinteface;

public abstract class GeometricObject {
    protected boolean filled;
    protected String color;

    public GeometricObject(){}
    public  GeometricObject(String color, boolean filled){
        this.color=color;
        this.filled=filled;
    }
    public boolean getFilled(){
        return filled;
    }
    public void setFilled(boolean filled1){
        this.filled=filled1;
    }
    public  String getColor(){
        return  color;
    }
    public  void  setColor(String color1){
        this.color=color1;
    }
    public String toString(){
        return  "Filled ?  "+ getFilled()+ "  color "+ getColor() +" Area "+ getArea()+" Perimeter "+ getPerimeter()+" Shape "+getShape();
    }
    public abstract double getPerimeter();
    public abstract double getArea();
    public abstract  String getShape();



}
