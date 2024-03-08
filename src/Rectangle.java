import java.util.Scanner;

public class Rectangle {
    private double side1;
    private double side2;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public double areaCalculator() {
        return (side1*side2);
    }

    public double perimeterCalculator() {
        return (side1+side2)*2;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side1 : ");
        double side1 = scanner.nextDouble();

        System.out.println("Enter side2 : ");
        double side2 = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(side1, side2);

        double area = rectangle.areaCalculator();
        double perimeter = rectangle.perimeterCalculator();

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);

    }

}