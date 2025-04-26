package linkedList;

import linkedListNeeds.Node;

public class ReverseBetween {
	public static Node reverseBetween(Node head, int m, int n) {
        if (head == null || m == n) return head;

        Node dummy = new Node(0);
        dummy.setNext(head);
        Node prev = dummy;

        // Step 1: Move `prev` to node before position `m`
        for (int i = 1; i < m; i++) {
            prev = prev.getNext();
        }

        // Step 2: Reverse sublist between `m` and `n`
        Node start = prev.getNext();
        Node then = start.getNext();

        for (int i = 0; i < n - m; i++) {
            start.setNext(then.getNext());
            then.setNext(prev.getNext());
            prev.setNext(then);
            then = start.getNext();
        }

        return dummy.getNext();
    }
}
