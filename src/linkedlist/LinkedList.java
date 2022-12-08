package linkedlist;

public class LinkedList<E extends Comparable<E>> implements List<E>{

    private Node<E> head;
    private int length = 0;

    @Override
    public void clear() {
        head = null;
    }

    @Override
    public int length() {
        return length;
    }

    @Override
    // The insert method will always add an element in ascending order.
    // Therefore, the list will always be sorted.
    public void insert(E item) {
        Node<E> newNode = new Node<>(item);  // a node to contain the new item

        if (head == null) {
            // The new item is the first item in the list.
            head = newNode;
        } else if (head.getData().compareTo(item) >= 0) {
            // The new item is less than the head of the list; therefore, it becomes
            // the root of the list
            newNode.setNext(head);
            head = newNode;
        } else {
            // The new item belongs somewhere after the first item
            // Traverse the list to find its appropriate position
            Node<E> runner = head.getNext();   // a node for traversing the list
            Node<E> previous = head;           // always points to the node preceding runner
            while (runner != null && runner.getData().compareTo(item) < 0) {
                // Move the runner and previous along the list until the runner reach the end of
                // the list or finds an element that is greater than or equal to the new item.
                previous = runner;
                runner = runner.getNext();
            }
            newNode.setNext(runner);
            previous.setNext(newNode);
            length++;    // increment the length of the list
        }
    }

    @Override
    public E remove(E item) {
        // TODO: Implement the method
        return null;
    }

    @Override
    public boolean find(E item) {
        // TODO: Implement the method
        return false;
    }

    @Override
    public void traverse() {
        // TODO: Implement the method
    }
}
