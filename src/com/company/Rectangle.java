package com.company;
import java.util.Date;
public class Rectangle extends GeometricObject {
    private double width;
    private double height;

    public Rectangle() {
        super();

    }

    public Rectangle(double width, double height) {
        this.height = height;
        this.width = width;

    }
    public Rectangle(String color, boolean filled,double width,double height) {
        super(color, filled);
        this.height = height;
        this.width = width;

    }
    //@Override
    public double getArea() {
        return width * height;
    }
    @Override
    public double getPerimeter(){
        return 2*(height+width);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public String toString(){
      return  "" +super.toString();
    }

}

