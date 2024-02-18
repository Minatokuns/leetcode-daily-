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
    public int getSize(ListNode node) {
        int count = 0;
        while (node != null) {
        count++;
        node = node.next;
        }
        return count;
        }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        int size1 = getSize(l1);
        int size2 = getSize(l2);
        ListNode head = size1 < size2 ? l2 : l1;
        ListNode res = head;
        ListNode last = l1;
        while(!(l1==null || l2==null) ){
            int sum = l1.val + l2.val + carry;
            
            carry = sum/10;
            //System.out.println(carry);
            sum = sum%10;
            //System.out.println(sum);
            res.val = sum;
            last = l1;
            l1 = l1.next;
            l2 = l2.next;
            res = res.next;
        }
       
        while(l1!=null){
            int sum = l1.val + carry;
            carry = sum/10;
            sum = sum%10;
            res.val = sum;
            last = l1;
            l1 = l1.next;
            res = res.next;
        }
        while(l2!=null){
            int sum = l2.val + carry;
            carry = sum/10;
            sum = sum%10;
            res.val = sum;
             last = l2;
            l2 = l2.next;
            res = res.next;
        }
            if(carry!=0){
            ListNode car = new ListNode(carry);
            last.next = car;
            //car.next = null;
        }
        return head;
    }
}