package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: arithmetic
 * @description: 杨辉三角 II
 * @author: FFFro
 * @create: 2019-12-02 21:15
 **/

public class q30 {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        long pre = 1;
        res.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            long temp = pre * (rowIndex - i + 1) / i;
            res.add((int) temp);
            pre = temp;
        }

        return res;
    }
}

//    给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。 1 4 6 4 1              ->  5
//                                                   1 5 10 10 5 1           -> 6
