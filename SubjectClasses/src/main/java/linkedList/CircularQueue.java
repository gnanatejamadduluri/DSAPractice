package linkedList;

import linkedListNeeds.Node;

public class CircularQueue {

	private Node tail = null;
    private int size = 0;
    private final int capacity;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
    }

    // Enqueue
    public String enqueue(int value) {
        if (size == capacity) {
            System.out.println("Queue is full!");
            return "Queue is empty!";
        }

        Node newNode = new Node(value);
        if (tail == null) {
            tail = newNode;
            tail.setNext(newNode);
        } else {
            newNode.setNext(tail.getNext());
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
        System.out.println("Enqueued: " + value);
        return Integer.toString(value);
    }

    // Dequeue
    public String dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty!");
            return "Queue is empty!";
        }

        int value = tail.getNext().getData();
        if (tail.getNext() == tail) {
            tail = null;
        } else {
            tail.setNext(tail.getNext().getNext());
        }
        size--;
        System.out.println("Dequeued: " + value);
        return Integer.toString(value);
    }

    // Peek front
    public String peek() {
        if (tail == null) {
            System.out.println("Queue is empty!");
            return "Queue is empty!";
        } else {
            System.out.println("Front: " + tail.getNext().getData());
        }
        return Integer.toString(tail.getNext().getData());
    }

    public String display() {
        if (tail == null) {
            System.out.println("Queue is empty!");
            return "Queue is empty!";
        }
        String s = ""; 
        Node current = tail.getNext();
        System.out.print("Queue: ");
        do {
        	s = s + current.getData() + " → ";
            System.out.print(current.getData() + " → ");
            current = current.getNext();
        } while (current != tail.getNext());
        System.out.println("(back to front)"); 
        s = s+" (back to front)";
        return s;
    }
   
}
