package com.company;

public class Main {

    public static void main(String[] args) {
        GeometricObject geometricObject = new Circle(5, "Green", true);
        GeometricObject geometricObject1 = new Rectangle("red", true, 5, 9);
        System.out.println("The rectangle object is :" + geometricObject1.toString());
        System.out.println("The rectangle Area is :" + geometricObject1.getArea());
       System.out.println("The circle object is :" + geometricObject.toString());

        System.out.println();



            

    }
}
