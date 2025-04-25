package linkedListNeeds;

public class Song {
	String name;
    Song next;

    public Song(String name) {
        this.name = name;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Song getNext() {
		return next;
	}

	public void setNext(Song next) {
		this.next = next;
	}
}
