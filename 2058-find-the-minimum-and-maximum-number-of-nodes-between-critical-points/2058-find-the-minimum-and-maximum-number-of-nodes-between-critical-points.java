// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// class Solution {
//     public int[] nodesBetweenCriticalPoints(ListNode head) {
//         int[] res = new int[2];  // Result array to store maximum and minimum distances between critical points
//         ListNode pre = head;  // Pointer to keep track of the previous node
//         head = head.next;  // Move head to the next node
//         int cur = 0;  // Variable to store the current index of the node
//         int last = 0;  // Variable to store the index of the last critical point found
//         int max_diff = 0;  // Variable to store the maximum distance between critical points
//         int min_diff = Integer.MAX_VALUE;  // Variable to store the minimum distance between critical points
//         int loc = 1;  // Variable to store the current location in the list (starting from index 1)
//         int min_ind = Integer.MAX_VALUE;  // Variable to store the index of the first critical point

//         // Traverse the linked list until the second last node
//         while (head.next != null) {
//             // Check for local minimum or maximum
//             if (head.val < pre.val && head.val < head.next.val) {
//                 cur = loc;  // Update current index as a potential critical point
//                 if (cur != 0 && last != 0) {
//                     // Update minimum distance if both current and last critical points are valid
//                     min_diff = Math.min(min_diff, cur - last);
//                     // Update the index of the first critical point
//                     min_ind = Math.min(min_ind, cur);
//                 }
//                 last = cur;  // Update last critical point index
//             } else if (head.val > pre.val && head.val > head.next.val) {
//                 cur = loc;  // Update current index as a potential critical point
//                 if (cur != 0 && last != 0) {
//                     // Update minimum distance if both current and last critical points are valid
//                     min_diff = Math.min(min_diff, cur - last);
//                     // Update the index of the first critical point
//                     min_ind = Math.min(min_ind, cur);
//                 }
//                 last = cur;  // Update last critical point index
//             }
//             pre = head;  // Move the previous pointer to the current node
//             head = head.next;  // Move the head pointer to the next node
//             loc++;  // Increment the location index
//         }

//         // Check if at least two critical points were found
//         if (cur != 0 && last != 0) {
//             res[0] = cur - min_ind;  // Calculate the maximum distance between first and last critical points
//             res[1] = min_diff;  // Set the minimum distance between critical points
//         } else {
//             res[0] = -1;  // Set default value for maximum distance if no critical points found
//             res[1] = -1;  // Set default value for minimum distance if no critical points found
//         }

//         return res;  // Return the result array
//     }
// }

class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int minDiff = Integer.MAX_VALUE;
        int maxDiff = Integer.MIN_VALUE;
        int firstCritical = -1;
        int lastCritical = -1;
        int prevVal = head.val;
        ListNode current = head.next;
        int index = 1;

        while (current.next != null) {
            if ((current.val < prevVal && current.val < current.next.val) ||
                (current.val > prevVal && current.val > current.next.val)) {
                
                if (firstCritical == -1) {
                    firstCritical = index;
                } else {
                    minDiff = Math.min(minDiff, index - lastCritical);
                    maxDiff = index - firstCritical;
                }
                lastCritical = index;
            }
            
            prevVal = current.val;
            current = current.next;
            index++;
        }

        if (firstCritical == -1 || lastCritical == firstCritical) {
            return new int[]{-1, -1};
        }

        return new int[]{minDiff, maxDiff};
    }
}