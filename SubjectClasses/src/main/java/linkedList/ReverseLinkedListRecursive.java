package linkedList;

import linkedListNeeds.Node;

public class ReverseLinkedListRecursive {
	public static Node reverseList(Node head) {
        // Base case: if list is empty or has one node
        if (head == null || head.getNext() == null) {
            return head;
        }

        // Reverse the rest of the list
        Node newHead = reverseList(head.getNext());

        // Put the current node at the end
        head.getNext().setNext(head);
        head.setNext(null);

        return newHead;
    }
}
