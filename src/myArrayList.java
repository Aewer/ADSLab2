public class myArrayList<T> {
    private T[] arr;
    private int size;
    public myArrayList() {
        this.arr = (T[]) new Object[5];
        this.size = 0;
    }
    public void add(T value) {
        if (size == arr.length) {
            increaseLength();
        }
        arr[size++] = value;
    }
    public void increaseLength() {
        T[] newArr = (T[]) new Object[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }
    public T getElement(int index) {
        checkIndex(index);
        return arr[index];
    }
    public int getSize() {
        return size;
    }
    public void clear() {
        this.arr = (T[]) new Object[5];
        this.size = 0;
    }
    public void delete(int index) {
        checkIndex(index);
        for (int i = index + 1; i < size; i++) {
            arr[i - 1] = arr[i];
        }
        size -= 1;
    }
    public void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }
}
