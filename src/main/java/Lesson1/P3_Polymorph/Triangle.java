package Lesson1.P3_Polymorph;

public class Triangle implements Calculated {

    private double sizeA;
    private double sizeB;
    private double sizeC;

    public Triangle(double sizeA, double sizeB, double sizeC) {
        this.sizeA = sizeA;
        this.sizeB = sizeB;
        this.sizeC = sizeC;
    }

    @Override
    public double calcPerimetr() {
        return sizeA+sizeB+sizeC;
    }
}
