package stackAndQueue;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class MaxHeapExample {
	public static Map<String, String> response;
	public static Map<String, String> main(String[] args) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        response = new LinkedHashMap<>();
        maxHeap.add(10);
        maxHeap.add(100);
        maxHeap.add(29);
        maxHeap.add(39);
        response.put("Adding-1", "10");
        response.put("Adding-2", "100");
        response.put("Adding-3", "29");
        response.put("Adding-4", "39");
        response.put("Heap", maxHeap.toString());
        int n=1;
        while (!maxHeap.isEmpty()) {
        	response.put("Max Heap-"+n,maxHeap.poll().toString());
        	n++;
          //  System.out.println(maxHeap.poll()); // Removes and returns largest element
        }
        System.out.println(response);
        return response;
	}
}
