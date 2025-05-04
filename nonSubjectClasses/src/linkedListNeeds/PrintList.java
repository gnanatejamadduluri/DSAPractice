package linkedListNeeds;

public class PrintList {
	 public static String printList(Node head) {
		 String s= "";
		 while (head != null) {
	            System.out.print(head.getData() + " → ");
	            s= s+" "+head.getData()+" → ";
	            head = head.getNext();
	        }
	        System.out.println("null");s=s+null;
	        return s;
}
}