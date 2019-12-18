package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

/**
 * 存在重复元素 II
 *
 * @author : FFFro
 * @date : 2019-12-18 22:17
 **/
public class q53 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.isEmpty()) {
                map.put(nums[i], i);
                continue;
            }
            if (map.containsKey(nums[i])) {
                Integer temp = map.get(nums[i]);
                if (i - temp > k) {
                    map.put(nums[i], i);
                } else {
                    return true;
                }
            } else {
                map.put(nums[i], i);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        q53 a = new q53();
        int[] nums = {1, 2, 3, 1, 2, 3};
        int k = 2;
        a.containsNearbyDuplicate(nums, k);
    }
}
//
//给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，使得 nums [i] = nums [j]，并且 i 和 j 的差的绝对值最大为 k。
//
//        示例 1:
//
//        输入: nums = [1,2,3,1], k = 3
//        输出: true
//        示例 2:
//
//        输入: nums = [1,0,1,1], k = 1
//        输出: true
//        示例 3:
//
//        输入: nums = [1,2,3,1,2,3], k = 2
//        输出: false
