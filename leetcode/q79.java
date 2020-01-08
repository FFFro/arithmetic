package leetcode;

/**
 * 猜数字大小
 *
 * @author : FFFro
 * @date : 2020-01-08 22:48
 **/
public class q79 {

    private static final int NUM = 6;

    int guess(int num) {
        if (num == NUM) {
            return 0;
        } else if (num < NUM) {
            return -1;
        }
        return 1;
    }


    public int guessNumber(int n) {
        int start = 1;
        int end = n;
        while (start < end) {
            int mid = start + (end - start + 1) / 2;
            int guess = guess(mid);
            if (guess == -1) {
                end = mid - 1;
            } else {
                start = mid;
            }
        }

        return start;
    }
}

//我们正在玩一个猜数字游戏。 游戏规则如下：
//        我从 1 到 n 选择一个数字。 你需要猜我选择了哪个数字。
//        每次你猜错了，我会告诉你这个数字是大了还是小了。
//        你调用一个预先定义好的接口 guess(int num)，它会返回 3 个可能的结果（-1，1 或 0）：
//
//        -1 : 我的数字比较小
//        1 : 我的数字比较大
//        0 : 恭喜！你猜对了！
//        示例 :
//
//        输入: n = 10, pick = 6
//        输出: 6
