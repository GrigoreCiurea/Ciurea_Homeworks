package org.example.homework_nr_3;

public class Circle {
    public static void main(String[] args) {

        Circle circle = new Circle(12);
        circle.calculateArea(circle.radius);
    }

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void calculateArea(double radius) {
        double area = radius * radius * Math.PI;
        System.out.println("A rea equal : " + area);
    }
}