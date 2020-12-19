package top.faroz.test;

import java.util.Stack;

/**
 * @ClassName StackTest
 * @Description TODO
 * @Author FARO_Z
 * @Date 2020/12/7 下午3:07
 * @Version 1.0
 **/
public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 10; i++) {
            stack.push(i+1);
        }
        System.out.println(stack.size());
        System.out.println(stack.toString());
    }
}
