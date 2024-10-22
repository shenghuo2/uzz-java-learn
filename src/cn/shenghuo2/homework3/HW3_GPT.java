package cn.shenghuo2.homework3;

//张三 85.5 李四 92
// 2024.10.22 早34节
import java.util.Scanner;

// 定义Student类
class Student {
    // 定义私有属性
    private String name;
    private double score;

    // 无参数构造方法
    public Student() {
    }

    // 带参数构造方法
    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    // getName方法用于获取姓名
    public String getName() {
        return name;
    }

    // setName方法用于设置姓名
    public void setName(String name) {
        this.name = name;
    }

    // getScore方法用于获取成绩
    public double getScore() {
        return score;
    }

    // setScore方法用于设置成绩
    public void setScore(double score) {
        this.score = score;
    }
}

// 测试类Main
public class HW3_GPT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 使用无参数构造方法创建stu1对象
        Student stu1 = new Student();

        // 输入stu1的姓名和成绩
        String name1 = scanner.next();
        double score1 = scanner.nextDouble();
        stu1.setName(name1);
        stu1.setScore(score1);

        // 输入stu2的姓名和成绩，并使用带参数的构造方法创建stu2对象
        String name2 = scanner.next();
        double score2 = scanner.nextDouble();
        Student stu2 = new Student(name2, score2);

        // 输出stu1的姓名和成绩
        System.out.printf("stu1:name=%s,score=%.1f\n", stu1.getName(), stu1.getScore());

        // 输出stu2的姓名和成绩
        System.out.printf("stu2:name=%s,score=%.1f\n", stu2.getName(), stu2.getScore());
    }
}
