package cn.shenghuo2.experiment6.five;

import java.util.HashMap;
import java.util.Map;

public class EmployeeTest {

    public static void main(String[] args) {
        Map<String, Integer> employeeSalaries = new HashMap<String, Integer>();

        employeeSalaries.put("张三", 8000);
        employeeSalaries.put("李四", 6000);

        for (Map.Entry<String, Integer> entry : employeeSalaries.entrySet()) {
            System.out.println("姓名: " + entry.getKey() + ", 薪水: " + entry.getValue() + "元");
        }
    }
}

