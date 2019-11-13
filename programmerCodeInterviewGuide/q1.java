package programmerCodeInterviewGuide;

/**
 * @program: arithmetic
 * @description: 在行列都排好序的矩阵中找指定的数
 * @author: FFFro
 * @create: 2019-11-13 20:10
 **/

public class q1 {



    public static boolean isKey(int[][] arr, int i, int j, int k) {
        if (i == arr.length || j < 0) {
            return false;
        }

        if (arr[i][j] == k) {
            return true;
        } else if (arr[i][k] < k) {
            i++;
            return isKey(arr, i, j, k);
        } else {
            j--;
            return isKey(arr, i, j, k);
        }
    }
}


//给定一个N \times MN×M的整形矩阵matrix和一个整数K, matrix的每一行和每一列都是排好序的。
//        实现一个函数，判断K是否在matrix中
//        [要求]
//        时间复杂度为O(N+M)O(N+M)，额外空间复杂度为O(1)O(1)。

