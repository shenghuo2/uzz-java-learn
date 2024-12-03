package cn.shenghuo2.practice7;

//12.3 周二 早 34 节
import java.io.File;
import java.io.IOException;

public class Example01 {
    public static void main(String[] args) throws IOException {
        File file = new File("demo.txt");
        if (file.exists()) {
            file.delete();
        }else {
            file.createNewFile();
        }
        File file2 = new File("demoDir/demo2.txt");
        if (!(file2.getParentFile().exists())) {
            file2.getParentFile().mkdirs();

        }
        if (file2.exists()) {
            System.out.println(file2.delete());
        }else {
            System.out.println(file2.createNewFile());
        }
    }
}
