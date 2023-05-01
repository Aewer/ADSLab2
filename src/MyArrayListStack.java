public class MyArrayListStack<T> {
    MyArrayList<T> arrayList;
    MyArrayListStack() {
        arrayList = new MyArrayList<>();
    }
    public T push(T value) {
        arrayList.add(value);
        return value;
    }
}
