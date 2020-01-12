package leetcode;

/**
 * 找不同
 *
 * @author : FFFro
 * @date : 2020-01-11 20:03
 **/
public class q82 {

    public char findTheDifference(String s, String t) {
        char[] chars = t.toCharArray();
        int temp[] = new int[26];
        for (char c : s.toCharArray()) {
            temp[c - 97]++;
        }

        for (char c : chars) {
            int index = s.indexOf(c);
            if (index == -1) {
                return c;
            }
            temp[c - 97]--;
            if (temp[c - 97] == -1) {
                return c;
            }
        }

        return '0';
    }
}

//    给定两个字符串 s 和 t，它们只包含小写字母。
//
//        字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
//
//        请找出在 t 中被添加的字母。
//
//         
//
//        示例:
//
//        输入：
//        s = "abcd"
//        t = "abcde"
//
//        输出：
//        e
//
//        解释：
//        'e' 是那个被添加的字母。
