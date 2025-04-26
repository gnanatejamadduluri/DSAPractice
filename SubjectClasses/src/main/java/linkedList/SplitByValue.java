package linkedList;

import linkedListNeeds.Node;

public class SplitByValue {
	public static Node[] splitByValue(Node head, int x) {
        Node lessDummy = new Node(0);
        Node greaterDummy = new Node(0);

        Node less = lessDummy, greater = greaterDummy;

        while (head != null) {
            if (head.getData() < x) {
                less.setNext(head);
                less = less.getNext();
            } else {
                greater.setNext(head);
                greater = greater.getNext();
            }
            head = head.getNext();
        }

        // Cut off extra references
        less.setNext(null);
        greater.setNext(null);

        return new Node[]{lessDummy.getNext(), greaterDummy.getNext()};
    }
}
