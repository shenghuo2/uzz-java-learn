package cn.shenghuo2.practice6;

import java.util.TreeSet;

// 11.29 周五 下午78节（换课）
// treeSet
public class TeacherExample11 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<Integer>();
        ts.add(1);
        ts.add(5);
        ts.add(3);
        ts.add(1);
        for(int x:ts){
            System.out.println(x);
        }
    }
}
