package Lesson1.P3_Polymorph;

public class Square implements Calculated {

    private double sizeSide;

    public Square(double sizeSide) {
        this.sizeSide = sizeSide;
    }

    @Override
    public double calcPerimetr() {
        return 4*sizeSide;
    }
}
