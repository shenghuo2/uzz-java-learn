package cn.shenghuo2.homework5;
import java.util.Scanner;

// 抽象形状类
abstract class Shape {
    public abstract double getPerimeter();
    public abstract double getArea();
}

// 矩形类
class Rectangle extends Shape {
    private double width;
    private double height;

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

// 圆形类
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

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 读取形状数量
        int n = scanner.nextInt();

        // 创建数组存储不同形状
        Shape[] shapes = new Shape[n];

        // 读取每个形状
        for (int i = 0; i < n; i++) {
            String type = scanner.next(); // 读取形状类型（rect 或 cir）
            if ("rect".equals(type)) {
                // 读取矩形的宽和高
                double width = scanner.nextDouble();
                double height = scanner.nextDouble();
                shapes[i] = new Rectangle(width, height);
            } else if ("cir".equals(type)) {
                // 读取圆形的半径
                int radius = scanner.nextInt();
                shapes[i] = new Circle(radius);
            }
        }

        // 计算总面积和总周长
        double areaSum = 0;
        double perimeterSum = 0;
        for (Shape shape : shapes) {
            areaSum += shape.getArea();
            perimeterSum += shape.getPerimeter();
        }

        // 输出结果，保留三位小数
        System.out.printf("%.3f\n", areaSum);
        System.out.printf("%.3f\n", perimeterSum);

        scanner.close();
    }
}
