package cn.shenghuo2.practice6;

import java.util.HashMap;
import java.util.Set;

public class TeacherExample14 {
    public static void main(String[] args) {
        HashMap hm = new HashMap<>();
        hm.put("zhangsan",90);
        hm.put("lisi",100);
        hm.put("wangwu",80);
        hm.put("zhangsan",95);
        System.out.println(hm);

        Set s = hm.keySet();
        for(Object o : s) {
            Object v = hm.get(o);
            System.out.println(o+":"+ v );
        }

    }
}
