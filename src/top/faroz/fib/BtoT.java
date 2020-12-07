package top.faroz.fib;

/**
 * @ClassName BtoT
 * @Description 斐波那契 自底向上
 * @Author FARO_Z
 * @Date 2020/12/7 下午2:25
 * @Version 1.0
 **/
public class BtoT {
    public static void main(String[] args) {
        int n=20;
        System.out.println(fib(20));
    }

    /**
     * 自底向上，依次计算出上一层的节点
     * 直到计算到最顶层
     * @param n
     * @return
     */
    public static int fib(int n) {
        if (n==0 || n==1) return 1;
        int[] dp = new int[n + 1];
        dp[0]=1;
        dp[1]=1;
        for (int i = 2; i <=n ; i++) {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
