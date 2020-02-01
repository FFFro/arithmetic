package leetcode;

/**
 * 字符串中的单词数
 * @author : FFFro
 * @date : 2020-02-01 14:19
 **/
public class q91 {

    public int countSegments(String s) {
        if (s.equals("")) {
            return 0;
        }
        int count = 0;
        String[] strings = s.split(" ");
        for (String string : strings) {
            if (!string.equals(" ") && !string.equals("")) {
                count++;
            }
        }

        return count;
    }
}


//统计字符串中的单词个数，这里的单词指的是连续的不是空格的字符。
//
//        请注意，你可以假定字符串里不包括任何不可打印的字符。
//
//        示例:
//
//        输入: "Hello, my name is John"
//        输出: 5