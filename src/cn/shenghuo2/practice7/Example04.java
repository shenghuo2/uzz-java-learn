package cn.shenghuo2.practice7;

import java.io.File;
import java.io.FilenameFilter;

public class Example04 {
    public static void main(String[] args) throws Exception {
        File file = new File("src/cn/shenghuo2/practice7");
        FilenameFilter ff = new FilenameFilter() {
            // 实现accept 方法
            public boolean accept(File dir, String name) {
                File CurrentFile = new File(dir, name);
                return (CurrentFile.isFile() && name.endsWith(".java"));
            }
        }; //闭合new ff
        if (file.isDirectory()) {
            String[] files = file.list(ff);
            if (files != null) {
                for(String name : files) {
                    System.out.println(name);
                }
            }
        }else {
            System.out.println("not a file");
        }
    }
}
