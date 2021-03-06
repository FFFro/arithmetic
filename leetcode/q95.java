package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 找到所有数组中消失的数字
 * @author : FFFro
 * @date : 2020-02-07 22:19
 **/
public class q95 {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int temp = Math.abs(nums[i]) - 1;
            if (nums[temp] > 0) {
                nums[temp] *= -1;
            }
        }

        List<Integer> res = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (nums[i - 1] > 0) {
                res.add(i);
            }
        }

        return res;
    }
}

//给定一个范围在  1 ≤ a[i] ≤ n ( n = 数组大小 ) 的 整型数组，数组中的元素一些出现了两次，另一些只出现一次。
//
//        找到所有在 [1, n] 范围之间没有出现在数组中的数字。
//
//        您能在不使用额外空间且时间复杂度为O(n)的情况下完成这个任务吗? 你可以假定返回的数组不算在额外空间内。
//
//        示例:
//
//        输入:
//        [4,3,2,7,8,2,3,1]

//         0  -1 -2 -3        -6 -7
//
//        输出:
//        [5,6]
