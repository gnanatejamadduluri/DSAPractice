package mains;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import linkedList.CircularQueue;
import linkedListNeeds.PrintList;
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
		public static LinkedHashMap<String, String> main(String[] args) {
		StackExample.main(args);
		return StackExample.response;
		}
	}
	
	public class NGE extends NextGreaterElement {
		public static LinkedHashMap<String, String> main(String[] args) {
			LinkedHashMap<String,String> response = new LinkedHashMap<>();
	        int[] nums = {4, 5, 2, 10};
	        response.put("Original",Arrays.toString(nums));
	        int[] res = nextGreater(nums);
	        response.put("Next Greater Elements ", Arrays.toString(res));
	        System.out.println("Next Greater Elements:");
	        for (int val : res) {
	            System.out.print(val + " ");
	        }
	        return response;
	    }
	}

	public class VPT extends ValidParentheses {
		public static LinkedHashMap<String, String> main(String[] args) {
			LinkedHashMap<String,String> response = new LinkedHashMap<>();
	        String input = "{[()]}";
	        response.put("Given Parantheses", input);
	        System.out.println("Is Valid? " + isValid(input)); // true
	        response.put("Is Valid??", Boolean.toString(isValid(input)));
	        return response;
	    }
	}
	
	public class NSE extends NextSmallerElement {
		public static LinkedHashMap<String, String> main(String[] args) {
			LinkedHashMap<String,String> response = new LinkedHashMap<>();
	        int[] nums = {4, 8, 5, 2, 25};
	        response.put("Original",Arrays.toString(nums));
	        int[] res = nextSmaller(nums);
	        response.put("Next Smaller Elements ", Arrays.toString(res));
	        System.out.println("Next Smaller Elements:");
	        for (int val : res) {
	            System.out.print(val + " ");
	        }
	        return response;
	    }
	}
	
	public class HGA extends HistogramArea {
		public static LinkedHashMap<String, String> main(String[] args) {
			LinkedHashMap<String,String> response = new LinkedHashMap<>();
	        int[] heights = {2, 1, 5, 6, 2, 3};
	        response.put("Heights of a Histogram", Arrays.toString(heights));
	        int area = largestRectangleArea(heights);
	        response.put("Max Area'", Integer.toString(area));
	        System.out.println("Max Area: " + area);
	        return response;
	    }
	}
	
	public class MNS extends MinStack {
		public static LinkedHashMap<String, String> main(String[] args) {
	        LinkedHashMap<String,String> response = new LinkedHashMap<>();
			MinStack ms = new MinStack();
	        ms.push(5);
	        ms.push(3);
	        ms.push(7);
	        response.put("Push1","5");
	        response.put("Push2","3");
	        response.put("Push3","7");
	        System.out.println("Min: " + ms.getMin()); // 3
	        response.put("Min1", Integer.toString(ms.getMin()));
	        response.put("Pop1", ""); ms.pop(); // removes 7
	        response.put("Top1", Integer.toString(ms.top()));
	        System.out.println("Top: " + ms.top());   // 3
	        response.put("Min2", Integer.toString(ms.getMin()));
	        System.out.println("Min: " + ms.getMin()); // 3
	        response.put("Pop2", "");
	        ms.pop(); // removes 3
	        response.put("Min3", Integer.toString(ms.getMin()));
	        System.out.println("Min: " + ms.getMin()); // 5
	        return response;
	    }
	}
	
	public class BSQ extends BasicQueue {
		public static LinkedHashMap<String, String> main(String[] args) {
			BasicQueue.main(args);
			return BasicQueue.response;
		}
	}
	
	public class CCQ extends CircularQueue {
		public CCQ(int capacity) {
			super(capacity);
			// TODO Auto-generated constructor stub
		}
		public static HashMap<String,String> main(String[] args) {
			System.out.println("NEED TO BUILD A TEST CASE");
			HashMap<String,String> response = new HashMap<>();
			response.put("EXIT", "NEED TO BUILD A TEST CASE");
			return response;
		}
	}
	
	public class DQE extends DequeExample {
		public static LinkedHashMap<String, String> main(String[] args) {
			LinkedHashMap<String,String> response = new LinkedHashMap<>();
	        Deque<Integer> deque = new LinkedList<>();
	        deque.addFirst(1);  // Front
	        deque.addLast(2);   // Back
	        deque.addLast(3);
	        deque.addLast(4);
	        deque.addLast(3);
	        response.put("Adding to the queue", "1 2 3 4 3");
	        response.put("Queue", deque.toString());
	        response.put("Deque - remove first", deque.removeFirst().toString());
	        response.put("Deque - remove Last", deque.removeLast().toString());
	        response.put("Final Queue", deque.toString());
	        return response; 
	    }
	}
	
	public class MNQ extends MonotonicQueue {
		public static LinkedHashMap<String, String> main(String[] args) {
			LinkedHashMap<String, String> response = new LinkedHashMap<>();
			MonotonicQueue mq = new MonotonicQueue();
		    int[] result = mq.maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7}, 3);
		    response.put("Array Taken", "{1,3,-1,-3,5,3,6,7}");
		    response.put("Monotonic Queue", Arrays.toString(result));
		    System.out.println(Arrays.toString(result)); // [3,3,5,5,6,7]
		    return response;
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
		
		public static LinkedHashMap<String, String> main(String[] args) {
	        LinkedHashMap<String,String> response = new LinkedHashMap<>();
			LRUCache cache = new LRUCache(2);

	        cache.put(1, 1);
	        cache.put(2, 2);
	        response.put("Inserting-1", "(1,1)");
	        response.put("Inserting-2", "(2,2)");
	        response.put("Printing cache-1", cache.toString());
	        response.put("Get is used to get value of 1", Integer.toString(cache.get(1)));
	        response.put("Inserting-3", "(3,3)");
	        cache.put(3, 3); // evicts key 2
	        response.put("Printing Cache-2", cache.toString());
	        response.put("Get is used to get value of 2", Integer.toString(cache.get(2)));
	        response.put("Inserting-4", "(4,4)");
	        cache.put(4, 4); // evicts key 1
	        response.put("Printing cache-3", cache.toString());
	        System.out.println(response);
	        return response;
	    }
		
	}
	
	public class SWMN extends SlidingWindowMin {
		public static LinkedHashMap<String, String> main(String[] args) {
			LinkedHashMap<String,String> response = new LinkedHashMap<>();
	        SlidingWindowMin swm = new SlidingWindowMin();
	        int[] result = swm.minSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3);
	        response.put("Array Taken", "{1, 3, -1, -3, 5, 3, 6, 7}");
		    response.put("Sliding Window Min ", Arrays.toString(result));
	        System.out.println(response); // [-1, -3, -3, -3, 3, 3]
	        return response;
	    }
	}
	
	public class LRUCM extends LRUCacheManual {

		public LRUCM(int capacity) {
			super(capacity);
			// TODO Auto-generated constructor stub
		}
		public static LinkedHashMap<String, String> main(String[] args) {
	        LRUCache cache = new LRUCache(2);
	        LinkedHashMap<String,String> response = new LinkedHashMap<>();
	        cache.put(1, 1);
	        cache.put(2, 2);
	        response.put("Inserting-1", "(1,1)");
	        response.put("Inserting-2", "(2,2)");
	        response.put("Printing cache-1", cache.toString());
	        response.put("Get is used to get value of 1", Integer.toString(cache.get(1)));
	        response.put("Inserting-3", "(3,3)");
	        cache.put(3, 3); // evicts key 2
	        response.put("Printing Cache-2", cache.toString());
	        response.put("Get is used to get value of 2", Integer.toString(cache.get(2)));
	        response.put("Inserting-4", "(4,4)");
	        cache.put(4, 4); // evicts key 1
	        response.put("Printing cache-3", cache.toString());
	        System.out.println(response);
	        response.put("Exit", "GO THROUGH THE CODE TO FIND THE DIFFERENCE WITH NON MANUAL");
	        return response;	    }
	}
	
	public class LRUCTS extends LRUCacheThreadSafe {
		public LRUCTS(int capacity) {
			super(capacity);
			// TODO Auto-generated constructor stub
		}

		public static LinkedHashMap<String, String> main(String[] args) {
	        LRUCache cache = new LRUCache(2);
	        LinkedHashMap<String,String> response = new LinkedHashMap<>();
	        // Example thread-safe test
	        Runnable task = () -> {
	            cache.put(1, 100);
	            response.put(Thread.currentThread().getName(), " put(1, 100)");
	            response.put(Thread.currentThread().getName(), " get(1): " + cache.get(1));
	            response.put("Printing Cache-1 for " + Thread.currentThread().getName(), cache.toString());
	            cache.put(3, 300);
	            response.put(Thread.currentThread().getName(), " put(3, 300)");
	            response.put(Thread.currentThread().getName(), " get(3): " + cache.get(3));
	            response.put("Printing Cache-2 for " + Thread.currentThread().getName(), cache.toString());
	            System.out.println(response);
	        };

	        Thread t1 = new Thread(task, "Thread-A");
	        Thread t2 = new Thread(task, "Thread-B");
	
	        t1.start();
	        t2.start();
	        response.put("On Exit", "GO THROUGH THE CODE TO FIND THE DIFFERENCE WITH OTHER LRU");
	        return response;
	    }
	}
	
	public class LRUCRL extends LRUCacheReentrantLock {
		public LRUCRL(int capacity) {
			super(capacity);
			// TODO Auto-generated constructor stub
		}

		public static HashMap<String, String> main(String[] args) {
	        LRUCache cache = new LRUCache(2);
	        HashMap<String,String> response = new HashMap<>();
	        Runnable task1 = () -> {
	            cache.put(1, 10);
	            response.put(Thread.currentThread().getName(), " put(1, 10)");
	            response.put(Thread.currentThread().getName(), " get(1): " + cache.get(1));
	            response.put("Printing Cache-1 for " + Thread.currentThread().getName(), cache.toString());
	        };

	        Runnable task2 = () -> {
	            cache.put(2, 20);
	            response.put(Thread.currentThread().getName(), " put(2, 20)");
	            response.put(Thread.currentThread().getName(), " get(2): " + cache.get(2));
	            response.put("Printing Cache-2 for " + Thread.currentThread().getName(), cache.toString());
	        };

	        Thread t1 = new Thread(task1, "Worker-1");
	        Thread t2 = new Thread(task2, "Worker-2");

	        t1.start();
	        t2.start();
	        response.put("On Exit", "GO THROUGH THE CODE TO FIND THE DIFFERENCE WITH OTHER LRU");
	        return response;
	    }
	}
	
	public class MHE extends MinHeapExample {
		public static Map<String, String> main(String[] args) {
			MinHeapExample.main(args);
			return MinHeapExample.response;
		}
	}
	
	public class MXHE extends MaxHeapExample {
		public static Map<String, String> main(String[] args) {
			MaxHeapExample.main(args);
			return MaxHeapExample.response;
		}
	}
	
	public class CPQ extends CustomPriorityQueue {
		public static Map<String, String> main(String[] args) {
			CustomPriorityQueue.main(args);
			return CustomPriorityQueue.response;
		}
	}
	
	public class TKL extends TopKLargest {
		public static Map<String, String> main(String[] args) {
			LinkedHashMap<String,String> response = new LinkedHashMap<>();
	        int[] nums = {3, 10, 2, 1, 20, 5, 8};
	        response.put("Given Array", "{3, 10, 2, 1, 20, 5, 8}");
	        response.put("count", "3");
	        int k = 3;
	        response.put("Top " + k + " largest ",(findTopK(nums, k).toString()));
	        System.out.println("Top " + k + " largest: " + findTopK(nums, k));
	        return response;
	    }
	}
	
	public class CMH extends CustomMinHeap {
		 public static LinkedHashMap<String, String> main(String[] args) {
			 LinkedHashMap<String,String> response = new LinkedHashMap<>();
		        CustomMinHeap h = new CustomMinHeap();
		        h.add(10);
		        h.add(3);
		        h.add(7);
		        h.add(1);
		        response.put("Adding-1", "10");
		        response.put("Adding-2'", "3");
		        response.put("Adding-3", "7");
		        response.put("Adding-4", "1");
		        response.put("Heap1",(h.print().toString())); // Heap: [1, 3, 7, 10]
		        response.put("Poll" , Integer.toString(h.poll())); // 1
		        response.put("Heap2", h.print().toString());  // Heap: [3, 10, 7]
		        response.put("TO EXPERIMENT MORE", "GO THROUGH THE BACKEND CODE");
		        return response;
		    }
	}
	
	public class CMXH extends CustomMaxHeap {
		public static Map<String, String> main(String[] args) {
	        CustomMaxHeap maxHeap = new CustomMaxHeap();
	        LinkedHashMap<String,String> response = new LinkedHashMap<>();
	        maxHeap.add(15);
	        maxHeap.add(10);
	        maxHeap.add(30);
	        maxHeap.add(40);
	        maxHeap.add(20);
	        response.put("Adding-1", "15");
	        response.put("Adding-2'", "10");
	        response.put("Adding-3", "30");
	        response.put("Adding-4", "40");
	        response.put("Adding-4", "20");
	        response.put("Heap1", maxHeap.printHeap().toString()); // Should be [40, 20, 30, 10, 15] or similar valid heap
	        response.put("Max element (peek) ", Integer.toString(maxHeap.peek())); // 40
	        response.put("Removed max (poll) " ,Integer.toString(maxHeap.poll())); // 40
	        response.put("Max Heap new",maxHeap.printHeap().toString()); // New max should be at top
	        response.put("TO EXPERIMENT MORE", "GO THROUGH THE BACKEND CODE");
	        return response;
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
