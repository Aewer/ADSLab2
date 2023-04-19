public class MyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
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
    public void add(T item) {
        Node<T> newNode = new Node<>(item);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    public T get(int index) {
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.val;
    }
    public int size() {
        return size;
    }
}
