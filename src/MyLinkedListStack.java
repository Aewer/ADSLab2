public class MyLinkedListStack<T> {
    MyLinkedList<T> linkedList;
    /*
    Constructor
     */
    MyLinkedListStack() {
        linkedList = new MyLinkedList<>();
    }
    /*
    Adds value to the top of stack
     */
    public T push(T value) {
        linkedList.add(value);
        return value;
    }
    /*
    Returns value at the top of stack
     */
    public T peek() {
        return linkedList.get(linkedList.size() - 1);
    }
    /*
    Removes and returns the top value in stack
     */
    public T pop() {
        T value = peek();
        linkedList.remove(linkedList.size() - 1);
        return value;
    }
    /*
    Returns the size of the stack
     */
    public int size() {
        return linkedList.size();
    }
    /*
    Returns true if stack is empty and false if it isn't
     */
    public boolean isEmpty() {
        if (linkedList.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}
