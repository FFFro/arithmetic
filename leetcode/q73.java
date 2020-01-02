package leetcode;

/**
 * 4的幂
 *
 * @author : FFFro
 * @date : 2020-01-02 21:09
 **/
public class q73 {

    public boolean isPowerOfFour(int num) {
        return num > 0 && Math.log10(num) / Math.log10(2) % 2 == 0;
    }
}

//    给定一个整数 (32 位有符号整数)，请编写一个函数来判断它是否是 4 的幂次方。
//
//        示例 1:
//
//        输入: 16
//        输出: true
//        示例 2:
//
//        输入: 5
//        输出: false
//        进阶：
//        你能不使用循环或者递归来完成本题吗？