package leetcode;

import java.util.Arrays;

/**
 * 缺失数字
 *
 * @author : FFFro
 * @date : 2019-12-26 22:58
 **/
public class q65 {

    public int missingNumber(int[] nums) {
        int sum = (nums.length + 1) * nums.length / 2;
        int temp = 0;
        for (int num : nums) {
            temp += num;
        }

        return sum - temp;
    }
}

//给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。
//
//        示例 1:
//
//        输入: [3,0,1]
//        输出: 2
//        示例 2:
//
//        输入: [9,6,4,2,3,5,7,0,1]
//        输出: 8
//        说明:
//        你的算法应具有线性时间复杂度。你能否仅使用额外常数空间来实现?

