package top.faroz.回溯算法.N皇后问题;

/**
 * @ClassName Solution
 * @Description 八皇后问题
 * @Author FARO_Z
 * @Date 2020/12/19 下午6:25
 * @Version 1.0
 **/
public class Solution {
    //获取初始化的八皇后棋谱
    public String[][] getMap(int n) {
        String[][] map = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j]="·";
            }
        }
        return map;
    }

    public void backtrace(String[][] map,int n) {

    }



    public static void main(String[] args) {
        Solution solution = new Solution();
        String[][] map = solution.getMap(8);

        // for (int i = 0; i < 8; i++) {
        //     for (int j = 0; j < 8; j++) {
        //         System.out.print(map[i][j]+" ");
        //     }
        //     System.out.println();
        // }

    }
}
