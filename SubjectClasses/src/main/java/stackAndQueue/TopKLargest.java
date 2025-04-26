package stackAndQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class TopKLargest {
	public static List<Integer> findTopK(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.poll(); // remove the smallest in the top K
            }
        }

        return new ArrayList<>(minHeap); // top k largest
    }

}
