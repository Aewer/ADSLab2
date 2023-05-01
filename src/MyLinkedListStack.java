public class MyLinkedListStack<T> {
    MyLinkedList<T> linkedList;
    MyLinkedListStack() {
        linkedList = new MyLinkedList<>();
    }
    public T push(T value) {
        linkedList.add(value);
        return value;
    }
    public T peek() {
        return linkedList.get(linkedList.size() - 1);
    }
}
