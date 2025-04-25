package mains;

import java.util.Scanner;

import linkedList.BrowserHistory;
import linkedList.CircularPlaylist;
import linkedList.CircularQueue;
import linkedList.CycleDetection;
import linkedList.DoublyLinkedList;
import linkedList.RoundRobinScheduler;
import linkedList.SinglyLinkedList;
import linkedListNeeds.Node;

public class LinkedListMain {
	
	static Scanner S1 = new Scanner(System.in);

	public class SLL extends SinglyLinkedList {
		public static void main(String[] args) {
	        SinglyLinkedList list = new SinglyLinkedList();
	        list.append(10);
	        list.append(20);
	        list.append(30);
	        list.printList(); // 10 → 20 → 30 → null
	    }
	}
	
	public class DLL extends DoublyLinkedList {
		public static void main(String[] args) {
	        DoublyLinkedList list = new DoublyLinkedList();
	        list.append(100);
	        list.append(200);
	        list.append(300);
	        list.printForward();  // 100 ⇄ 200 ⇄ 300 ⇄ null
	        list.printBackward(); // 300 ⇄ 200 ⇄ 100 ⇄ null
	    }
	}
	
	public class CPL extends CircularPlaylist {
		public static void main(String[] args) {
	        CircularPlaylist playlist = new CircularPlaylist();
	        playlist.addSong("Blinding Lights");
	        playlist.addSong("Levitating");
	        playlist.addSong("As It Was");

	        playlist.play(2); // Plays 2 full loops
	    }
	}
	
	public class BH extends BrowserHistory {
		public static void main(String[] args) {
	        BrowserHistory browser = new BrowserHistory();
	        browser.visit("google.com");
	        browser.visit("wikipedia.org");
	        browser.visit("openai.com");

	        browser.show();    // openai.com
	        browser.back();    // wikipedia.org
	        browser.back();    // google.com
	        browser.forward(); // wikipedia.org
	        browser.forward(); // openai.com
	    }
	}
	
	public class CQ extends CircularQueue {
		public CQ(int capacity) {
			super(capacity);
			// TODO Auto-generated constructor stub
		}

		public static void main(String[] args) {
	        CircularQueue queue = new CircularQueue(5);
	        queue.enqueue(10);
	        queue.enqueue(20);
	        queue.enqueue(30);
	        queue.display();

	        queue.dequeue();
	        queue.peek();
	        queue.display();
	    }
	}
	
	public class RRS extends RoundRobinScheduler {
		public static void main(String[] args) {
	        RoundRobinScheduler scheduler = new RoundRobinScheduler();
	        scheduler.addTask("Task-A", 4);
	        scheduler.addTask("Task-B", 6);
	        scheduler.addTask("Task-C", 3);

	        scheduler.runScheduler(2); // Each gets 2 units per round
	    }
	}
	
	public class CD extends CycleDetection {
		public static void main(String[] args) {
	        Node head = new Node(1);
	        head.setNext(new Node(2));
	        head.getNext().setNext(new Node(3));
	        head.getNext().getNext().setNext(new Node(4));

	        // Create cycle: 4 → 2
	        head.getNext().getNext().getNext().setNext(head.getNext());

	        System.out.println("Has cycle: " + hasCycle(head)); // true
	    }
	}
	
	public static void main(String[] args) {
		
		System.out.println("Choose from the below options of LinkedList: \n 1. SinglyLinkedList 2. DoublyLinkedList 3. CircularPlaylist #MusicPlaylist \n 4. BrowserHistory 5. CircularQueue 6. RoundRobinScheduler \n"
				+ " 7. CycleDetection \n");
		int a = S1.nextInt();
		while (a!=-1) {
		if (a==1) {SLL.main(args); a=0;}
		else if (a==2) {DLL.main(args);a=0;}
		else if (a==3) {CPL.main(args);a=0;}
		else if (a==4) {BH.main(args);a=0;}
		else if (a==5) {CQ.main(args);a=0;}
		else if (a==6) {RRS.main(args);a=0;}
		else if (a==7) {CD.main(args);a=0;}
		else {break;}
	}	
}
}