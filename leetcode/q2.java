package leetcode;

/**
 * @program: arithmetic
 * @description: 整数反转
 * @author: FFFro
 * @create: 2019-11-16 19:46
 **/

public class q2 {

    public int reverse(int x) {
        String temp = String.valueOf(x);
        char[] chars = temp.toCharArray();
        StringBuilder sb = new StringBuilder();
        int j = chars.length - 1;
        for (; j >= 0; j--) {
            if (chars[j] != '0') {
                break;
            }
        }
        for (int i = j; i >= 0; i--) {
            if (chars[i] == '-') {
                break;
            }
            sb.append(chars[i]);
        }
        String s = sb.toString();
        if (s.equals("")) {
            return 0;
        }
        Integer res = null;
        try {
            res = Integer.valueOf(s);
        } catch (NumberFormatException e) {
            return 0;
        }
        if (x < 0) {
            res = 0 - res;
        }
        return res;
    }

    public int reverse1(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > Integer.MAX_VALUE % 10)) {
                rev = 0;
                break;
            } else if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && x < Integer.MIN_VALUE % 10)) {
                rev = 0;
                break;
            }
            rev = rev * 10 + pop;
        }

        return rev;
    }
}

//给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
//
//        示例 1:
//
//        输入: 123
//        输出: 321
//         示例 2:
//
//        输入: -123
//        输出: -321
//        示例 3:
//
//        输入: 120
//        输出: 21
//
//        来源：力扣（LeetCode）
//        链接：https://leetcode-cn.com/problems/reverse-integer
//        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
