public class Main {
    public static void main(String[] args) {
        MyArrayListStack stackArrayList = new MyArrayListStack();
        stackArrayList.push(1);
        stackArrayList.push(2);
        stackArrayList.push(3);
        stackArrayList.push(4);
        System.out.println("MyArrayListStack");
        System.out.println(stackArrayList.isEmpty());
        System.out.println(stackArrayList.peek());
        System.out.println(stackArrayList.pop());
        System.out.println(stackArrayList.peek());

        System.out.println("MyArrayListQueue");
        MyArrayListQueue queueArrayList = new MyArrayListQueue();
        queueArrayList.enqueue(1);
        queueArrayList.enqueue(2);
        queueArrayList.enqueue(3);
        queueArrayList.enqueue(4);
        System.out.println(queueArrayList.peek());
        queueArrayList.dequeue();
        System.out.println(queueArrayList.peek());

        System.out.println("MyLinkedListQueue");
        MyLinkedListQueue queueLinkedList = new MyLinkedListQueue();
        queueLinkedList.enqueue(1);
        queueLinkedList.enqueue(2);
        queueLinkedList.enqueue(3);
        queueLinkedList.enqueue(4);
        System.out.println(queueLinkedList.peek());
        queueLinkedList.dequeue();
        System.out.println(queueLinkedList.peek());
    }
}