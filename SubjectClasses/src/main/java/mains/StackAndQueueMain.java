package mains;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

import linkedList.CircularQueue;
import stackAndQueue.BasicQueue;
import stackAndQueue.CustomMaxHeap;
import stackAndQueue.CustomMinHeap;
import stackAndQueue.CustomPriorityQueue;
import stackAndQueue.DequeExample;
import stackAndQueue.HistogramArea;
import stackAndQueue.MinStack;
import stackAndQueue.MonotonicQueue;
import stackAndQueue.NextGreaterElement;
import stackAndQueue.NextSmallerElement;
import stackAndQueue.SlidingWindowMin;
import stackAndQueue.StackExample;
import stackAndQueue.TopKLargest;
import stackAndQueue.ValidParentheses;
import stackAndQueue.LRUCache;
import stackAndQueue.LRUCacheManual;
import stackAndQueue.LRUCacheReentrantLock;
import stackAndQueue.LRUCacheThreadSafe;
import stackAndQueue.MaxHeapExample;
import stackAndQueue.MinHeapExample;

public class StackAndQueueMain {

	static Scanner S1 = new Scanner(System.in);
	
	public class SEG extends StackExample {
		public static void main(String[] args) {
		StackExample.main(args);
		}
	}
	
	public class NGE extends NextGreaterElement {
		public static void main(String[] args) {
	        int[] nums = {4, 5, 2, 10};
	        int[] res = nextGreater(nums);

	        System.out.println("Next Greater Elements:");
	        for (int val : res) {
	            System.out.print(val + " ");
	        }
	    }
	}

	public class VPT extends ValidParentheses {
		public static void main(String[] args) {
	        String input = "{[()]}";
	        System.out.println("Is Valid? " + isValid(input)); // true
	    }
	}
	
	public class NSE extends NextSmallerElement {
		public static void main(String[] args) {
	        int[] nums = {4, 8, 5, 2, 25};
	        int[] res = nextSmaller(nums);

	        System.out.println("Next Smaller Elements:");
	        for (int val : res) {
	            System.out.print(val + " ");
	        }
	    }
	}
	
	public class HGA extends HistogramArea {
		public static void main(String[] args) {
	        int[] heights = {2, 1, 5, 6, 2, 3};
	        int area = largestRectangleArea(heights);
	        System.out.println("Max Area: " + area);
	    }
	}
	
	public class MNS extends MinStack {
		public static void main(String[] args) {
	        MinStack ms = new MinStack();

	        ms.push(5);
	        ms.push(3);
	        ms.push(7);
	        System.out.println("Min: " + ms.getMin()); // 3

	        ms.pop(); // removes 7
	        System.out.println("Top: " + ms.top());   // 3
	        System.out.println("Min: " + ms.getMin()); // 3

	        ms.pop(); // removes 3
	        System.out.println("Min: " + ms.getMin()); // 5
	    }
	}
	
	public class BSQ extends BasicQueue {
		public static void main(String[] args) {
			BasicQueue.main(args);
		}
	}
	
	public class CCQ extends CircularQueue {
		public CCQ(int capacity) {
			super(capacity);
			// TODO Auto-generated constructor stub
		}
		public static void main(String[] args) {
			System.out.println("NEED TO BUILD A TEST CASE");
		}
	}
	
	public class DQE extends DequeExample {
		public static void main(String[] args) {
	        Deque<Integer> deque = new LinkedList<>();

	        deque.addFirst(1);  // Front
	        deque.addLast(2);   // Back

	        System.out.println(deque.removeFirst()); // 1
	        System.out.println(deque.removeLast());  // 2
	    }
	}
	
	public class MNQ extends MonotonicQueue {
		public static void main(String[] args) {
	        MonotonicQueue mq = new MonotonicQueue();
	        int[] result = mq.maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7}, 3);

	        System.out.println(Arrays.toString(result)); // [3,3,5,5,6,7]
	    }
	}
	
	public class LRUC extends LRUCache {

		/**
		 * 
		 */
		private static final long serialVersionUID = 5447900762537840381L;

		public LRUC(int capacity) {
			super(capacity);
			// TODO Auto-generated constructor stub
		}
		
		public static void main(String[] args) {
	        LRUCache cache = new LRUCache(2);

	        cache.put(1, 1);
	        cache.put(2, 2);
	        System.out.println(cache.get(1)); // 1

	        cache.put(3, 3); // evicts key 2
	        System.out.println(cache.get(2)); // -1

	        cache.put(4, 4); // evicts key 1
	        System.out.println(cache.get(1)); // -1
	        System.out.println(cache.get(3)); // 3
	        System.out.println(cache.get(4)); // 4
	    }
		
	}
	
	public class SWMN extends SlidingWindowMin {
		public static void main(String[] args) {
	        SlidingWindowMin swm = new SlidingWindowMin();
	        int[] result = swm.minSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3);

	        System.out.println("Sliding Window Min:");
	        System.out.println(Arrays.toString(result)); // [-1, -3, -3, -3, 3, 3]
	    }
	}
	
	public class LRUCM extends LRUCacheManual {

		public LRUCM(int capacity) {
			super(capacity);
			// TODO Auto-generated constructor stub
		}
		public static void main(String[] args) {
	        LRUCache cache = new LRUCache(2);

	        cache.put(1, 1);
	        cache.put(2, 2);
	        System.out.println(cache.get(1)); // 1

	        cache.put(3, 3); // evicts key 2
	        System.out.println(cache.get(2)); // -1

	        cache.put(4, 4); // evicts key 1
	        System.out.println(cache.get(1)); // -1
	        System.out.println(cache.get(3)); // 3
	        System.out.println(cache.get(4)); // 4
	    }
	}
	
	public class LRUCTS extends LRUCacheThreadSafe {
		public LRUCTS(int capacity) {
			super(capacity);
			// TODO Auto-generated constructor stub
		}

		public static void main(String[] args) {
	        LRUCache cache = new LRUCache(2);

	        // Example thread-safe test
	        Runnable task = () -> {
	            cache.put(1, 100);
	            System.out.println(Thread.currentThread().getName() + " put(1, 100)");
	            System.out.println(Thread.currentThread().getName() + " get(1): " + cache.get(1));
	        };

	        Thread t1 = new Thread(task, "Thread-A");
	        Thread t2 = new Thread(task, "Thread-B");

	        t1.start();
	        t2.start();
	    }
	}
	
	public class LRUCRL extends LRUCacheReentrantLock {
		public LRUCRL(int capacity) {
			super(capacity);
			// TODO Auto-generated constructor stub
		}

		public static void main(String[] args) {
	        LRUCache cache = new LRUCache(2);

	        Runnable task1 = () -> {
	            cache.put(1, 10);
	            System.out.println(Thread.currentThread().getName() + " put(1,10)");
	            System.out.println(Thread.currentThread().getName() + " get(1): " + cache.get(1));
	        };

	        Runnable task2 = () -> {
	            cache.put(2, 20);
	            System.out.println(Thread.currentThread().getName() + " put(2,20)");
	            System.out.println(Thread.currentThread().getName() + " get(2): " + cache.get(2));
	        };

	        Thread t1 = new Thread(task1, "Worker-1");
	        Thread t2 = new Thread(task2, "Worker-2");

	        t1.start();
	        t2.start();
	    }
	}
	
	public class MHE extends MinHeapExample {
		public static void main(String[] args) {
			MinHeapExample.main(args);
		}
	}
	
	public class MXHE extends MaxHeapExample {
		public static void main(String[] args) {
			MaxHeapExample.main(args);
		}
	}
	
	public class CPQ extends CustomPriorityQueue {
		public static void main(String[] args) {
			CustomPriorityQueue.main(args);
		}
	}
	
	public class TKL extends TopKLargest {
		public static void main(String[] args) {
	        int[] nums = {3, 10, 2, 1, 20, 5, 8};
	        int k = 3;
	        System.out.println("Top " + k + " largest: " + findTopK(nums, k));
	    }
	}
	
	public class CMH extends CustomMinHeap {
		 public static void main(String[] args) {
		        CustomMinHeap h = new CustomMinHeap();
		        h.add(10);
		        h.add(3);
		        h.add(7);
		        h.add(1);
		        h.print(); // Heap: [1, 3, 7, 10]

		        System.out.println("Poll: " + h.poll()); // 1
		        h.print(); // Heap: [3, 10, 7]
		    }
	}
	
	public class CMXH extends CustomMaxHeap {
		public static void main(String[] args) {
	        CustomMaxHeap maxHeap = new CustomMaxHeap();

	        maxHeap.add(15);
	        maxHeap.add(10);
	        maxHeap.add(30);
	        maxHeap.add(40);
	        maxHeap.add(20);

	        maxHeap.printHeap(); // Should be [40, 20, 30, 10, 15] or similar valid heap

	        System.out.println("Max element (peek): " + maxHeap.peek()); // 40

	        System.out.println("Removed max (poll): " + maxHeap.poll()); // 40
	        maxHeap.printHeap(); // New max should be at top
	    }
	}
	
	public static void main(String[] args) {
		System.out.println("Choose from the below options of Stack & Queue: \n 1. StackExample 2. NextGreaterElement 3. ValidParentheses #MusicPlaylist \n "
				+ "4. NextSmallerElement 5. HistogramArea 6. MinStack \n"
				+ " 7. BasicQueue 8. CircularQueue 9. DequeExample \n"
				+ " 10. MonotonicQueue 11. LRUCache 12. SlidingWindowMin \n"
				+ " 13. LRUCacheManual 14. LRUCacheThreadSafe 15. LRUCacheReentrantLock \n"
				+ " 16. MinHeapExample 17. MaxHeapExample 18. CustomPriorityQueue \n"
				+ " 19. TopKLargest 20. CustomMinHeap 21. CustomMaxHeap");
		int a = S1.nextInt();
		while (a!=-1) {
		if (a==1) {SEG.main(args); a=0;}
		else if (a==2) {NGE.main(args);a=0;}
		else if (a==3) {VPT.main(args);a=0;}
		else if (a==4) {NSE.main(args);a=0;}
		else if (a==5) {HGA.main(args);a=0;}
		else if (a==6) {MNS.main(args);a=0;}
		else if (a==7) {BSQ.main(args);a=0;}
		else if (a==8) {CCQ.main(args);a=0;}
		else if (a==9) {DQE.main(args);a=0;}
		else if (a==10) {MNQ.main(args);a=0;}
		else if (a==11) {LRUC.main(args);a=0;}
		else if (a==12) {SWMN.main(args);a=0;}
		else if (a==13) {LRUCM.main(args);a=0;}
		else if (a==14) {LRUCTS.main(args);a=0;}
		else if (a==15) {LRUCRL.main(args);a=0;}
		else if (a==16) {MHE.main(args);a=0;}
		else if (a==17) {MXHE.main(args);a=0;}
		else if (a==18) {CPQ.main(args);a=0;}
		else if (a==19) {TKL.main(args);a=0;}
		else if (a==20) {CMH.main(args);a=0;}
		else if (a==21) {CMXH.main(args);a=0;}
		else {break;}
		}
	}
}
