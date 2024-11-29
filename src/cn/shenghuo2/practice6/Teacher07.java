package cn.shenghuo2.practice6;

import java.util.HashSet;

// 11.29 周五 下午78节（换课）
// hashSet
public class Teacher07 {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add("aa");
        hs.add("bb");
        hs.add("aa");
        hs.add(12);
        for(Object o : hs) {
            System.out.println(o);
        }
    }
}
