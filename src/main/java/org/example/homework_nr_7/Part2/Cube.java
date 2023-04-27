package org.example.homework_nr_7.Part2;

public class Cube extends ThreeDimensionalShape {
    private double latura;

    public Cube(double latura) {
        this.latura = latura;
    }

    @Override
    public double calculateArea() {
        return 6 * Math.pow(latura, 2);
    }

    @Override
    public double calculateVolume() {
        return Math.pow(latura, 3);
    }
}
