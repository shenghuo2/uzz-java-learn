package cn.shenghuo2.homework3.my;
// 2024.10.22 早34节
import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student stu1 = new Student();
        stu1.setName(sc.next());
        stu1.setScore(sc.nextDouble());

        Student stu2 = new Student(sc.next(), sc.nextDouble());

        System.out.printf("stu1:name=%s,score=%.1f\n", stu1.getName(), stu1.getScore());

        System.out.printf("stu2:name=%s,score=%.1f\n", stu2.getName(), stu2.getScore());
    }
}
class Student {
    String name;
    double score;

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }
    public Student() {}

}
