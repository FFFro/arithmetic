package leetcode;

import java.util.Stack;

/**
 * 回文链表
 *
 * @author : FFFro
 * @date : 2019-12-21 21:51
 **/
public class q58 {

    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode temp = head;
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }

        while (temp != null) {
            if (temp.val != stack.pop()) {
                return false;
            }

            temp = temp.next;
        }

        return true;
    }

    public boolean fast(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        ListNode fast = head;
        ListNode slow = null;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            ListNode temp = head.next;
            head.next = slow;
            slow = head;
            head = temp;
        }

        if (fast != null) {
            head = head.next;
        }

        while (slow != null && head != null) {
            if (slow.val != head.val) {
                return false;
            }
            slow = slow.next;
            head = head.next;
        }

        return true;
    }
}

//请判断一个链表是否为回文链表。
//
//        示例 1:
//
//        输入: 1->2
//        输出: false
//        示例 2:
//
//        输入: 1->2->2->1
//        输出: true