public class MyArrayListQueue<T> {
    MyArrayList<T> arrayList;
    /*
    Constructor
     */
    MyArrayListQueue() {
        arrayList = new MyArrayList<>();
    }
    /*
    Returns the value at the front of queue
     */
    public T peek() {
        return arrayList.get(0);
    }
    /*
    Adds value at the front of queue
     */
    public T enqueue(T value) {
        arrayList.add(value);
        return value;
    }
    /*
    Removes value at the front of the queue
     */
    public T dequeue() {
        T value = peek();
        arrayList.remove(0);
        return value;
    }
    /*
    Returns the size of the queue
     */
    public int size() {
        return arrayList.size();
    }
    /*
    Returns true if queue is empty and false if it isn't
     */
    public boolean isEmpty() {
        if (arrayList.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}
