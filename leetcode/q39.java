package leetcode;

/**
 * @program: arithmetic
 * @description: Excel表列名称
 * @author: FFFro
 * @create: 2019-12-08 20:09
 **/

public class q39 {

    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int a = n % 26;
            if (a == 0) {
                a = 26;
                n -= 1;
            }
            sb.insert(0, (char) ('A' + a - 1));
            n /= 26;
        }

        return sb.toString();
    }
}

//给定一个正整数，返回它在 Excel 表中相对应的列名称。
//
//        例如，
//
//        1 -> A
//        2 -> B
//        3 -> C
//        ...
//        26 -> Z
//        27 -> AA
//        28 -> AB
//        ...
//        示例 1:
//
//        输入: 1
//        输出: "A"
//        示例 2:
//
//        输入: 28
//        输出: "AB"
//        示例 3:
//
//        输入: 701
//        输出: "ZY"