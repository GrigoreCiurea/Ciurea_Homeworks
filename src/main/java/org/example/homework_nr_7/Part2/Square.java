package org.example.homework_nr_7.Part2;

public class Square extends TwoDimensionalShape{
    private double latura;

    public Square(double latura) {
        this.latura = latura;
    }

    @Override
    public double Area() {
        return Math.pow(latura, 2);
    }
}
