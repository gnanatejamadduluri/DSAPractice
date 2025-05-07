package stackAndQueue;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class CustomMaxHeap {
	private ArrayList<Integer> heap;

    public CustomMaxHeap() {
        heap = new ArrayList<>();
    }

    // Add a new value
    public void add(int val) {
        heap.add(val);
        siftUp(heap.size() - 1);
    }

    // Return max value
    public int peek() {
        if (heap.isEmpty()) throw new NoSuchElementException("Heap is empty");
        return heap.get(0);
    }

    // Remove and return max value
    public int poll() {
        if (heap.isEmpty()) throw new NoSuchElementException("Heap is empty");

        int max = heap.get(0);
        int last = heap.remove(heap.size() - 1);

        if (!heap.isEmpty()) {
            heap.set(0, last);
            siftDown(0);
        }

        return max;
    }

    private void siftUp(int index) {
        while (index > 0) {
            int parent = (index - 1) / 2;

            if (heap.get(index) > heap.get(parent)) {
                swap(index, parent);
                index = parent;
            } else {
                break;
            }
        }
    }

    private void siftDown(int index) {
        int left = 2 * index + 1;
        int right = 2 * index + 2;
        int largest = index;

        if (left < heap.size() && heap.get(left) > heap.get(largest)) {
            largest = left;
        }

        if (right < heap.size() && heap.get(right) > heap.get(largest)) {
            largest = right;
        }

        if (largest != index) {
            swap(index, largest);
            siftDown(largest);
        }
    }

    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    public ArrayList<Integer> printHeap() {
        System.out.println("Heap: " + heap);
        return heap;
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    public int size() {
        return heap.size();
    }
}
