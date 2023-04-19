public class MyLinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;
    private static class Node<E> {
        E val;
        Node<E> next, previous;

        Node(E val) {
            this.val = val;
            this.next = null;
        }
    }
    MyLinkedList() {
        this.head = null;
        this. size = 0;
    }

}
