package linkedList;

import linkedListNeeds.Page;

public class BrowserHistory {
	Page current = null;

    // Visit a new page
    public void visit(String url) {
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
    }

    // Move back
    public void back() {
        current = current.getPrev();
        System.out.println("⬅️ Back to: " + current.getUrl());
    }

    // Move forward
    public void forward() {
        current = current.getNext();
        System.out.println("➡️ Forward to: " + current.getUrl());
    }

    // Show current page
    public void show() {
        System.out.println("📄 Current Page: " + current.getUrl());
    }
}
