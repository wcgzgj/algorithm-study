package top.faroz.test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName FileRecursion
 * @Description TODO
 * @Author FARO_Z
 * @Date 2020/12/20 下午7:05
 * @Version 1.0
 **/
public class FileRecursion {
    public static List<String> files = new ArrayList<>();

    public static void recursion(String path) {
        File f = new File(path);
        if (!f.isDirectory()) {
            files.add(f.getName());
            return;
        }
        String[] list = f.list();
        if (list==null) return;
        for (String s : list) {
            recursion(s);
        }
        System.out.println(f.getName());
    }

    public static List<String> getFileNames(String path) {
        recursion(path);
        return files;
    }

    public static void main(String[] args) {
        String path = "/Users/faro_z/文件/绘图";
        List<String> list = getFileNames(path);
        for (String s : list) {
            System.out.println(s);
        }
    }


}
