/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode cur = head;
        while(cur != null){
            ListNode next = cur.next;
            cur.next = prev;

            prev = cur;
            cur = next;
        }

        return prev;
    }

    public ListNode findMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    public boolean isPalindrome(ListNode head) {
      if(head == null || head.next == null){
        return true;
      }  

      ListNode middle = findMiddle(head);//firstStart end
      ListNode secondStart = reverse(middle.next);

      ListNode firstStart = head;
      while(secondStart != null){
        if(firstStart.val != secondStart.val){
            return false;
        }
        firstStart = firstStart.next;
        secondStart = secondStart.next;
      }
      return true;
    }
}