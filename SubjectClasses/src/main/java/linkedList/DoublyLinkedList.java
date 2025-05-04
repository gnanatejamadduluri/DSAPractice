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
    String s= "";
    // Print forward
    public String printForward() {
    	s="";
    	Node current = head;
        while (current != null) {
            System.out.print(current.getData() + " ⇄ ");
            s= s+" "+current.getData()+" → ";
            current = current.getNext();
        }
        System.out.println("null");s=s+null;
        return s;
    }
    // Print backward
    public String printBackward() {
    	s="";
        Node current = tail;
        while (current != null) {
            System.out.print(current.getData() + " ⇄ ");
            s= s+" "+current.getData()+" ⇄ ";
            current = current.getPrev();
        }
        System.out.println("null"); s=s+null;
        return s;
    }

}
