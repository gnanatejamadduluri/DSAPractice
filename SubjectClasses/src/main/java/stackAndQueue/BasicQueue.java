package stackAndQueue;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Queue;

public class BasicQueue {
	 public static LinkedHashMap<String, String> response;

	 public static LinkedHashMap<String, String> main(String[] args) {
	        response= new LinkedHashMap<>();
		 	Queue<Integer> queue = new LinkedList<>();

	        queue.add(10);
	        queue.add(20);
	        queue.add(30);
	        response.put("Queue", queue.toString());
	        response.put("Poll1",queue.poll().toString());
	        response.put("Peek1", queue.peek().toString());
	        System.out.println(queue.poll()); // 10
	        System.out.println(queue.peek()); // 20
	        return response;
	    }
}
