package cn.shenghuo2.homework6;

import java.util.Scanner;

// 抽象类Shape，定义计算周长和面积的抽象方法
abstract class Shape {
    public abstract double getPerimeter();
    public abstract double getArea();
}

// 子类Rectangle，继承Shape
class Rectangle extends Shape {
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

// 子类Circle，继承Shape
class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// 测试类
public class ShapeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.print("输入形状数量：");
        int n = scanner.nextInt();  // 输入形状的数量
        scanner.nextLine();  // 消耗换行符

        Shape[] shapes = new Shape[n];

        // 循环输入形状
        for (int i = 0; i < n; i++) {
//            System.out.print("输入形状类型(rect或cir)：");
            String type = scanner.nextLine();
            if (type.equals("rect")) {
//                System.out.print("输入矩形的宽和高：");
                double width = scanner.nextDouble();
                double height = scanner.nextDouble();
                shapes[i] = new Rectangle(width, height);
                scanner.nextLine();  // 消耗换行符
            } else if (type.equals("cir")) {
//                System.out.print("输入圆的半径：");
                int radius = scanner.nextInt();
                shapes[i] = new Circle(radius);
                scanner.nextLine();  // 消耗换行符
            }
        }

        // 计算所有形状的面积之和和周长之和
        double totalArea = sumAllArea(shapes);
        double totalPerimeter = sumAllPerimeter(shapes);

        // 输出结果，保留三位小数
        System.out.printf("%.3f\n", totalArea);
        System.out.printf("%.3f\n", totalPerimeter);

        scanner.close();
    }

    // 计算所有形状的面积总和
    public static double sumAllArea(Shape[] shapes) {
        double sum = 0;
        for (Shape shape : shapes) {
            sum += shape.getArea();
        }
        return sum;
    }

    // 计算所有形状的周长总和
    public static double sumAllPerimeter(Shape[] shapes) {
        double sum = 0;
        for (Shape shape : shapes) {
            sum += shape.getPerimeter();
        }
        return sum;
    }
}
