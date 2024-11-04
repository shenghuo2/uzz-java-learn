package cn.shenghuo2.homework5;

import java.util.Scanner;

abstract class Shape {
    double getArea() {
        return 0;
    }
}

class Triangle extends Shape {
    private double side1, side2, side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    double getArea() {
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            double s = (side1 + side2 + side3) / 2;
            return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        } else {
            return 0;
        }
    }
}

class Rectangle extends Shape {
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double getArea() {
        return width * height;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();

        Triangle triangle = new Triangle(a, b, c);
        Rectangle rectangle = new Rectangle(width, height);

        Shape[] shapes = new Shape[2];
        shapes[0] = triangle;
        shapes[1] = rectangle;

        System.out.printf("%.3f\n", shapes[0].getArea());
        System.out.printf("%.3f\n", shapes[1].getArea());
    }
}
