package linkedListNeeds;

public class Node {
    private int data;
    private Node next;
    private Node prev;

    public Node(int data) {
        this.setData(data);
        this.setNext(null);
        this.setPrev(null);
    }
    
	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}
}