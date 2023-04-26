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
        this.size = 0;
    }
    boolean contains(Object o) {
        Node<T> current = head;
        if (head.elem == o) {
            return true;
        }
        for (int i = 0; i < size - 1; i++) {
            current = current.next;
            if (current.elem == o) {
                return true;
            }
        }
        return false;
    }
    public void add(T item) {
        Node<T> newNode = new Node<>(item);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.previous = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    public T get(int index) {
        checkIndex(index);
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
        checkIndex(index);
        if (index == 0) {
            head = head.next;
        }
        else if (index == size - 1) {
            tail = tail.previous;
        } else {
            Node<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }
    public int indexOf(Object o) {
        Node<T> current = head;
        if (head.elem == o) {
            return 0;
        }
        for (int i = 0; i < size - 1; i++) {
            current = current.next;
            if (current.elem == o) {
                return i + 1;
            }
        }
        return -1;
    }
    public int lastIndexOf(Object o) {
        Node<T> current = tail;
        if (tail.elem == o) {
            return size - 1;
        }
        if (head.elem == o) {
            return 0;
        }
        for (int i = size; i > 0; i--) {
            current = current.previous;
            if (current.elem == o) {
                return i - 2;
            }
        }
        return -1;
    }
    public void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }
}
