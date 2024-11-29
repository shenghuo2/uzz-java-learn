package cn.shenghuo2.practice6;

import java.util.Objects;
import java.util.TreeSet;

// 11.29 周五 下午78节（换课）
// treeSet
public class TeacherExample11 {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>();
        Student s1 = new Student("zhangsan",1);
        Student s2 = new Student("lisi",2);
        Student s3 = new Student("lisi",2);
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);

        for(Student st:ts){
            System.out.println(st);
        }
    }
}
class Student implements Comparable<Student> {
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
    @Override
    public int compareTo(Student o){
        return this.id - o.id;
    }
}
