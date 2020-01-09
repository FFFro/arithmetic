package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 赎金信
 *
 * @author : FFFro
 * @date : 2020-01-09 20:46
 **/
public class q80 {

    public boolean canConstruct(String ransomNote, String magazine) {
        char[] chars = magazine.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char aChar : chars) {
            if (map.containsKey(aChar)) {
                map.put(aChar, map.get(aChar) + 1);
            } else {
                map.put(aChar, 1);
            }
        }

        char[] array = ransomNote.toCharArray();
        for (char c : array) {
            if (map.containsKey(c)) {
                if (map.get(c) != 0) {
                    map.put(c, map.get(c) - 1);
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        return true;
    }

    public boolean canConstruct1(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        int temp[] = new int[26];
        for (char c : ransomNote.toCharArray()) {
            int i = magazine.indexOf(c, temp[c - 'a']);
            if (i == -1) {
                return false;
            }
            temp[c - 'a'] = i + 1;
        }

        return true;
    }

}

//    给定一个赎金信 (ransom) 字符串和一个杂志(magazine)字符串，判断第一个字符串ransom能不能由第二个字符串magazines里面的字符构成。如果可以构成，返回 true ；否则返回 false。
//
//        (题目说明：为了不暴露赎金信字迹，要从杂志上搜索各个需要的字母，组成单词来表达意思。)
//
//        注意：
//
//        你可以假设两个字符串均只含有小写字母。
//
//        canConstruct("a", "b") -> false
//        canConstruct("aa", "ab") -> false
//        canConstruct("aa", "aab") -> true

