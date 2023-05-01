public class MyArrayListQueue<T> {
    MyArrayList<T> arrayList;
    MyArrayListQueue() {
        arrayList = new MyArrayList<>();
    }
    public T peek() {
        return arrayList.get(0);
    }

}
