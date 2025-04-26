package stackAndQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

import queueNeeds.Task;

public class CustomPriorityQueue {
	 public static void main(String[] args) {
	        PriorityQueue<Task> taskQueue = new PriorityQueue<>(Comparator.comparingInt(t -> t.getPriority()));

	        taskQueue.add(new Task("Write Report", 2));
	        taskQueue.add(new Task("Fix Bug", 1));
	        taskQueue.add(new Task("Email Client", 3));

	        while (!taskQueue.isEmpty()) {
	            System.out.println(taskQueue.poll().getName()); // Least priority number = highest importance
	        }
	    }
}
