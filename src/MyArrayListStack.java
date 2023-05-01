public class MyArrayListStack<T> {
    MyArrayList<T> arrayList;
    MyArrayListStack() {
        arrayList = new MyArrayList<>();
    }
    public T push(T value) {
        arrayList.add(value);
        return value;
    }
    public T peek() {
        return arrayList.get(arrayList.size() - 1);
    }
    public T pop() {
        T value = peek();
        arrayList.remove(arrayList.size() - 1);
        return value;
    }
}
