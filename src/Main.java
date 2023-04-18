import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        myArrayList arrayList = new myArrayList();
        arrayList.add(5);
        arrayList.add(30);
        arrayList.add(15);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(30);
        arrayList.add(35);
        arrayList.add(12, 2);
        //arrayList.remove("b");
        for (int i = 0; i < arrayList.getSize(); i++) {
            System.out.print(arrayList.get(i));
            System.out.print(" ");
        }
        System.out.println();
        System.out.println(arrayList.lastIndexOf(30));
    }
}