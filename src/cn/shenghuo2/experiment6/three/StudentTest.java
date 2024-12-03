package cn.shenghuo2.experiment6.three;

import java.util.ArrayList;

class Student {
    String name;
    int score;

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "姓名: " + name + ", 成绩: " + score;
    }
}

public class StudentTest {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("张三", 78));
        students.add(new Student("李四", 89));

        for (Student student : students) {
            System.out.println(student);
        }
    }
}

