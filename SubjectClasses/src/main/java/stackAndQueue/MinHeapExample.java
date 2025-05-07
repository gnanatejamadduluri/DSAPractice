package stackAndQueue;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class MinHeapExample {
	 public static Map<String, String> response;

	 public static Map<String, String> main(String[] args) {
	        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
	        response = new LinkedHashMap<>();
	        minHeap.add(10);
	        minHeap.add(100);
	        minHeap.add(29);
	        minHeap.add(39);
	        response.put("Adding-1", "10");
	        response.put("Adding-2", "100");
	        response.put("Adding-3", "29");
	        response.put("Adding-4", "39");
	        response.put("Heap", minHeap.toString());
	        int n=1;
	        while (!minHeap.isEmpty()) {
	        	response.put("Min Heap-"+n,minHeap.poll().toString());
	        	n++;
	          //  System.out.println(minHeap.poll()); // Removes and returns smallest element
	        }
	        System.out.println(response);
	        return response;
	    }
}
