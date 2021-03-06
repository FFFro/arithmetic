package leetcode;

/**
 * @program: arithmetic
 * @description: 买卖股票的最佳时机
 * @author: FFFro
 * @create: 2019-12-03 19:38
 **/

public class q31 {

    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }

        int start = 0;
        while (start < prices.length - 1 && prices[start] >= prices[start + 1]) {
            start++;
        }

        if (start == prices.length - 1) {
            return 0;
        }

        int max = getMax(start, prices);
        for (int i = start + 1; i < prices.length - 1; i++) {
            if (prices[start] >= prices[i]) {
                start = i;
                max = Math.max(max, getMax(start, prices));
            }
        }

        return max;
    }

    public int getMax(int start, int[] prices) {
        int cha = Integer.MIN_VALUE;
        int temp = prices[start];
        while (start < prices.length) {
            cha = Math.max(cha, prices[start++] - temp);
        }

        return cha;
    }


    public int getNum(int[] prices) {
        int min = Integer.MAX_VALUE;
        int res = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else if (prices[i] - min > res) {
                res = prices[i] - min;
            }
        }

        return res;
    }
}

//        给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
//
//        如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。
//
//        注意你不能在买入股票前卖出股票。
//
//        示例 1:
//
//        输入: [7,1,5,3,6,4]
//        输出: 5
//        解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
//        注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格。
//        示例 2:
//
//        输入: [7,6,4,3,1]
//        输出: 0
//        解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。
