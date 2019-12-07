package leetcode;

/**
 * @program: arithmetic
 * @description: 相交链表
 * @author: FFFro
 * @create: 2019-12-07 11:25
 **/

public class q37 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        ListNode a = headA;
        ListNode b = headB;
        while (a != b) {
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }

        return a;
    }
}


//编写一个程序，找到两个单链表相交的起始节点。