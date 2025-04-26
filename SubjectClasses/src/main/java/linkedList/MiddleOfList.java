package linkedList;

import linkedListNeeds.Node;

public class MiddleOfList {
	 public static int findMiddle(Node head) {
	        Node slow = head;
	        Node fast = head;

	        while (fast != null && fast.getNext() != null) {
	            slow = slow.getNext();          // 1 step
	            fast = fast.getNext().getNext();     // 2 steps
	        }

	        return slow.getData();
	    }

}
