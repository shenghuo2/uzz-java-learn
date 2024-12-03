package cn.shenghuo2.experiment6.four;

import java.util.HashSet;
import java.util.Set;

class Student {
    String name;
    int score;

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return score == student.score && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return 31 * name.hashCode() + score;
    }

    @Override
    public String toString() {
        return "姓名: " + name + ", 成绩: " + score;
    }
}

public class StudentTest {

    public static void main(String[] args) {
        Set<Student> students = new HashSet<Student>();
        students.add(new Student("张三", 78));
        students.add(new Student("李四", 89));

        for (Student student : students) {
            System.out.println(student);
        }
    }
}

