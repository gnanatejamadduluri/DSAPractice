package queueNeeds;

	public class CircularQueue {
		 int[] data;
		    int front, rear, size, capacity;

		    public CircularQueue(int k) {
		        data = new int[k];
		        capacity = k;
		        front = 0;
		        rear = -1;
		        size = 0;
		    }

		    public boolean enqueue(int val) {
		        if (size == capacity) return false;
		        rear = (rear + 1) % capacity;
		        data[rear] = val;
		        size++;
		        return true;
		    }

		    public boolean dequeue() {
		        if (size == 0) return false;
		        front = (front + 1) % capacity;
		        size--;
		        return true;
		    }

		    public int front() {
		        if (size == 0) return -1;
		        return data[front];
		    }

		    public boolean isFull() {
		        return size == capacity;
		    }

		    public boolean isEmpty() {
		        return size == 0;
		    }
}
