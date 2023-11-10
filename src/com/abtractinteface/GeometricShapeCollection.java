package com.abtractinteface;

import java.util.ArrayList;
import java.util.Scanner;

public class GeometricShapeCollection implements ShapeCollection {
    private ArrayList<GeometricObject> shapeList;
private  int numObjects;

public  GeometricShapeCollection(int ListLength){
    this.numObjects=ListLength;
shapeList = new ArrayList<GeometricObject>();
}
    @Override
    public void addShape(GeometricObject shape) {
        if (shapeList.size() < numObjects){
            shapeList.add(shape);
        }
        else{
            System.out.println("No more space in the list");
        }
    }


    @Override
    public void printShapeList() {
        for(int i=0; i < shapeList.size(); i++){

            if(shapeList.get(i).getShape().equals("Circle")){
                System.out.println("Shape = Circle, Area = " +
                        shapeList.get(i).getArea() + ", Perimeter = " + shapeList.get(i).getPerimeter());
            }
            else if(shapeList.get(i).getShape().equals("Square")){
                System.out.println("Shape = Square, Area = " +
                        shapeList.get(i).getArea() + ", Perimeter = " + shapeList.get(i).getPerimeter());
            }
            else if(shapeList.get(i).getShape().equals("Rectangle")){
                System.out.println("Shape = Rectangle, Area = " +
                        shapeList.get(i).getArea() + ", Perimeter = " + shapeList.get(i).getPerimeter());
            }

    }

}

    @Override
    public boolean runMenu() {
        boolean exit = false;

        System.out.println("To Add a new shape press 1");
        System.out.println("To print the list of the shapes press 2");
        System.out.println("To exit press 3");

        Scanner s = new Scanner(System.in);
        int choise = s.nextInt();
        switch(choise){
            case 1:
                System.out.println("Press 1 if you want to add a Circle");
                System.out.println("Press 2 if you want to add a Rectangle");
                System.out.println("Press 3 if you want to add a Square");

                int choise2 = s.nextInt();
                s.nextLine();

                System.out.println("Enter the color of your shape");
                String colour = s.nextLine();

                System.out.println("Is it filled? (y/n)");
                String isFilled = s.nextLine();
                boolean filled = false;

                if (isFilled.equals("y"))
                    filled = true;
                else if (isFilled.equals("n"))
                    filled = false;
                else
                    System.out.println("Please enter y or n, if the\n" +
                            "                            shape is filled or not respectively");
                switch (choise2){
                    case 1:
                        // it is a circle
                        System.out.println("Insert the radius");
                        double radius = s.nextDouble();
                        Circle c = new Circle(colour, filled, radius);
                        this.addShape(c);
                        break;

                    case 2:
                        System.out.println("Insert the length");
                        double length = s.nextDouble();
                        System.out.println("Insert the width");
                        double Width = s.nextDouble();
                        Rectangle r = new Rectangle(colour,filled,length,Width);
                        this.addShape(r);
                        break;

                    case 3:
                        System.out.println("Insert the side");
                        double side = s.nextDouble();
                        Square sq = new Square(colour,filled,side);
                        this.addShape(sq);
                        break;
                }
                break;

            case 2:

                this.printShapeList();
                break;

            case 3:
                exit = true;
                break;

        }

        return exit;

    }

                }

