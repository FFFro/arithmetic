package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: arithmetic
 * @description: 杨辉三角
 * @author: FFFro
 * @create: 2019-12-02 20:47
 **/

public class q29 {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            if (i < 2) {
                for (int j = 0; j <= i; j++) {
                    list.add(1);
                }
                res.add(list);
            } else {
                list.add(1);
                for (int j = 1; j < i; j++) {
                    Integer temp = res.get(i - 1).get(j - 1) + res.get(i - 1).get(j);
                    list.add(temp);
                }
                list.add(1);
                res.add(list);
            }
        }

        return res;
    }
}

//    给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。


