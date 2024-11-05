package cn.shenghuo2.homework6.teachercode;
// example code
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, w, h, r;
        String type;
        n = sc.nextInt();
        Shape shapes[] = new Shape[n];

        for (int i = 0; i < shapes.length; i++) {
            sc.nextLine();
            type = sc.nextLine();
            if (type.equals("rect")) {
                w = sc.nextInt();
                h = sc.nextInt();
                shapes[i] = new Rectangle(w, h);
            } else if (type.equals("cir")) {
                r = sc.nextInt();
                shapes[i] = new Circle(r);
            }
        }

        System.out.printf("%.3f\n", sumAllArea(shapes));
        System.out.printf("%.3f\n", sumAllPerimeter(shapes));
    }

    static double sumAllArea(Shape[] s) {
        double totalArea = 0;
        for (int i = 0; i < s.length; i++) {
            totalArea += s[i].getArea();
        }
        return totalArea;
    }

    static double sumAllPerimeter(Shape[] s) {
        double totalArea = 0;
        for (int i = 0; i < s.length; i++) {
            totalArea += s[i].getPerimeter();
        }
        return totalArea;
    }
}

abstract class Shape {
    double PI = 3.14159;
    abstract public double getArea();
    abstract public double getPerimeter();
}

class Circle extends Shape {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * PI * radius;
    }
}

class Rectangle extends Shape {
    double width, heigh;

    public Rectangle(double width, double heigh) {
        this.width = width;
        this.heigh = heigh;
    }

    public double getArea() {
        return width * heigh;
    }

    public double getPerimeter() {
        return (width + heigh) * 2;
    }
}

