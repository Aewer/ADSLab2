public class MyArrayListQueue<T> {
    MyArrayList<T> arrayList;
    MyArrayListQueue() {
        arrayList = new MyArrayList<>();
    }
    public T peek() {
        return arrayList.get(0);
    }
    public T enqueue(T value) {
        arrayList.add(value);
        return value;
    }
    public T dequeue() {
        T value = peek();
        arrayList.remove(0);
        return value;
    }
}
