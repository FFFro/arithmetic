package niuke;

/**
 * 两个排序数组找中位数
 *
 * @author : FFFro
 * @date : 2021-03-10 23:01
 **/
public class Q1 {
    /**
     * find median in two sorted array
     *
     * @param arr1 int整型一维数组 the array1
     * @param arr2 int整型一维数组 the array2
     * @return int整型
     */
    public int findMedianinTwoSortedAray(int[] arr1, int[] arr2) {
        int n = arr1.length;
        if (n == 0) {
            return 0;
        }
        int l1 = 0, r1 = n - 1;
        int l2 = 0, r2 = n - 1;
        while (l1 < r1) {
            int k = r1 - l1 + 1;
            int mid1 = l1 + (r1 - l1) / 2;
            int mid2 = l2 + (r2 - l2) / 2;
            if (arr1[mid1] == arr2[mid1]) {
                return arr1[mid1];
            } else if (arr1[mid1] > arr2[mid2]) {
                if (k % 2 == 0) {
                    r1 = mid1;
                    l2 = mid2 + 1;
                } else if (k % 2 == 1) {
                    r1 = mid1;
                    l2 = mid2;
                }
            } else {
                if (k % 2 == 0) {
                    r2 = mid2;
                    l1 = mid1 + 1;
                } else if (k % 2 == 1) {
                    r2 = mid2;
                    l1 = mid1;
                }
            }
        }

        return Math.min(arr1[l1], arr2[l2]);
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{1,3,5,7,9};
        int[] arr2 = new int[]{2, 4, 6, 8 ,10};
        Q1 a = new Q1();
        System.out.println(a.findMedianinTwoSortedAray(arr1, arr2));
    }
}
//给定两个有序数组arr1和arr2，已知两个数组的长度都为N，求两个数组中所有数的上中位数。
//        上中位数：假设递增序列长度为n，若n为奇数，则上中位数为第n/2+1个数；否则为第n/2个数
//        [要求]
//        时间复杂度为O(logN)O(logN)，额外空间复杂度为O(1)O(1)