package top.faroz.fib;

/**
 * @ClassName TtoB
 * @Description 斐波那契 自顶向下
 * @Author FARO_Z
 * @Date 2020/12/7 下午2:22
 * @Version 1.0
 **/
public class TtoB {
    public static void main(String[] args) {
        int n=20;
        System.out.println(fib(n));
    }
    public static int fib(int n) {
        //记录计算过的节点
        int[] memo = new int[n + 1];
        return fibRecursion(n,memo);
    }

    public static int fibRecursion(int n,int[]memo) {
        if (n==0 || n==1) return 1;
        //如果之前计算过 fib(n)的值，就不再重复计算
        if (memo[n]!=0) return memo[n];
        //如果没有计算过，就算一遍fib(n)的值
        memo[n]=fibRecursion(n-1, memo)+fibRecursion(n-2,memo);
        return memo[n];
    }
}
