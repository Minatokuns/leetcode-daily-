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
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
             Arrays.fill(matrix[i],-1); // Fill the row with value 5
        }

        int topRow = 0, bottomRow = m - 1, leftCol = 0, rightCol = n - 1;

        while (head != null) {
            for (int j = leftCol; j <= rightCol && head != null; j++) {
                matrix[topRow][j] = head.val;
                head = head.next;
            }
            topRow++;

            for (int i = topRow; i <= bottomRow && head != null; i++) {
                matrix[i][rightCol] = head.val;
                head = head.next;
            }
            rightCol--;

            for (int j = rightCol; j >= leftCol && head != null; j--) {
                matrix[bottomRow][j] = head.val;
                head = head.next;
            }
            bottomRow--;

            for (int i = bottomRow; i >= topRow && head != null; i--) {
                matrix[i][leftCol] = head.val;
                head = head.next;
            }
            leftCol++;
        }

        return matrix;
    }
}
