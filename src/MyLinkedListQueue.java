public class MyLinkedListQueue<T> {
    MyLinkedList<T> linkedList;
    MyLinkedListQueue() {
        linkedList = new MyLinkedList<>();
    }
    public T peek() {
        return linkedList.get(0);
    }
    public T enqueue(T value) {
        linkedList.add(value);
        return value;
    }
    public T dequeue() {
        T value = peek();
        linkedList.remove(0);
        return value;
    }
}
