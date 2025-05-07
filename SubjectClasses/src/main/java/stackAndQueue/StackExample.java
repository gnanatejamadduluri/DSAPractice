package stackAndQueue;

import java.util.LinkedHashMap;
import java.util.Stack;

public class StackExample {
	public static LinkedHashMap<String, String> response;

	public static LinkedHashMap<String, String> main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        response = new LinkedHashMap<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        response.put("Push1", "10");
        response.put("Push2", "20");
        response.put("Push3", "30");
        response.put("Stack", stack.toString());
        response.put("Peek1", stack.peek().toString());
        response.put("Pop1", stack.pop().toString());
        response.put("Pop2", stack.pop().toString());
        response.put("IsEmpty?", Boolean.toString(stack.isEmpty()));
        return response;
    }
}
