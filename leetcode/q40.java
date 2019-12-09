package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 多数元素
 */
public class q40 {

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        int max = Integer.MIN_VALUE;
        int res = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                res = entry.getKey();
                max = entry.getValue();
            }
        }
        return res;
    }

    public int demo(int[] nums) {
        int count = 0;
        int res = 0;

        for (int num : nums) {
            if (count == 0) {
                res = num;
            }

            count += num == res ? 1 : -1;
        }

        return res;
    }
}

//    给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
//
//        你可以假设数组是非空的，并且给定的数组总是存在多数元素。
//
//        示例 1:
//
//        输入: [3,2,3]
//        输出: 3
//        示例 2:
//
//        输入: [2,2,1,1,1,2,2]
//        输出: 2