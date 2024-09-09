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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] v = new int[m][n];
        for (int i = 0; i < m; i++) {
             Arrays.fill(v[i],-1); // Fill the row with value 5
        }
       
  int i=0, j=0, t=0, l=0, b=m-1, r=n-1; //t=top, l=left, b=bottom, r=right
        while(head!=null) {
            v[i][j]=head.val;
            head=head.next;
            if(i == t && j < r) {j++; if(j==r) t++;}  // fill top most unfilled row 
            else if(j == r && i < b) {i++; if(i==b) r--;} // fill right most unfilled column
            else if(i == b && j > l) {j--; if(j==l) b--;} // fill bottom most unfilled row
            else if(j == l && i > t) {i--; if(i==t) l++;} // fill left most unfilled column
        }
        return v;
    }
}
