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
    public void enqueue(int value) {
        if (size == capacity) {
            System.out.println("Queue is full!");
            return;
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
    }

    // Dequeue
    public void dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty!");
            return;
        }

        int value = tail.getNext().getData();
        if (tail.getNext() == tail) {
            tail = null;
        } else {
            tail.setNext(tail.getNext().getNext());
        }
        size--;
        System.out.println("Dequeued: " + value);
    }

    // Peek front
    public void peek() {
        if (tail == null) {
            System.out.println("Queue is empty!");
        } else {
            System.out.println("Front: " + tail.getNext().getData());
        }
    }

    public void display() {
        if (tail == null) {
            System.out.println("Queue is empty!");
            return;
        }

        Node current = tail.getNext();
        System.out.print("Queue: ");
        do {
            System.out.print(current.getData() + " → ");
            current = current.getNext();
        } while (current != tail.getNext());
        System.out.println("(back to front)");
    }
}
