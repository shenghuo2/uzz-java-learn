package cn.shenghuo2.practice6;

import java.util.HashSet;

// 11.29 周五 下午78节（换课）
// hashSet
public class Teacher07 {
    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<Student>();
        Student s1 = new Student("zhangsan",1);
        Student s2 = new Student("lisi",2);
        Student s3 = new Student("lisi",2);
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        for (Student student : hs) {
            System.out.println(student);
        }
    }
}
class Student{
    String name;
    int id;

    public Student(String name, int id) {
        super();
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return id + ":" + name;
    }
}