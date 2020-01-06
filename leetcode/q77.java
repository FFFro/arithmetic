package leetcode;

/**
 * 有效的完全平方数
 *
 * @author : FFFro
 * @date : 2020-01-06 21:41
 **/
public class q77 {

    public static boolean isPerfectSquare(int num) {

        if (num < 2) {
            return true;
        }

        long begin = 2;
        long end = num / 2;
        while (begin <= end) {
            long mid = begin + (end - begin) / 2;
            long i = mid * mid;
            if (i > num) {
                end = mid - 1;
            } else if (i < num) {
                begin = mid + 1;
            } else {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        isPerfectSquare(808201);
    }
}

//    给定一个正整数 num，编写一个函数，如果 num 是一个完全平方数，则返回 True，否则返回 False。
//
//        说明：不要使用任何内置的库函数，如  sqrt。
//
//        示例 1：
//
//        输入：16
//        输出：True
//        示例 2：
//
//        输入：14
//        输出：False
//
//        来源：力扣（LeetCode）
//        链接：https://leetcode-cn.com/problems/valid-perfect-square
//        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
