package com.zwf;

import com.zwf.utils.ListNode;

/**
 * Created by wf on 2017/4/16.
 */
public class MergeTwoLists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode head = result;
        if(l1 == null && l2 == null)
            return null;
        while(l1 != null && l2 != null) {
            if(l1.val <= l2.val) {
                result.next = new ListNode(l1.val);
                l1 = l1.next;
            }
            else {
                result.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            result = result.next;
        }
        if(l1 != null)
            result.next = l1;
        if(l2 != null)
            result.next = l2;
        return head.next;
    }
}
