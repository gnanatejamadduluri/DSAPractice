package linkedList;

import java.util.HashMap;

import linkedListNeeds.Page;

public class BrowserHistory {
	Page current = null;
	HashMap<String,String> response = new HashMap<>();
	String s = "";
    // Visit a new page
    public HashMap<String, String> visit(String url) {
        Page newPage = new Page(url);
        if (current == null) {
            current = newPage;
            current.setNext(current);
            current.setPrev(current);
        } else {
            Page nextPage = current.getNext();
            newPage.setPrev(current);
            newPage.setNext(nextPage);

            current.setNext(newPage);
            nextPage.setPrev(newPage);

            current = newPage;
        }
        response.put(url," Got Added");
        return response;
    }

    // Move back
    public String back() {
        current = current.getPrev();
        s = "⬅️ Back to: " + current.getUrl();
        System.out.println("⬅️ Back to: " + current.getUrl());
        return s;
    }

    // Move forward
    public String forward() {
        current = current.getNext();
        s = "➡️ Forward to: " + current.getUrl();
        System.out.println("➡️ Forward to: " + current.getUrl());
        return s;
    }

    // Show current page
    public String show() {
    	s = "# Current Page: " + current.getUrl();
        System.out.println("📄 Current Page: " + current.getUrl());
        return s;
    }
}
