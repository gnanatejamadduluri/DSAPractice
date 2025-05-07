package subjectServices;

import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mains.StackAndQueueMain;
import stackAndQueue.BasicQueue;
import stackAndQueue.CustomPriorityQueue;
import stackAndQueue.MaxHeapExample;
import stackAndQueue.MinHeapExample;
import stackAndQueue.StackExample;

@CrossOrigin
@RestController
@RequestMapping("/StackAndQueue")
public class StackAndQueueServices {
	
	@GetMapping("/StackExample")
	 public Map<String, String> getStackExample() {
		 Map<String, String> response = StackExample.main(null);
		 return response;
	    }
		
	@GetMapping("/NextGreaterElement")
	 public Map<String, String> getNextGreaterElement() {
		 Map<String, String> response = StackAndQueueMain.NGE.main(null);
		 return response;
	    }
	
	@GetMapping("/ValidParentheses")
	 public Map<String, String> getValidParentheses() {
		 Map<String, String> response = StackAndQueueMain.VPT.main(null);
		 return response;
	    }
	
	@GetMapping("/NextSmallerElement")
	 public Map<String, String> getNextSmallerElement() {
		 Map<String, String> response = StackAndQueueMain.NSE.main(null);
		 return response;
	    }
	
	@GetMapping("/HistogramArea")
	 public Map<String, String> getHistogramArea() {
		 Map<String, String> response = StackAndQueueMain.HGA.main(null);
		 return response;
	    }
	
	@GetMapping("/MinStack")
	 public Map<String, String> getMinStack() {
		 Map<String, String> response = StackAndQueueMain.MNS.main(null);
		 return response;
	    }
	
	@GetMapping("/BasicQueue")
	 public Map<String, String> getBasicQueue() {
		 Map<String, String> response = BasicQueue.main(null);
		 return response;
	    }
	
	@GetMapping("/CircularQueue")
	 public Map<String, String> getCircularQueue() {
		 Map<String, String> response = StackAndQueueMain.CCQ.main(null);
		 return response;
	    }
	
	@GetMapping("/DequeExample")
	 public Map<String, String> getDequeExample() {
		 Map<String, String> response = StackAndQueueMain.DQE.main(null);
		 return response;
	    }
	@GetMapping("/MonotonicQueue")
	 public Map<String, String> getMonotonicQueue() {
		 Map<String, String> response = StackAndQueueMain.MNQ.main(null);
		 return response;
	    }
	
	@GetMapping("/LRUCache")
	 public Map<String, String> getLRUCache() {
		 Map<String, String> response = StackAndQueueMain.LRUC.main(null);
		 return response;
	    }
	
	@GetMapping("/SlidingWindowMin")
	 public Map<String, String> getSlidingWindowMin() {
		 Map<String, String> response = StackAndQueueMain.SWMN.main(null);
		 return response;
	    }
	
	@GetMapping("/LRUCacheManual")
	 public Map<String, String> getLRUCacheManual() {
		 Map<String, String> response = StackAndQueueMain.LRUCM.main(null);
		 return response;
	    }
	
	@GetMapping("/LRUCacheThreadSafe")
	 public Map<String, String> getLRUCacheThreadSafe() {
		 Map<String, String> response = StackAndQueueMain.LRUCTS.main(null);
		 return response;
	    }
	
	@GetMapping("/LRUCacheReentrantLock")
	 public Map<String, String> getLRUCacheReentrantLock() {
		 Map<String, String> response = StackAndQueueMain.LRUCRL.main(null);
		 return response;
	    }
	
	@GetMapping("/MinHeapExample")
	 public Map<String, String> getMinHeapExample() {
		 Map<String, String> response = MinHeapExample.main(null);
		 return response;
	    }
	
	@GetMapping("/MaxHeapExample")
	 public Map<String, String> getMaxHeapExample() {
		 Map<String, String> response = MaxHeapExample.main(null);
		 return response;
	    }
	
	@GetMapping("/CustomPriorityQueue")
	 public Map<String, String> getCustomPriorityQueue() {
		 Map<String, String> response = CustomPriorityQueue.main(null);
		 return response;
	    }
	
	@GetMapping("/TopKLargest")
	 public Map<String, String> getTopKLargest() {
		 Map<String, String> response = StackAndQueueMain.TKL.main(null);
		 return response;
	    }
	
	@GetMapping("/CustomMinHeap")
	 public Map<String, String> getCustomMinHeap() {
		 Map<String, String> response = StackAndQueueMain.CMH.main(null);
		 return response;
	    }
	
	@GetMapping("/CustomMaxHeap")
	 public Map<String, String> getCustomMaxHeap() {
		 Map<String, String> response = StackAndQueueMain.CMXH.main(null);
		 return response;
	    }
}
