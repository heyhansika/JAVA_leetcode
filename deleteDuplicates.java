class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        // Dummy node to handle edge cases
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = head;

        while (curr != null) {
            // If duplicate sequence found
            if (curr.next != null && curr.val == curr.next.val) {
                int dupVal = curr.val;

                // Skip all nodes with this duplicate value
                while (curr != null && curr.val == dupVal) {
                    curr = curr.next;
                }

                prev.next = curr;
            } else {
                prev = curr;
                curr = curr.next;
            }
        }

        return dummy.next;
    }
}
