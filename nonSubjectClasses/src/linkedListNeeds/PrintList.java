package linkedListNeeds;

public class PrintList {
	 public static void printList(Node head) {
	        while (head != null) {
	            System.out.print(head.getData() + " → ");
	            head = head.getNext();
	        }
	        System.out.println("null");
	    }
}
