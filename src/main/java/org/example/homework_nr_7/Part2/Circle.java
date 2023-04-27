package org.example.homework_nr_7.Part2;

public class Circle extends TwoDimensionalShape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

       @Override
    public double Area() {
        return Math.PI * Math.pow(radius,2);
    }
}
