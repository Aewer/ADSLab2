public class MyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;
    private static class Node<T> {
        T elem;
        Node<T> next, previous;

        Node(T elem) {
            this.elem = elem;
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
        return current.elem;
    }
    public int size() {
        return size;
    }
    public void remove (int index) {
        if (index == 0) {
            head = head.next;
        } else {
            Node<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }
}
