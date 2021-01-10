package top.faroz.书本外算法.LRU缓存淘汰;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @ClassName LRU
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/1/10 下午2:15
 * @Version 1.0
 **/
public class LRU {
    public static void main(String[] args) {
        int[] random = randomData(30);
        System.out.println("随机数组为：\n"+ Arrays.toString(random));
        System.out.println("===================");
        LRULinkedList list = new LRULinkedList(10);
        for (int i = 0; i < random.length; i++) {
            lru(list,random[i]);
            System.out.println("插入的数据为:"+random[i]);
            System.out.println(list);
        }
    }


    //返回范围在1000以内的指定长度的随机数
    public static int[] randomData(int n) {
        int[] arr = new int[n];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            arr[i]=r.nextInt(10);
        }
        return arr;
    }

    //通过LRU算法，决定数据的去留
    public static void lru(LRULinkedList list,int data) {
        LinkNode node = list.findNode(data);
        if (node!=null) {//如果找到了
            list.delete(node);
        } else {
            if (list.isFull()) {
                list.deleteTail();
            }
        }
        list.addHead(data);
        return;
    }
}
