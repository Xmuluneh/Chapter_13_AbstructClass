package com.company;
import java.util.Date;
public abstract class GeometricObject {
    private String color;
    private boolean filled;
    private Date dateCreated;

    protected GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.dateCreated=new Date();

    }

    protected GeometricObject() {
        dateCreated=new Date();
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
   public abstract  double getArea();

   public abstract double getPerimeter();
   public String toString(){
       return "\tCreated on : "+dateCreated+"\t\n color :"+color+"\t\n Filled :"+filled;
   }

}
