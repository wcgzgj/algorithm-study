package top.faroz.书本外算法.LRU缓存淘汰;

import com.sun.org.apache.bcel.internal.classfile.PMGClass;

/**
 * @ClassName LRULinkedList
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/1/10 下午2:08
 * @Version 1.0
 **/
public class LRULinkedList {
    public int size;//指定LRU缓存大小
    public LinkNode head;
    public int currentSize;

    //必须指定链表长度
    public LRULinkedList(int size) {
        this.size = size;
    }

    public void addHead(int data) {
        LinkNode node = new LinkNode(data);
        if (head==null) {
            head=node;
        } else {
            node.next=head;
            head.pre=node;
            head=node;
        }
        return;
    }

    public void addTail(int data) {
        LinkNode tail=head;
        LinkNode node = new LinkNode(data);
        if (tail==null) {
            head=node;
        } else {
            while (tail.next!=null) tail=tail.next;
            tail.next=node;
            node.pre=tail;
        }
        return;
    }

    public boolean isFull() {
        if (currentSize==size) return true;
        return false;
    }

    public LinkNode findNode(int data) {
        LinkNode tmp = this.head;
        if (tmp==null) return null;
        while (tmp!=null) {
            if (tmp.data==data) return tmp;
            tmp=tmp.next;
        }
        return null;
    }

    public void delete(LinkNode node) {
        if (node.next==null) {
            //java因为没法像c/c++一样随意操作内存
            //所以，只能这样，然后等待GC回收
            if (node.pre==null) {//如果只有node一个节点 即node==head
                head=null;
             } else {
                node.pre.next=null;
                node.pre=null;
            }
        } else if (node.pre==null){//即node==head
            if (node.next==null) {
                head=null;
            } else {
                head=node.next;
                node.next=null;
                head.pre=null;
            }
        } else {
            node.pre.next=node.next;
            node.next.pre=node.pre;
        }
    }

    public void deleteTail() {
        LinkNode tmp = this.head;
        while (tmp.next!=null) tmp=tmp.next;
        if (tmp==head) {
            head=null;
        } else {
            tmp.pre.next=null;
            tmp.pre=null;
        }
        return;
    }

    @Override
    public String toString() {
        String pool = "";
        if (head==null) return pool;
        LinkNode tmp = this.head;
        while (tmp.next!=null) {
            pool+=tmp.data+" -> ";
            tmp=tmp.next;
        }
        pool+=tmp.data;
        return pool;
    }
}
