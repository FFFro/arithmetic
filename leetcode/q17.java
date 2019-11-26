package leetcode;

/**
 * @program: arithmetic
 * @description: x 的平方根
 * @author: FFFro
 * @create: 2019-11-26 19:58
 **/

public class q17 {

    public static int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        long start = 0;
        long end = x / 2 + 1;
        while (start < end) {
            long mid = start + (end - start + 1) / 2;
            if (mid * mid > x) {
                end = mid - 1;
            } else {
                start = mid;
            }
        }
        return (int) start;
    }

    public static int niudun(int a) {
        long x = a;
        while (x * x > a) {
            x = (x + a / x) / 2;
        }

        return (int) x;
    }
}

//实现 int sqrt(int x) 函数。
//
//        计算并返回 x 的平方根，其中 x 是非负整数。
//
//        由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
//
//        示例 1:
//
//        输入: 4
//        输出: 2
//        示例 2:
//
//        输入: 8
//        输出: 2
//        说明: 8 的平方根是 2.82842...,
//             由于返回类型是整数，小数部分将被舍去。
