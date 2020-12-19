package top.faroz.test;

import java.util.Scanner;
import java.util.Stack;

/**
 * @ClassName BasketMatchTest
 * @Description TODO
 * @Author FARO_Z
 * @Date 2020/12/7 下午3:02
 * @Version 1.0
 **/
public class BasketMatchTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Stack<Pair> stack = getStack(str);
        parseStack(stack);
    }

    public static void parseStack(Stack<Pair> stack) {
        if (stack.size()==0) {
            System.out.println("ok");
            return;
        }
        if (stack.peek().elem.equals("(")) {
            System.out.print("left ");
            while (!stack.isEmpty()) {
                System.out.print(stack.pop().index+" ");
            }
            System.out.println();
            return;
        }
        if (stack.peek().elem.equals(")")) {
            System.out.print("right ");
            while (!stack.isEmpty()) {
                System.out.print(stack.pop().index+" ");
            }
            System.out.println();
            return;
        }
    }

    public static Stack<Pair> getStack(String str) {
        Stack<Pair> stack = new Stack<Pair>();
        int len = str.length();
        for (int i = 0; i < len; i++) {
            if (String.valueOf(str.charAt(i)).equals("(")) {
                stack.push(new Pair("(",i));
            } else if (String.valueOf(str.charAt(i)).equals(")")) {
                if (stack.size()!=0 && stack.peek().elem.equals("(")) {
                    stack.pop();
                } else {
                    stack.push(new Pair(")",i));
                }
            }
        }
        return stack;
    }

    static class Pair {
        public String elem;
        public int index;

        public Pair(String elem, int index) {
            this.elem = elem;
            this.index = index;
        }
    }
}
