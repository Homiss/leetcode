package arithmetic;

import javax.xml.transform.Result;
import java.util.List;

/**
 * Created by homiss on 2017/2/16.
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 */
public class _2AddTwoNumbers {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(9), l2 = new ListNode(1);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(9);
        l2.next.next.next = new ListNode(9);
        l2.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next.next.next.next = new ListNode(9);

        ListNode result = new _2AddTwoNumbers().addTwoNumbers(l1, l2);
        while(result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) {
            return null;
        }
        ListNode head = new ListNode(0);
        ListNode result = head;
        int t = 0;
        while(l1 != null && l2 != null){
            int sum = l1.val + l2.val + t;
            t = sum / 10;
            result.next = new ListNode(sum % 10);
            l1 = l1.next;
            l2 = l2.next;
            result = result.next;
        }
        while(l1 != null){
            int sum = l1.val + t;
            t = sum / 10;
            result.next = new ListNode(sum % 10);
            l1 = l1.next;
            result = result.next;
        }
        while(l2 != null){
            int sum = l2.val + t;
            t = sum / 10;
            result.next = new ListNode(sum % 10);
            l2 = l2.next;
            result = result.next;
        }
        if(t != 0){
            result.next = new ListNode(t);
        }
        return head.next;
    }

}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

