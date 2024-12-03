package cn.shenghuo2.experiment6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AccessingList {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");

        // 第一种遍历方法:按元素的索引号遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // 第二种遍历方法：迭代器遍历
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 第三种遍历方法:forEach循环遍历
//        list.forEach(item -> System.out.println(item));
        for (String i:list){
            System.out.println(i);
        }
    }
}
