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
    public T pop() {
        T value = peek();
        linkedList.remove(linkedList.size() - 1);
        return value;
    }
    public int size() {
        return linkedList.size();
    }
    public boolean isEmpty() {
        if (linkedList.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}
