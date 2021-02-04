package Lesson1.P3_Polymorph;

public class Circle implements Calculated {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcPerimetr() {
        return 2*3.14*radius;
    }
}
