package programmerCodeInterviewGuide;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @program: arithmetic
 * @description: 不重复打印排序数组中相加和为给定值的所有二元组
 * @author: FFFro
 * @create: 2019-11-15 19:38
 **/

public class q3 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] ss = bf.readLine().split(" ");
        int n = Integer.parseInt(ss[0]);
        int k = Integer.parseInt(ss[1]);
        int a[] = new int[n];
        ss = bf.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(ss[i]);
        }
        int i = 0;
        int j = n - 1;
        while (i < j) {
            if (a[i] + a[j] == k) {
                if (i == 0 || a[i] != a[i -1]) {
                    System.out.println(a[i] + " " + a[j]);
                }
               i++;
               j--;
            } else if (a[i] + a[j] > k) {
                j--;
            } else {
                i++;
            }
        }

        bf.close();
    }
}

//给定排序数组arr和整数k，不重复打印arr中所有相加和为k的不降序二元组
//        例如, arr = [-8, -4, -3, 0, 1, 2, 4, 5, 8, 9], k = 10，打印结果为：
//        1, 9
//        2, 8
//        [要求]
//        时间复杂度为O(n)O(n)，空间复杂度为O(1)O(1)

