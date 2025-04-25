package linkedList;

import linkedListNeeds.Node;

public class CycleDetection {
	// Detect cycle
    public static boolean hasCycle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.getNext() != null) {
            slow = slow.getNext();           // move 1 step
            fast = fast.getNext().getNext();      // move 2 steps

            if (slow == fast) return true; // cycle found
        }
        return false; // no cycle
    }
}
