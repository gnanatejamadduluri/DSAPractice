package stackAndQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class CustomMinHeap {
	List<Integer> heap;

    public CustomMinHeap() {
        heap = new ArrayList<>();
    }

    // Insert element
    public void add(int val) {
        heap.add(val);
        siftUp(heap.size() - 1);
    }

    // Remove and return min element
    public int poll() {
        if (heap.isEmpty()) throw new NoSuchElementException();

        int root = heap.get(0);
        int last = heap.remove(heap.size() - 1);
        if (!heap.isEmpty()) {
            heap.set(0, last);
            siftDown(0);
        }
        return root;
    }

    public int peek() {
        return heap.get(0);
    }

    private void siftUp(int idx) {
        while (idx > 0) {
            int parent = (idx - 1) / 2;
            if (heap.get(idx) < heap.get(parent)) {
                swap(idx, parent);
                idx = parent;
            } else break;
        }
    }

    private void siftDown(int idx) {
        int left = 2 * idx + 1;
        int right = 2 * idx + 2;
        int smallest = idx;

        if (left < heap.size() && heap.get(left) < heap.get(smallest)) smallest = left;
        if (right < heap.size() && heap.get(right) < heap.get(smallest)) smallest = right;

        if (smallest != idx) {
            swap(idx, smallest);
            siftDown(smallest);
        }
    }

    private void swap(int i, int j) {
        int tmp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, tmp);
    }

    public List<Integer> print() {
        System.out.println("Heap: " + heap);
        return heap;
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }
}
