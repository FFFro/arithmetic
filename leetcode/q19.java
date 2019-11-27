package leetcode;

/**
 * @program: arithmetic
 * @description: 删除排序链表中的重复元素
 * @author: FFFro
 * @create: 2019-11-27 21:29
 **/

public class q19 {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        int temp = head.val;
        ListNode a = head;
        while (head.next != null) {
            if (head.next.val == temp) {
                head.next = head.next.next;
            } else {
                temp = head.next.val;
                head = head.next;
            }
        }

        return a;
    }
}


//给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
//
//        示例 1:
//
//        输入: 1->1->2
//        输出: 1->2
//        示例 2:
//
//        输入: 1->1->2->3->3
//        输出: 1->2->3

