package stackAndQueue;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

import queueNeeds.Task;

public class CustomPriorityQueue {
	public static Map<String, String> response;
	public static Map<String, String> main(String[] args) {
	        PriorityQueue<Task> taskQueue = new PriorityQueue<>(Comparator.comparingInt(t -> t.getPriority()));
	        response = new LinkedHashMap<>();
	        taskQueue.add(new Task("Write Report", 2));
	        taskQueue.add(new Task("Fix Bug", 1));
	        taskQueue.add(new Task("Email Client", 3));
	        response.put("Write Report", "2");
	        response.put("Fix Bug", "1");
	        response.put("Email Client", "3");
	        int n=1;
	        while (!taskQueue.isEmpty()) {
	        	response.put("Max Heap-"+n,taskQueue.poll().getName());
	        	n++;
	           // System.out.println(taskQueue.poll().getName()); // Least priority number = highest importance
	        }
	        return response;
	    }
}
