package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 有效的字母异位词
 *
 * @author : FFFro
 * @date : 2019-12-22 20:05
 **/
public class q61 {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }

        for (int j = 0; j < t.length(); j++) {
            if (!map.containsKey(t.charAt(j))) {
                return false;
            }
            if (map.get(t.charAt(j)) == 0) {
                return false;
            }
            map.put(t.charAt(j), map.get(t.charAt(j)) - 1);
        }

        return true;
    }
}

//    给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
//
//        示例 1:
//
//        输入: s = "anagram", t = "nagaram"
//        输出: true
//        示例 2:
//
//        输入: s = "rat", t = "car"
//        输出: false
//        说明:
//        你可以假设字符串只包含小写字母。
//
//        进阶:
//        如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？

