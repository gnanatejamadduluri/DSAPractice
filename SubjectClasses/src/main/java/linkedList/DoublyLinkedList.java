package linkedList;
import linkedListNeeds.Node;

public class DoublyLinkedList {
	Node head = null;
    Node tail = null;

    // Insert at end
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.setNext(newNode);
        newNode.setPrev(tail);
        tail = newNode;
    }

    // Print forward
    public void printForward() {
        Node current = head;
        while (current != null) {
            System.out.print(current.getData() + " ⇄ ");
            current = current.getNext();
        }
        System.out.println("null");
    }

    // Print backward
    public void printBackward() {
        Node current = tail;
        while (current != null) {
            System.out.print(current.getData() + " ⇄ ");
            current = current.getPrev();
        }
        System.out.println("null");
    }

}
