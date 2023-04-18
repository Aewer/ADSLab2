public class myArrayList<T> implements myList<T> {
    private T[] arr;
    private int size;
    public myArrayList() {
        this.arr = (T[]) new Object[5];
        this.size = 0;
    }
    public int size() {
        return size;
    }
    public boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == o) {
                return true;
            }
        }
        return false;
    }
    public void add(T item) {
        if (size == arr.length) {
            increaseLength();
        }
        arr[size++] = item;
    }
    public void add(T item, int index) {
        checkIndex(index);
        if (size == arr.length) {
            increaseLength();
        }
        size++;
        for (int i = size; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = item;
    }
    public void increaseLength() {
        T[] newArr = (T[]) new Object[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }
    public T get(int index) {
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
    public T remove(int index) {
        checkIndex(index);
        T value = arr[index];
        for (int i = index + 1; i < size; i++) {
            arr[i - 1] = arr[i];
        }
        size -= 1;
        return value;
    }
    public boolean remove(T item) {
        if (contains(item)) {
            for (int i = indexOf(item) + 1; i < size; i++) {
                arr[i - 1] = arr[i];
            }
            size -= 1;
            return true;
        }
        return false;
    }
    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == o) {
                return i;
            }
        }
        return -1;
    }
    public int lastIndexOf(Object o) {
        for (int i = size; i >= 0; i--) {
            if (arr[i] == o) {
                return i;
            }
        }
        return -1;
    }
    public void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }
}
