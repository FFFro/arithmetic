package leetcode;

/**
 * 移除链表元素
 *
 * @author : FFFro
 * @date : 2019-12-14 23:43
 **/
public class q48 {

    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = new ListNode(-1);
        temp.next = head;
        ListNode listNode = temp;
        while (listNode.next != null) {
            if (listNode.next.val == val) {
                listNode.next = listNode.next.next;
            } else {
                listNode = listNode.next;
            }
        }

        return temp.next;
    }
}

//        删除链表中等于给定值 val 的所有节点。

//        示例:

//        输入: 1->2->6->3->4->5->6, val = 6
//        输出: 1->2->3->4->5