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
class Solution {            // 1->2->3->4->5->6->NULL
    public ListNode oddEvenList(ListNode head) {
        if(head==null)
            return head;
        ListNode odd=head;
        ListNode even=head.next;
        ListNode evenHead = even;
        
        while(odd.next!=null && even.next!=null){
            odd.next=even.next;
            odd=even.next;
            even.next=odd.next;
            even = odd.next;
        }
        odd.next=evenHead;
        
    return head;
    }
}




/*ListNode dumpOddHead = new ListNode(0), dumpEvenHead = new ListNode(0);
        ListNode oddHead = dumpOddHead, evenHead = dumpEvenHead;
        while (head != null) {
            oddHead.next = head;
            oddHead = oddHead.next;
            head = head.next;

            evenHead.next = head;
            evenHead = evenHead.next;
            if (head != null) head = head.next;
        }
        oddHead.next = dumpEvenHead.next; // Connect odd nodes to even nodes
        return dumpOddHead.next; // Return head of odd node
        */
