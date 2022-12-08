package linkedlist;

public class Test {
    public static void main(String[] args) {
        // Testing LinkedList -- START --
        System.out.println("Initializing LinkedList...");
        LinkedList<Integer> linkedList = new LinkedList<>();
        System.out.println("Inserting elements into the list");
        linkedList.insert(5);
        linkedList.insert(1);
        linkedList.insert(7);
        linkedList.insert(10);
        System.out.println("Traversing the list");
        linkedList.traverse();
        System.out.println();
        System.out.println("Length of the list: " + linkedList.length());
        System.out.print("10 is found in the list: ");
        System.out.println(linkedList.find(10));
        System.out.println("Removing 7 from the list");
        linkedList.remove(7);
        System.out.println("Length of the list: " + linkedList.length());
        System.out.print("7 is found in the list: ");
        System.out.println(linkedList.find(7));
        System.out.println("Traversing the list");
        linkedList.traverse();
        System.out.println();
        System.out.println("Clearing the list");
        linkedList.clear();
        System.out.println("Length of the list: " + linkedList.length());
        // Testing LinkedList -- END --
    }
}
