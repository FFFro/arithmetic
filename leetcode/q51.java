package leetcode;

import java.util.Stack;

/**
 * 反转链表
 *
 * @author : FFFro
 * @date : 2019-12-17 19:01
 **/
public class q51 {

    public ListNode reverseList(ListNode head) {
        Stack<Integer> temp = new Stack<>();
        while (head != null) {
            temp.push(head.val);
            head = head.next;
        }
        if (temp.empty()) {
            return null;
        }

        ListNode res = new ListNode(temp.pop());
        ListNode q = res;
        while (!temp.empty()) {
            res.next = new ListNode(temp.pop());
            res = res.next;
        }

        return q;
    }

    public ListNode getList(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }

        return pre;
    }
}

//反转一个单链表。
//
//        示例:
//
//        输入: 1->2->3->4->5->NULL
//        输出: 5->4->3->2->1->NULL
//        进阶:
//        你可以迭代或递归地反转链表。你能否用两种方法解决这道题？

