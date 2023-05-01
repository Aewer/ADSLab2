public class MyLinkedListQueue<T> {
    MyLinkedList<T> linkedList;
    /*
    Constructor
     */
    MyLinkedListQueue() {
        linkedList = new MyLinkedList<>();
    }
    /*
    Returns the value at the front of queue
     */
    public T peek() {
        return linkedList.get(0);
    }
    /*
    Adds value at the front of queue
     */
    public T enqueue(T value) {
        linkedList.add(value);
        return value;
    }
    /*
    Removes value at the front of the queue
     */
    public T dequeue() {
        T value = peek();
        linkedList.remove(0);
        return value;
    }
    /*
    Returns the size of the queue
     */
    public int size() {
        return linkedList.size();
    }
    /*
    Returns true if queue is empty and false if it isn't
     */
    public boolean isEmpty() {
        if (linkedList.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}
