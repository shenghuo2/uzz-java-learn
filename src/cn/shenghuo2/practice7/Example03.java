package cn.shenghuo2.practice7;

//12.3 周二 早 34 节
import java.io.File;
import java.io.IOException;

public class Example03 {
    public static void main(String[] args) throws IOException {
        File file = new File("src/cn/shenghuo2/practice7/");
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (files != null) {
                for (File f : files) {
                    if (f.isFile()) {
                        System.out.println(f.getName());
                    }
                }
            }
        }else{
            System.out.println("not a directory");
        }
    }
}
