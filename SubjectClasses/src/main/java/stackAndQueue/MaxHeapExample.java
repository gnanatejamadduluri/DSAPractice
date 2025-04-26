package stackAndQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeapExample {
	public static void main(String[] args) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        maxHeap.add(5);
        maxHeap.add(1);
        maxHeap.add(9);
        maxHeap.add(3);

        while (!maxHeap.isEmpty()) {
            System.out.println(maxHeap.poll()); // Removes and returns largest element
        }
    }
}
