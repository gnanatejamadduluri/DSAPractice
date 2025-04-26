package linkedList;

import linkedListNeeds.Node;

public class ReverseKGroup {
	public static Node reverseKGroup(Node head, int k) {
        if (head == null || k <= 1) return head;

        Node dummy = new Node(0);
        dummy.setNext(head);
        Node prevGroupEnd = dummy;

        while (true) {
            Node kth = getKthNode(prevGroupEnd, k);
            if (kth == null) break;

            Node groupStart = prevGroupEnd.getNext();
            Node nextGroupStart = kth.getNext();

            // Reverse the group
            Node prev = kth.getNext();
            Node curr = groupStart;

            while (curr != nextGroupStart) {
                Node temp = curr.getNext();
                curr.setNext(prev);
                prev = curr;
                curr = temp;
            }

            // Connect previous group to new head
            prevGroupEnd.setNext(kth);
            prevGroupEnd = groupStart;
        }

        return dummy.getNext();
    }

    // Helper: Get the k-th node from current node
    private static Node getKthNode(Node current, int k) {
        while (current != null && k > 0) {
            current = current.getNext();
            k--;
        }
        return current;
    }
}
