package leetcode;

import java.util.regex.Pattern;

/**
 * 反转字符串中的元音字母
 *
 * @author : FFFro
 * @date : 2020-01-05 20:50
 **/
public class q75 {

    public String reverseVowels(String s) {
        String rex = "[AEIOUaeiou]";
        char[] chars = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            while (!Pattern.matches(rex, String.valueOf(chars[start]))) {
                start++;
            }
            while (!Pattern.matches(rex, String.valueOf(chars[end]))) {
                end--;
            }
            if (start < end) {
                res(chars, start, end);
            }
        }

        return chars.toString();
    }


    public void res(char[] s, int a, int b) {
        char temp = s[a];
        s[a] = s[b];
        s[b] = temp;
    }
}

//编写一个函数，以字符串作为输入，反转该字符串中的元音字母。
//
//        示例 1:
//
//        输入: "hello"
//        输出: "holle"
//        示例 2:
//
//        输入: "leetcode"
//        输出: "leotcede"
//        说明:
//        元音字母不包含字母"y"。