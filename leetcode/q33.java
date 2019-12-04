package leetcode;

import java.util.regex.Pattern;

/**
 * @program: arithmetic
 * @description: 验证回文串
 * @author: FFFro
 * @create: 2019-12-04 21:38
 **/

public class q33 {

    public boolean isPalindrome(String s) {
        if (s == null || s == "") {
            return true;
        }
        s = s.toLowerCase();
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            while (start < end && !Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }
            while (start < end && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }


            if (s.charAt(start++) != s.charAt(end--)) {
                return false;
            }
        }

        return true;
    }
}

//给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
//
//        说明：本题中，我们将空字符串定义为有效的回文串。
//
//        示例 1:
//
//        输入: "A man, a plan, a canal: Panama"
//        输出: true
//        示例 2:
//
//        输入: "race a car"
//        输出: false
//
//        来源：力扣（LeetCode）
//        链接：https://leetcode-cn.com/problems/valid-palindrome
//        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
