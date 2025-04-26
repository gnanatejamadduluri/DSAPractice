package linkedList;

import java.util.PriorityQueue;

import linkedListNeeds.Node;

public class MergeKSortedLists {
	public static Node mergeKLists(Node[] lists) {
        PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> a.getData() - b.getData());
        
        // Add the head of each list to the min-heap
        for (Node list : lists) {
            if (list != null) pq.add(list);
        }

        Node dummy = new Node(0);
        Node current = dummy;

        while (!pq.isEmpty()) {
            Node min = pq.poll();
            current.setNext(min);
            current = current.getNext();

            if (min.getNext() != null) {
                pq.add(min.getNext());
            }
        }

        return dummy.getNext();
    }

}
