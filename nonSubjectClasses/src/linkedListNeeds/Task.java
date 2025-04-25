package linkedListNeeds;

public class Task {

	String name;
    int burstTime;
    Task next;

    public Task(String name, int burstTime) {
        this.name = name;
        this.burstTime = burstTime;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBurstTime() {
		return burstTime;
	}

	public void setBurstTime(int burstTime) {
		this.burstTime = burstTime;
	}

	public Task getNext() {
		return next;
	}

	public void setNext(Task next) {
		this.next = next;
	}
}
