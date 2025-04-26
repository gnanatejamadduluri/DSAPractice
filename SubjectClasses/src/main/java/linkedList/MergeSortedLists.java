package linkedList;

import linkedListNeeds.Node;

public class MergeSortedLists {
	public static Node merge(Node l1, Node l2) {
        Node dummy = new Node(0);
        Node tail = dummy;

        while (l1 != null && l2 != null) {
            if (l1.getData() < l2.getData()) {
                tail.setNext(l1);
                l1 = l1.getNext();
            } else {
                tail.setNext(l2);
                l2 = l2.getNext();
            }
            tail = tail.getNext();
        }

        tail.setNext((l1 != null) ? l1 : l2);
        return dummy.getNext();
    }
}
