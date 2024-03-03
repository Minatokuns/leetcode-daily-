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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        int len = 1;
        while(curr.next!=null){
            len++;
            curr = curr.next;
        }
        curr = head;
        ListNode next = curr.next;
        int removeInd = (len-n)+1;
        //if length is 1 setting it to null 
        if(len==1 && n==1){
            head = null;
            return head;
        }
        //if we have to remove 1st node we set head to 2nd node (len>1)
        if(removeInd==1){
            head=next;
            return head;
        }
        //if length is 1>1 thn checking next =i (removeIndex) 
        for(int i = 2;i<=len;i++){
            if(removeInd==i){
                curr.next= next.next;
                break;
            }
            curr=next;
            next = next.next;
        }
        return head;
    }
}
// 1 2 3 4 5  , we set curr = 1 and next = 2. As we have to delete 4,when we reach 4(next) we set curr which is 3 to to next of 4(next.next)
// 1 2 3 4, if we have to remove 1st we just set the head to 2nd node.
//1 , if only 1 element then head will be pointing to next of 1st element so set head = null;