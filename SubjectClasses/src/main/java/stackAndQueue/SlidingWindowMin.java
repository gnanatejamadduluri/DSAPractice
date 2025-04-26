package stackAndQueue;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMin {
	 public int[] minSlidingWindow(int[] nums, int k) {
	        Deque<Integer> deque = new LinkedList<>();
	        int[] result = new int[nums.length - k + 1];

	        for (int i = 0; i < nums.length; i++) {
	            // Remove from back if greater than current
	            while (!deque.isEmpty() && nums[deque.peekLast()] > nums[i]) {
	                deque.pollLast();
	            }

	            deque.offerLast(i);

	            // Remove elements outside the window
	            if (deque.peekFirst() <= i - k) {
	                deque.pollFirst();
	            }

	            // Start storing results when we hit window size
	            if (i >= k - 1) {
	                result[i - k + 1] = nums[deque.peekFirst()];
	            }
	        }

	        return result;
	    }
}
