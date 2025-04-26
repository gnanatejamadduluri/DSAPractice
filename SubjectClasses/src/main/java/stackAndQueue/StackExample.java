package stackAndQueue;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.peek()); // 30 (top element, not removed)
        System.out.println(stack.pop());  // 30 (removed)
        System.out.println(stack.pop());  // 20
        System.out.println(stack.isEmpty()); // false
    }
}
