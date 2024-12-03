package cn.shenghuo2.experiment7;
// 1、	文件的基本操作：遍历指定目录下所有扩展名为“.docx”的文件。
import java.io.File;

public class FileTraversal {
    public static void main(String[] args) {
        File folder = new File("src/cn/shenghuo2/experiment7");
        System.out.println(folder.exists());
        File[] files = folder.listFiles((dir, name) -> name.endsWith(".java"));
            for (File file : files) {
                System.out.println(file.getName());
            }
        }
    }

