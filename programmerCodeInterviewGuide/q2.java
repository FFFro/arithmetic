package programmerCodeInterviewGuide;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @program: arithmetic
 * @description: 最长的可整合子数组的长度
 * @author: FFFro
 * @create: 2019-11-14 19:48
 **/

public class q2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int len = 1;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int max = arr[i];
            int min = arr[i];
            for (int j = i; j < n; j++) {
                if (set.contains(arr[j])) {
                    break;
                } else {
                    set.add(arr[j]);
                }
                max = Math.max(arr[j], max);
                min = Math.min(arr[j], min);
                if (max - min + 1 == set.size()) {
                    len = Math.max(len, max - min + 1);
                }
            }
            set.clear();
        }

        System.out.println(len);
    }
}


//7 5 5 3 2 6 4 3                 len = 5
//先给出可整合数组的定义：如果一个数组在排序之后，每相邻两个数的差的绝对值都为1，或者该数组长度为1，则该数组为可整合数组。例如，[5, 3, 4, 6, 2]排序后为[2, 3, 4, 5, 6]，符合每相邻两个数差的绝对值都为1，所以这个数组为可整合数组
//        给定一个数组arr, 请返回其中最大可整合子数组的长度。例如，[5, 5, 3, 2, 6, 4, 3]的最大可整合子数组为[5, 3, 2, 6, 4]，所以请返回5
//        [要求]
//        时间复杂度为O(n^2)O(n
//        2
//        )，空间复杂度为O(n)O(n)
