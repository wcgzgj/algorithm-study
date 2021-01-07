package top.faroz.排序算法;

import java.util.Random;

/**
 * @ClassName RandomNumUtil
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/1/7 下午4:29
 * @Version 1.0
 **/
public class RandomNumUtil {
    public static int[] getRandomNum(int n) {
        int[] arr = new int[n];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            arr[i]=r.nextInt(1000);
        }
        return arr;
    }
}
