package stackAndQueue;
import queueNeeds.Node;

import java.util.HashMap;
import java.util.Map;

public class LRUCacheManual {
	
	private final int capacity;
    private final Map<Integer, Node> map;
    private final Node head, tail;

    public LRUCacheManual(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        this.head =new Node(0, 0);
        this.tail = new Node(0, 0);
        head.setNext(tail);
        tail.setPrev(head);
    }

    // Remove node from list
    private void remove(Node node) {
        node.getPrev().setNext(node.getNext());
        node.getNext().setPrev(node.getPrev());
    }

    // Add node right after head
    private void insertAtHead(Node node) {
        node.setNext(head.getNext());
        node.setPrev(head);

        head.getNext().setPrev(node);
        head.setNext(node);
    }

    // Synchronized get method
    public synchronized int get(int key) {
        if (!map.containsKey(key)) return -1;

        Node node = map.get(key);
        remove(node);
        insertAtHead(node);
        return node.getValue();
    }

    // Synchronized put method
    public synchronized void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.setValue(value);
            remove(node);
            insertAtHead(node);
        } else {
            if (map.size() == capacity) {
                Node lru = tail.getPrev();
                remove(lru);
                map.remove(lru.getKey());
            }
            Node newNode = new Node(key, value);
            map.put(key, newNode);
            insertAtHead(newNode);
        }
    }

}
