package linkedList;

import linkedListNeeds.Node;

public class PalindromeLinkedList {
	public static boolean isPalindrome(Node head) {
        if (head == null || head.getNext() == null) return true;

        // Step 1: Find middle
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }

        // Step 2: Reverse second half
        Node secondHalf = reverse(slow);
        Node firstHalf = head;

        // Step 3: Compare both halves
        while (secondHalf != null) {
            if (firstHalf.getData() != secondHalf.getData()) {
                return false;
            }
            firstHalf = firstHalf.getNext();
            secondHalf = secondHalf.getNext();
        }

        return true;
    }

    // Helper: Reverse a linked list
    private static Node reverse(Node head) {
        Node prev = null;
        while (head != null) {
            Node next = head.getNext();
            head.setNext(prev);
            prev = head;
            head = next;
        }
        return prev;
    }
}
