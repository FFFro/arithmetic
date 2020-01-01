package leetcode;

/**
 * 3的幂
 *
 * @author : FFFro
 * @date : 2020-01-01 18:57
 **/
public class q72 {

    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }

        while (n % 3 == 0) {
            n /= 3;
        }

        return n == 1;
    }

    public boolean is(int n) {
        return Math.log10(n) /Math.log10(3) % 1 == 0;
    }
}

//给定一个整数，写一个函数来判断它是否是 3 的幂次方。
//
//        示例 1:
//
//        输入: 27
//        输出: true
//        示例 2:
//
//        输入: 0
//        输出: false
//        示例 3:
//
//        输入: 9
//        输出: true
//        示例 4:
//
//        输入: 45
//        输出: false
//        进阶：
//        你能不使用循环或者递归来完成本题吗？