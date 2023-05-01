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
    }
}