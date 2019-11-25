package leetcode;

/**
 * @program: arithmetic
 * @description: 加一
 * @author: FFFro
 * @create: 2019-11-25 21:01
 **/

public class q15 {

    public int[] plusOne(int[] digits) {
        int temp = digits.length - 1;
        if (digits[temp] != 9) {
            digits[temp] = digits[temp] + 1;
            return digits;
        }
        while (temp >= 0) {
            if (digits[temp] == 9) {
                temp--;
            } else {
                break;
            }
        }
        if (temp < 0) {
            int[] res = new int[digits.length + 1];
            res[0] = 1;
            for (int i = 1; i < res.length; i++) {
                res[i] = 0;
            }
            return res;
        } else {
            int[] res = new int[digits.length];
            for (int i = 0; i < digits.length; i++) {
                if (i < temp) {
                    res[i] = digits[i];
                } else if (i == temp) {
                    res[i] = digits[i] + 1;
                } else {
                    res[i] = 0;
                }
            }
            return res;
        }
    }

    public int[] plusOne1(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) {
                return digits;
            }
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}

//给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
//
//        最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
//
//        你可以假设除了整数 0 之外，这个整数不会以零开头。
//
//        示例 1:
//
//        输入: [1,2,3]
//        输出: [1,2,4]
//        解释: 输入数组表示数字 123。
//        示例 2:
//
//        输入: [4,3,2,1]
//        输出: [4,3,2,2]
//        解释: 输入数组表示数字 4321。
