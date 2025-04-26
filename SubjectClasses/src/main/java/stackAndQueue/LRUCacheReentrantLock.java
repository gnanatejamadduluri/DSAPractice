package stackAndQueue;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

import queueNeeds.Node;
public class LRUCacheReentrantLock {
	private final int capacity;
    private final Map<Integer, Node> map;
    private final Node head, tail;
    private final ReentrantLock lock;

    public LRUCacheReentrantLock(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        this.lock = new ReentrantLock();
        this.head = new Node(0, 0);
        this.tail = new Node(0, 0);
        head.setNext(tail);
        tail.setPrev(head);
    }

    private void remove(Node node) {
        node.getPrev().setNext(node.getNext());
        node.getNext().setPrev(node.getPrev());
    }

    private void insertAtHead(Node node) {
        node.setNext(head.getNext());
        node.setPrev(head);

        head.getNext().setPrev(node);
        head.setNext(node);
    }

    public int get(int key) {
        lock.lock();
        try {
            if (!map.containsKey(key)) return -1;

            Node node = map.get(key);
            remove(node);
            insertAtHead(node);
            return node.getValue();
        } finally {
            lock.unlock();
        }
    }

    public void put(int key, int value) {
        lock.lock();
        try {
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
        } finally {
            lock.unlock();
        }
    }
}
