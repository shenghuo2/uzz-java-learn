package cn.shenghuo2.experiment6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {
        long start, end;
        List<String> arrayList = new ArrayList<String>();
        List<String> linkedList = new LinkedList<String>();

        start = System.currentTimeMillis();
        for (int i = 0; i < 9999; i++) {
            arrayList.add(0, "AI" + i);
        }
        end = System.currentTimeMillis();
        System.out.println("向ArrayList 集合插入9999个对象用时：" + (end - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < 9999; i++) {
            linkedList.add(0, "LI" + i);
        }
        end = System.currentTimeMillis();
        System.out.println("向LinkedList集合插入9999个对象用时：" + (end - start));

    }
}

