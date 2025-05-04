package linkedList;

import linkedListNeeds.Song;

public class CircularPlaylist {
	Song head = null;
    Song tail = null;

    // Add song to playlist
    public String addSong(String name) {
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
        return name;
    }

    // Play songs in loop n times
    public String play(int loops) {
        if (head == null) return null;
        String s= loops+" Loops = ";
        Song current = head;
        int count = 0;

        System.out.println("Now Playing:");
        while (count < loops) {
            System.out.println("♪ " + current.getName());
            s = s + " ♪ " + current.getName();
            current = current.getNext();
            if (current == head) count++;
        }
        return s;
    }
}
