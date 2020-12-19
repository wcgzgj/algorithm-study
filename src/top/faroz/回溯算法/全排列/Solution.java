package top.faroz.回溯算法.全排列;

import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName Solution
 * @Description TODO
 * @Author FARO_Z
 * @Date 2020/12/19 下午6:06
 * @Version 1.0
 **/
public class Solution {
    public List<List<Integer>> res = new LinkedList<>();
    //获取全排列过后的值
    public List<List<Integer>>premute(int[] nums) {
        //储存路径（已经经过的位置）
        LinkedList<Integer> track = new LinkedList<>();
        backtrace(track,nums);
        return res;
    }

    //回溯
    public void backtrace(LinkedList<Integer>track,int[] nums) {
        //终止条件
        if (track.size()==nums.length) {
            //这里一定要add重新new的，不然res中，所有的引用都是一样的
            res.add(new LinkedList(track));
            return;
        }
        for (int num : nums) {
            if (track.contains(num)) continue;
            //做选择
            track.add(num);
            //进入下一层决策树
            backtrace(track,nums);
            //取消选择
            track.removeLast();
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int []nums={1,2,3,4};
        List<List<Integer>> premute = solution.premute(nums);
        for (List<Integer> list : premute) {
            System.out.println(list.toString());
        }
    }
}
