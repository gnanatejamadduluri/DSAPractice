package linkedList;

import linkedListNeeds.Node;

public class SinglyLinkedList {
	Node head = null;

    // Insert at end
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(newNode);
    }

    // Print all nodes
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.getData() + " → ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
