package cn.shenghuo2.exam1;
// 11.21周四下午78节，第一次java考试
/*
按照如下继承关系设计完成各类的设计：
        （1）设计形状类Shape ，包含成员方法 double  getArea()，用来计算形状图形的面积。
        （2）设计三角形类 Triangle，继承自Shape，增加数据成员double a,b,c，代表三角形的三边；在Triangle类中重写getArea()方法，计算三角形面积，当不能构成三角形时，面积为0。
        （3）设计长方形类 Rectangle，继承自Shape，增加数据成员double width,height ，代表长方形的宽和高；在Rectangle类中重写getArea()方法，计算长方形面积。
        （4） 编写主方法，创建一个Shape数组存放一个Triangle对象和一个Rectangle对象，求取它们的面积 并输出它们的面积，先输出三角形面积，再是长方形面积 ，保留3位小数。
        输入样例：
        3 4 5
        8 9
        输出样例
        6.000
        72.000
*/

import java.util.Scanner;

abstract class Shape {
    double getArea() {
        return 0;
    }
}

class Triangle extends Shape {

    private final double side1, side2, side3;
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
    private final double width, height;

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