package linkedList;

import linkedListNeeds.Node;

public class SplitList {
	// Split the list into two halves
    public static Node[] splitList(Node head) {
        if (head == null || head.getNext() == null) return new Node[] { head, null };

        Node slow = head;
        Node fast = head.getNext();

        // Fast and slow pointer to find mid
        while (fast != null && fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }

        Node secondHalf = slow.getNext();
        slow.setNext(null); // cut the list
        return new Node[] { head, secondHalf };
    }

}
