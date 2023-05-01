public class MyLinkedListQueue<T> {
    MyLinkedList<T> linkedList;
    MyLinkedListQueue() {
        linkedList = new MyLinkedList<>();
    }
    public T peek() {
        return linkedList.get(0);
    }
}
