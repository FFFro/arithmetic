package leetcode;

/**
 * 字符串中的第一个唯一字符
 *
 * @author : FFFro
 * @date : 2020-01-10 22:45
 **/
public class q81 {

    public static int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            int index = s.indexOf(s.charAt(i), i + 1);
            if (index == -1) {
                int temp = s.indexOf(s.charAt(i));
                if (i == temp) {
                    return i;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        firstUniqChar("leetcode");
    }
}

//给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
//
//        案例:
//
//        s = "leetcode"
//        返回 0.
//
//        s = "loveleetcode",
//        返回 2.