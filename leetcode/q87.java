package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 最长回文串
 * @author : FFFro
 * @date : 2020-01-18 21:43
 **/
public class q87 {

    public int longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : chars) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        int res = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 2) {
                res = res + (entry.getValue() / 2) * 2 ;
                map.put(entry.getKey(), entry.getValue() % 2);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 0) {
                res++;
                break;
            }
        }

        return res;
    }

    public int longestPalindrome1(String s) {
        int[] count = new int[128];
        for (char c: s.toCharArray()) {
            count[c]++;
        }

        int res = 0;

        for (int i : count) {
            res += i / 2 * 2;
            if (i % 2 == 1 && res % 2 == 0) {
                res++;
            }
        }

        return res;
    }
}

//给定一个包含大写字母和小写字母的字符串，找到通过这些字母构造成的最长的回文串。
//
//        在构造过程中，请注意区分大小写。比如 "Aa" 不能当做一个回文字符串。
//
//        注意:
//        假设字符串的长度不会超过 1010。
//
//        示例 1:
//
//        输入:
//        "abccccdd"
//
//        输出:
//        7
//
//        解释:
//        我们可以构造的最长的回文串是"dccaccd", 它的长度是 7。

