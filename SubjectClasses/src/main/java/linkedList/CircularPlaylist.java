package linkedList;

import linkedListNeeds.Song;

public class CircularPlaylist {
	Song head = null;
    Song tail = null;

    // Add song to playlist
    public void addSong(String name) {
        Song newSong = new Song(name);
        if (head == null) {
            head = newSong;
            tail = newSong;
            tail.setNext(head); // circular
        } else {
            tail.setNext(newSong);
            tail = newSong;
            tail.setNext(head);
        }
    }

    // Play songs in loop n times
    public void play(int loops) {
        if (head == null) return;

        Song current = head;
        int count = 0;

        System.out.println("Now Playing:");
        while (count < loops) {
            System.out.println("♪ " + current.getName());
            current = current.getNext();
            if (current == head) count++;
        }
    }
}
