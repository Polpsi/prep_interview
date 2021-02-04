package Lesson1.P3_Polymorph;

public class main {
    public static void main(String[] args) {

        Circle circle = new Circle(12);
        Triangle triangle = new Triangle(12,33,14);
        Square square = new Square(6);

        System.out.println(circle.calcPerimetr());
        System.out.println(triangle.calcPerimetr());
        System.out.println(square.calcPerimetr());
    }
}
