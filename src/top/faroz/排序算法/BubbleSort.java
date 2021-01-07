package top.faroz.排序算法;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @ClassName BubbleSort
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/1/7 下午4:31
 * @Version 1.0
 **/
public class BubbleSort {
    @Test
    public void bubbleSortTest() {
        int[] a = RandomNumUtil.getRandomNum(10);
        System.out.println(Arrays.toString(a));
        bubbleSortVer2(a);
        System.out.println(Arrays.toString(a));
    }

    public void bubbleSort(int []a) {
        int len = a.length;
        if (len==0) return;
        for (int i = 1; i <len ; i++) {
            for (int j = 0; j <len-i; j++) {
                if (a[j]>a[j+1]) {
                    int tmp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=tmp;
                }
            }
        }
    }

    //冒泡排序第二版
    //优化判断时间
    //如果没有元素交换，说明已经排序结束了，直接跳出循环
    public void bubbleSortVer2(int []a) {
        int len = a.length;
        if (len<=1) return;
        for (int i = 1; i < len; i++) {
            boolean isSorted = true;
            for (int j = 0; j < len-i; j++) {
                if (a[j]>a[j+1]) {
                    isSorted=false;
                    int tmp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=tmp;
                }
            }
            //如果不再需要交换了，那就退出循环（说明已经排序完成了）
            if (isSorted) break;;
        }
    }



}
