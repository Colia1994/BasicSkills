package org.kly.basicSkills.algorithm.toOffer;

/**
 * 输入一个链表，反转链表后，输出新链表的表头。
 * @author colia
 * @date 2018/12/30 22:33
 */
public class 反转链表 {
    public ListNode ReverseList(ListNode head) {

        ListNode per = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode newNode = cur.next;
            cur.next = per;
            per = cur;
            cur = newNode;
        }
        return per;

    }

    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
