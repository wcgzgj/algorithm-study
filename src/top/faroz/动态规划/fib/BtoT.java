package top.faroz.动态规划.fib;

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
        System.out.println(fib(n));
        System.out.println(betterFib(n));
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

    /**
     * 其实不一定需要那么大一个数组来存储内容
     * 只要存储当前状态和之前状态就可以了
     * 这样可以把空间复杂度下降为O(1)
     *
     * 这，可能是斐波那契数列的最优解了
     * @param n
     * @return
     */
    public static int betterFib(int n) {
        if (n==0 || n==1) return 1;
        //  fib(0)  fib(1)
        int pre=1,curr=1;
        //     fib(2) -> fib(n)
        for (int i = 2; i <=n ; i++) {
            int sum = pre + curr;
            pre=curr;
            curr=sum;
        }
        return curr;
    }
}
