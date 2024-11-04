package cn.shenghuo2.practice3.teacher02;

public class test {
    public static void main(String[] args) {
        Student s1,s2;
        Student[] stu = new Student[55];
        stu[0] = new Student();
        Student s3 = new Student();
        s1 = new Student("zhang san",18);
        System.out.println("s1 name:"+ s1.getName());
        s1.setName("zhang si");
        System.out.println("s1 name:"+ s1.getName());
        s1.setAge(18);
        System.out.println("s1 age:"+ s1.getAge());
        s1.setAge(s1.getAge()+1);
        System.out.println("s1 age:"+ s1.getAge());
    }
}
