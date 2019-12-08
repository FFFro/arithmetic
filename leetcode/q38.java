package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: arithmetic
 * @description: 两数之和 II - 输入有序数组
 * @author: FFFro
 * @create: 2019-12-08 18:52
 **/

public class q38 {

    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            list.add(numbers[i]);
        }
        for (int j = 0; j < list.size() - 1; j++) {
            if (list.contains(target - list.get(j))) {
                res[0] = j + 1;
                int temp = target - list.get(j);
                for (int i = list.size() - 1; i > 0; i--) {
                    if (list.get(i).equals(temp)) {
                        res[1] = i + 1;
                        return res;
                    }
                }
            }
        }

        return res;
    }

    public int[] twoSum1(int[] numbers, int target) {
        if (numbers == null) {
            return null;
        }

        int i = 0;
        int j = numbers.length - 1;

        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum == target) {
                return new int[]{i + 1, j + 1};
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }

        return null;
    }


}

//给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
//
//        函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。
//
//        说明:
//
//        返回的下标值（index1 和 index2）不是从零开始的。
//        你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
//        示例:
//
//        输入: numbers = [2, 7, 11, 15], target = 9
//        输出: [1,2]
//        解释: 2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。