public class Main {
    public static void main(String[] args) {
        MyArrayList arrayList = new MyArrayList();
        arrayList.add(30);
        arrayList.add(5);
        arrayList.add(75);
        arrayList.add(1);
        arrayList.add(43);
        arrayList.add(30);
        arrayList.add(7);
        //arrayList.add(12, 2);
        arrayList.sort(0, 1);
        System.out.print("ArrayList: ");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();

        MyLinkedList linkedList = new MyLinkedList();
        /*linkedList.add("a");
        linkedList.add("b");
        linkedList.add("d");
        linkedList.add("c");
        linkedList.add("d");
        linkedList.add("c");
        linkedList.add("e");
        linkedList.add("a", 0);
        linkedList.remove("e");*/
        linkedList.add(7);
        linkedList.add(4);
        linkedList.add(3);
        linkedList.add(1);
        linkedList.add(2);
        linkedList.sort(1, 4);
        System.out.print("LinkedList: ");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.print(linkedList.get(i) + " ");
        }
    }
}