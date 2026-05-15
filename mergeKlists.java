import java.util.PriorityQueue;

class Solution {

    public ListNode mergeKLists(ListNode[] lists) {

        // Min Heap
        PriorityQueue<ListNode> pq = new PriorityQueue<>(
            (a, b) -> a.val - b.val
        );

        // Step 1: Add first node of each list
        for (ListNode node : lists) {
            if (node != null) {
                pq.add(node);
            }
        }

        // Dummy node for result list
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        // Step 2: Take smallest node from heap
        while (!pq.isEmpty()) {

            ListNode smallest = pq.poll();

            curr.next = smallest;
            curr = curr.next;

            // Step 3: Add next node of same list
            if (smallest.next != null) {
                pq.add(smallest.next);
            }
        }

        return dummy.next;
    }
}
