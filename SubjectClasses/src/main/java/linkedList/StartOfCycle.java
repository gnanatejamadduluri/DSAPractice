package linkedList;

import linkedListNeeds.Node;

public class StartOfCycle {
	public static Node detectCycleStart(Node head) {
        Node slow = head;
        Node fast = head;

        // Step 1: Detect cycle
        while (fast != null && fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();

            if (slow == fast) {
                // Step 2: Reset one pointer to head
                Node start = head;

                // Step 3: Move both one step until they meet
                while (start != slow) {
                    start = start.getNext();
                    slow = slow.getNext();
                }

                return start; // Start of cycle
            }
        }

        return null; // No cycle
    }
}
