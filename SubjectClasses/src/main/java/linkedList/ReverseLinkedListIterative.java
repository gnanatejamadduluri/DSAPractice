package linkedList;

import linkedListNeeds.Node;

public class ReverseLinkedListIterative {
	public static Node reverseList(Node head) {
        Node prev = null;
        Node current = head;

        while (current != null) {
            Node next = current.getNext(); // save next
            current.setNext(prev);      // reverse pointer
            prev = current;           // move prev forward
            current = next;           // move current forward
        }

        return prev; // new head
    }
}
