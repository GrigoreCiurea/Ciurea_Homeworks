package org.example.homework_nr_7.Part2;

public class Shape {
    public static void main(String[] args) {
        TwoDimensionalShape circle = new Circle(2);
        System.out.println("Area of circle is: " + circle.Area());
        TwoDimensionalShape square = new Square(10);
        System.out.println("Area of square is: " + square.Area());
        ThreeDimensionalShape sphere = new Sphere(4);
        System.out.println("Area of sphere is: " + sphere.calculateArea());
        System.out.println("Volume of sphere is: " + sphere.calculateVolume());
        ThreeDimensionalShape cube = new Cube(5);
        System.out.println("Area of cube is: " + cube.calculateArea());
        System.out.println("Volume of cube is: " + cube.calculateVolume());


    }
}
