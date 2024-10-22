package cn.shenghuo2.practice3;
// 2024.10.22 早34节
public class Example01 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.name = "小明";
        s1.read();
        s2.name = "小华";
        s2.read();
    }
}
class Student{
    String name;
    void read(){
        System.out.println("大家好，我是"+name);
    }
}
