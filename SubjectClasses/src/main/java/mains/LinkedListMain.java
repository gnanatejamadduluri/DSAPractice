package mains;
import linkedListNeeds.PrintList;

import java.util.LinkedHashMap;
import java.util.Scanner;

import linkedList.ArrayCycleDetection;
import linkedList.BrowserHistory;
import linkedList.CircularPlaylist;
import linkedList.CircularQueue;
import linkedList.CycleDetection;
import linkedList.DoublyLinkedList;
import linkedList.MergeKSortedLists;
import linkedList.MergeSortedLists;
import linkedList.MiddleOfList;
import linkedList.PalindromeLinkedList;
import linkedList.ReverseBetween;
import linkedList.ReverseKGroup;
import linkedList.ReverseLinkedListIterative;
import linkedList.ReverseLinkedListRecursive;
import linkedList.RoundRobinScheduler;
import linkedList.SinglyLinkedList;
import linkedList.SplitByValue;
import linkedList.SplitList;
import linkedList.StartOfCycle;
import linkedListNeeds.Node;

public class LinkedListMain {
	
	static Scanner S1 = new Scanner(System.in);

	public class SLL extends SinglyLinkedList {
		public static LinkedHashMap<String, String> main(String[] args) {
			LinkedHashMap<String,String> response = new LinkedHashMap<>();
	        SinglyLinkedList list = new SinglyLinkedList();
	        list.append(10);
	        list.append(20);
	        list.append(30);
	        response.put("Appending1 ", "10");
	        response.put("Appending2 ", "20");
	        response.put("Appending3 ", "30");
	        response.put("Singly Linked List ", list.printList()); // 10 → 20 → 30 → null
	        return response;
	    }
	}
	
	public class DLL extends DoublyLinkedList {
		public static LinkedHashMap<String, String> main(String[] args) {
	        LinkedHashMap<String,String> response = new LinkedHashMap<>();
			DoublyLinkedList list = new DoublyLinkedList();
	        list.append(100);
	        list.append(200);
	        list.append(300);
	        response.put("Appending1 ", "100");
	        response.put("Appending2 ", "200");
	        response.put("Appending3 ", "300");
	        response.put("Printing the list ", list.printForward()); // 100 ⇄ 200 ⇄ 300 ⇄ null
	        response.put("Reversed list ", list.printBackward()); // 300 ⇄ 200 ⇄ 100 ⇄ null
	        return response;
	    }
	}
	
	public class CPL extends CircularPlaylist {
		public static LinkedHashMap<String,String> main(String[] args) {
			LinkedHashMap<String,String> response = new LinkedHashMap<>();
	        CircularPlaylist playlist = new CircularPlaylist();
	        response.put(playlist.addSong("Levitating")," Got Added");
	        response.put(playlist.addSong("As It Was"), " Got Added");

	        response.put("Now Playing ",playlist.play(2)); // Plays 2 full loops
	    return response;
		}
	}
	
	public class BH extends BrowserHistory {
		public static LinkedHashMap<String, String> main(String[] args) {
			LinkedHashMap<String,String> response = new LinkedHashMap<>();
	        BrowserHistory browser = new BrowserHistory();
	        response.putAll(browser.visit("google.com"));
	        response.putAll(browser.visit("wikipedia.org"));
	        response.putAll(browser.visit("openai.com"));

	        response.put("1",browser.show());    // openai.com
	        response.put("2",browser.back());    // wikipedia.org
	        response.put("3",browser.back());    // google.com
	        response.put("4",browser.forward()); // wikipedia.org
	        response.put("5",browser.forward()); // openai.com
	        return response;
	    }
	}
	
	public class CQ extends CircularQueue {
		public CQ(int capacity) {
			super(capacity);
			// TODO Auto-generated constructor stub
		}

		public static LinkedHashMap<String, String> main(String[] args) {
	        CircularQueue queue = new CircularQueue(5);
	        LinkedHashMap<String,String> response = new LinkedHashMap<>();
	        queue.enqueue(10);
	        queue.enqueue(20);
	        queue.enqueue(30);
	        queue.display();
	        queue.dequeue();
	        queue.peek();
	        queue.display();
	        response.put(" Enqueued-1 ",queue.enqueue(10));
	        response.put(" Enqueued-2 ",queue.enqueue(20));
	        response.put(" Enqueued-3 ",queue.enqueue(30));
	        response.put(" Queue Display-1 ",queue.display());
	        response.put(queue.dequeue(), " Dequeued!");
	        response.put(queue.peek(), " Peek!");
	        response.put(" Queue Display-2 ",queue.display());
	        return response;
	    }
	}
	
	public class RRS extends RoundRobinScheduler {
		public static LinkedHashMap<String, String> main(String[] args) {
	        LinkedHashMap<String,String> response = new LinkedHashMap<>();
			RoundRobinScheduler scheduler = new RoundRobinScheduler();
	        scheduler.addTask("Task-A", 4);
	        scheduler.addTask("Task-B", 6);
	        scheduler.addTask("Task-C", 3);
	        response.put("Task-A ", "Burst Time=4");
	        response.put("Task-B ", "Burst Time=6");
	        response.put("Task-C ", "Burst Time=3");
	        response.put("Each gets 2 Units per round", "");
	       response.putAll(scheduler.runScheduler(2)); // Each gets 2 units per round
	       return response;
	    }
	}
	
	public class CD extends CycleDetection {
		public static LinkedHashMap<String, String> main(String[] args) {
			LinkedHashMap<String,String> response = new LinkedHashMap<>();
	        Node head = new Node(1);
	        head.setNext(new Node(2));
	        head.getNext().setNext(new Node(3));
	        head.getNext().getNext().setNext(new Node(4));

	        // Create cycle: 4 → 2
	        head.getNext().getNext().getNext().setNext(head.getNext());

	        System.out.println("Has cycle: " + hasCycle(head)); // true
	        response.put(" Has cycle??? ", Boolean.toString(hasCycle(head)));
	        return response;
	    }
	}
	
	public class MOL extends MiddleOfList {
		public static void main(String[] args) {
	        Node head = new Node(10);
	        head.setNext(new Node(20));
	        head.getNext().setNext(new Node(30));
	        head.getNext().getNext().setNext(new Node(40));
	        head.getNext().getNext().getNext().setNext(new Node(50));

	        System.out.println("Middle: " + findMiddle(head)); // 30
	    }
	}
	
	public class SOC extends StartOfCycle {
		public static void main(String[] args) {
	        Node head = new Node(1);
	        head.setNext(new Node(2));
	        head.getNext().setNext(new Node(3));
	        head.getNext().getNext().setNext(new Node(4));
	        head.getNext().getNext().getNext().setNext(new Node(5));

	        // Creating a cycle: 5 → 3
	        head.getNext().getNext().getNext().getNext().setNext(head.getNext().getNext());

	        Node start = detectCycleStart(head);

	        if (start != null) {
	            System.out.println("Cycle starts at node: " + start.getData());
	        } else {
	            System.out.println("No cycle detected.");
	        }
	    }
	}
	
	public class PLL extends PalindromeLinkedList {
		public static void main(String[] args) {
	        Node head = new Node(1);
	        head.setNext(new Node(2));
	        head.getNext().setNext(new Node(2));
	        head.getNext().getNext().setNext(new Node(1));

	        System.out.println("Is palindrome? " + isPalindrome(head)); // true
	    }
	}
	
	public class ACD extends ArrayCycleDetection {
		public static void main(String[] args) {
	        int[] nums = {1, 3, 0, 4, 2};
	        System.out.println("Array has cycle? " + hasCycle(nums)); // true
	    }
	}
	
	public class RLLI extends ReverseLinkedListIterative {
		public static void main(String[] args) {
	        Node head = new Node(1);
	        head.setNext(new Node(2));
	        head.getNext().setNext(new Node(3));
	        head.getNext().getNext().setNext(new Node(4));

	        System.out.print("Original: ");
	        PrintList.printList(head);

	        Node reversed = reverseList(head);

	        System.out.print("Reversed: ");
	        PrintList.printList(reversed);
	    }
	}
	
	public class RLLR extends ReverseLinkedListRecursive {
		public static void main(String[] args) {
	        Node head = new Node(10);
	        head.setNext(new Node(20));
	        head.getNext().setNext(new Node(30));

	        System.out.print("Original: ");
	        PrintList.printList(head);

	        Node reversed = reverseList(head);

	        System.out.print("Reversed: ");
	        PrintList.printList(reversed);
	    }
	}
	
	public class RBT extends ReverseBetween {
		public static void main(String[] args) {
	        Node head = new Node(1);
	        head.setNext(new Node(2));
	        head.getNext().setNext(new Node(3));
	        head.getNext().getNext().setNext(new Node(4));
	        head.getNext().getNext().getNext().setNext(new Node(5));

	        System.out.print("Original: ");
	        PrintList.printList(head);

	        Node result = reverseBetween(head, 2, 4);

	        System.out.print("Reversed [2,4]: ");
	        PrintList.printList(result);
	    }
	}
	
	public class RKG extends ReverseKGroup {
		public static void main(String[] args) {
	        Node head = new Node(1);
	        head.setNext(new Node(2));
	        head.getNext().setNext(new Node(3));
	        head.getNext().getNext().setNext(new Node(4));
	        head.getNext().getNext().getNext().setNext(new Node(5));

	        System.out.print("Original: ");
	        PrintList.printList(head);

	        Node result = reverseKGroup(head, 3);

	        System.out.print("Reversed in k=3: ");
	        PrintList.printList(result);
	    }
	}
	
	public class MSL extends MergeSortedLists {
		public static void main(String[] args) {
	        Node a = new Node(1);
	        a.setNext(new Node(3));
	        a.getNext().setNext(new Node(5));

	        Node b = new Node(2);
	        b.setNext(new Node(4));
	        b.getNext().setNext(new Node(6));

	        System.out.print("List A: ");
	        PrintList.printList(a);
	        System.out.print("List B: ");
	        PrintList.printList(b);

	        Node merged = merge(a, b);
	        System.out.print("Merged: ");
	        PrintList.printList(merged);
	    }
	}

	public class SPL extends SplitList {
		public static void main(String[] args) {
	        Node head = new Node(10);
	        head.setNext(new Node(20));
	        head.getNext().setNext(new Node(30));
	        head.getNext().getNext().setNext(new Node(40));
	        head.getNext().getNext().getNext().setNext(new Node(50));

	        System.out.print("Original: ");
	        PrintList.printList(head);

	        Node[] parts = splitList(head);
	        System.out.print("First Half: ");
	        PrintList.printList(parts[0]);
	        System.out.print("Second Half: ");
	        PrintList.printList(parts[1]);
	    }
	}
	
	public class MKSL extends MergeKSortedLists {
		public static void main(String[] args) {
	        Node[] lists = new Node[3];

	        lists[0] = new Node(1);
	        lists[0].setNext(new Node(4));
	        lists[0].getNext().setNext(new Node(7));

	        lists[1] = new Node(2);
	        lists[1].setNext(new Node(5));
	        lists[1].getNext().setNext(new Node(8));

	        lists[2] = new Node(3);
	        lists[2].setNext(new Node(6));
	        lists[2].getNext().setNext(new Node(9));

	        Node merged = mergeKLists(lists);
	        System.out.print("Merged k Lists: ");
	        PrintList.printList(merged);
	    }
	}
	
	public class SBV extends SplitByValue {
		public static void main(String[] args) {
	        Node head = new Node(5);
	        head.setNext(new Node(1));
	        head.getNext().setNext(new Node(8));
	        head.getNext().getNext().setNext(new Node(0));
	        head.getNext().getNext().getNext().setNext(new Node(6));

	        Node[] split = splitByValue(head, 5);

	        System.out.print("Less than 5: ");
	        PrintList.printList(split[0]);

	        System.out.print("Greater or equal to 5: ");
	        PrintList.printList(split[1]);
	    }
	}
	
	public static void main(String[] args) {
		
		System.out.println("Choose from the below options of LinkedList: \n 1. SinglyLinkedList 2. DoublyLinkedList 3. CircularPlaylist #MusicPlaylist \n 4. BrowserHistory 5. CircularQueue 6. RoundRobinScheduler \n"
				+ " 7. CycleDetection 8. MiddleOfList 9. StartOfCycle\n"
				+ " 10. PalindromeLinkedList 11. ArrayCycleDetection 12. ReverseLinkedListIterative \n"
				+ " 13. ReverseLinkedListRecursive 14. ReverseBetween 15. ReverseKGroup \n"
				+ " 16. MergeSortedLists 17. SplitList 18. MergeKSortedLists \n"
				+ " 19. SplitByValue");
		int a = S1.nextInt();
		while (a!=-1) {
		if (a==1) {SLL.main(args); a=0;}
		else if (a==2) {DLL.main(args);a=0;}
		else if (a==3) {CPL.main(args);a=0;}
		else if (a==4) {BH.main(args);a=0;}
		else if (a==5) {CQ.main(args);a=0;}
		else if (a==6) {RRS.main(args);a=0;}
		else if (a==7) {CD.main(args);a=0;}
		else if (a==8) {MOL.main(args);a=0;}
		else if (a==9) {SOC.main(args);a=0;}
		else if (a==10) {PLL.main(args);a=0;}
		else if (a==11) {ACD.main(args);a=0;}
		else if (a==12) {RLLI.main(args);a=0;}
		else if (a==13) {RLLR.main(args);a=0;}
		else if (a==14) {RBT.main(args);a=0;}
		else if (a==15) {RKG.main(args);a=0;}
		else if (a==16) {MSL.main(args);a=0;}
		else if (a==17) {SPL.main(args);a=0;}
		else if (a==18) {MKSL.main(args);a=0;}
		else if (a==19) {SBV.main(args);a=0;}
		else {break;}
	}	
}
}