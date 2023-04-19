public class MyArrayList<T> implements MyList<T> {
    private T[] arr;
    private int size;
    /*
    @param arr is an empty array of length 5
    @param size is the number of entries in array
     */
    public MyArrayList() {
        this.arr = (T[]) new Object[5];
        this.size = 0;
    }
    /*
    @size returns the size of array
     */
    public int size() {
        return size;
    }
    /*
    @contains checks if arrayList contains an object and returns a boolean value
     */
    public boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == o) {
                return true;
            }
        }
        return false;
    }
    /*
    @add adds an item at the end of array and increases array length if it is not enough
     */
    public void add(T item) {
        if (size == arr.length) {
            increaseLength();
        }
        arr[size++] = item;
    }
    /*
    @add inserts an item at the given index
     */
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
    /*
    @increaseLength increases the length of an array twice
     */
    public void increaseLength() {
        T[] newArr = (T[]) new Object[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }
    /*
    @get returns the value at the given index
     */
    public T get(int index) {
        checkIndex(index);
        return arr[index];
    }
    /*
    @clear deletes all values in array
     */
    public void clear() {
        this.arr = (T[]) new Object[5];
        this.size = 0;
    }
    /*
    @remove removes the value at the given index
    @return removed value
     */
    public T remove(int index) {
        checkIndex(index);
        T value = arr[index];
        for (int i = index + 1; i < size; i++) {
            arr[i - 1] = arr[i];
        }
        size -= 1;
        return value;
    }
    /*
    @remove removes the given item from array.
    @return true if the item was in array, false otherwise
     */
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
    /*
    @indexOf returns the index of the given object if it exists, else returns -1
     */
    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == o) {
                return i;
            }
        }
        return -1;
    }
    /*
    @lastIndexOf returns the index of last occurence of the given object, else returns -1
    */
    public int lastIndexOf(Object o) {
        for (int i = size; i >= 0; i--) {
            if (arr[i] == o) {
                return i;
            }
        }
        return -1;
    }
    /*
    @sort sorts the array in ascending order only if it consists of integers
     */
    public void sort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if ((Integer) arr[j] > (Integer) arr[j + 1]) {
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    /*
    @checkIndex checks if an index exists and throws an exception if it doesn't
     */
    public void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }
}
