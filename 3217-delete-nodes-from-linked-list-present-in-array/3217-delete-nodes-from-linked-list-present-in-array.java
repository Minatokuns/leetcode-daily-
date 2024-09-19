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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> hs = new HashSet<>();
        ListNode next = head.next;
        for(int i: nums)
            hs.add(i);
        while(next!=null){
            if(hs.contains(head.val)){
                head = next;
                next = head.next;
            }
            else
                break;
        }
        ListNode temp=head;
        while(next!=null){
            if(hs.contains(next.val))
                next = next.next;
            else{
                temp.next = next;
                temp = next;
                next= next.next;
            }
        }
        temp.next=null;
        return head;
    }
}