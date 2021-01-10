package top.faroz.书本外算法.LRU缓存淘汰;

/**
 * @ClassName LinkNode
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/1/10 下午2:07
 * @Version 1.0
 **/
public class LinkNode {
    public int data;
    public LinkNode next;
    public LinkNode pre;

    public LinkNode(int data, LinkNode next, LinkNode pre) {
        this.data = data;
        this.next = next;
        this.pre = pre;
    }

    public LinkNode(int data) {
        this.data = data;
    }

    public LinkNode() {
    }


}
