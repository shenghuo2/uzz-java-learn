package cn.shenghuo2.practice3.teacher01;
// 2024.10.22 早34节
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int a,b;
        Scanner sc;
        Student s1;
        sc = new Scanner(System.in);
        s1 = new Student();
//        a=sc.nextInt();
        b=5;
        System.out.println("请输入姓名 年龄：");
        s1.name=sc.next();
        s1.age=sc.nextInt();
        s1.selfIntroduction();
        Student s2 = s1;

    }
}
