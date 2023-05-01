public class MyArrayListStack<T> {
    MyArrayList<T> arrayList;
    /*
    Constructor
     */
    MyArrayListStack() {
        arrayList = new MyArrayList<>();
    }
    /*
    Adds value to the top of stack
     */
    public T push(T value) {
        arrayList.add(value);
        return value;
    }
    /*
    Returns value at the top of stack
     */
    public T peek() {
        return arrayList.get(arrayList.size() - 1);
    }
    /*
    Removes and returns the top value in stack
     */
    public T pop() {
        T value = peek();
        arrayList.remove(arrayList.size() - 1);
        return value;
    }
    /*
    Returns the size of the stack
     */
    public int size() {
        return arrayList.size();
    }
    /*
    Returns true if stack is empty and false if it isn't
     */
    public boolean isEmpty() {
        if (arrayList.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}
