package cn.shenghuo2.practice7;

// 2024.12.5 周四下午 78节
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TeacherExample13 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("/Users/shenghuo2/Downloads/Timna_3eaa044535d9b8d3289899d9f9c00119.zip");
        FileOutputStream fos = new FileOutputStream("target.zip");

        int b;
        long a = System.currentTimeMillis();
        while ((b = fis.read()) != -1) {
            fos.write(b);
        }
        long c = System.currentTimeMillis();
        System.out.println("time used: " + (c - a));
        fis.close();
        fos.close();

    }
}
