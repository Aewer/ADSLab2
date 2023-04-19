public class Main {
    public static void main(String[] args) {
        /*MyArrayList arrayList = new MyArrayList();
        arrayList.add(5);
        arrayList.add(30);
        arrayList.add(75);
        arrayList.add(1);
        arrayList.add(43);
        arrayList.add(30);
        arrayList.add(7);
        //arrayList.add(12, 2);
        arrayList.sort();
        for (int i = 0; i < arrayList.getSize(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();
        System.out.println(arrayList.lastIndexOf(30));*/
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("d");
        linkedList.add("e");
        linkedList.remove(1);
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.print(linkedList.get(i) + " ");
        }
        System.out.println();
        System.out.println(linkedList.contains("a"));
    }
}