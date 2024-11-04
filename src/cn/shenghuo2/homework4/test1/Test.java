package cn.shenghuo2.homework4.test1;

class A{

    static int a1;

    int a2;

}

public class Test{

    public static void main(String[] args){

        A t1=new A();

        t1.a1=4;

        t1.a2=5;

        A t2=new A();

        t2.a1=6;

        t2.a2=7;

        System.out.println(t1.a1+","+t1.a2);

        System.out.println(t2.a1+","+t2.a2);

    }

}