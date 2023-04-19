public class MyLinkedList {
    private class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }
    Node head;
    MyLinkedList() {
        this.head = null;
    }
}
