package linkedlist;

public class LinkedList<E extends Comparable<E>> implements List<E>{

    private Node<E> head;
    private int length = 0;

    @Override
    public void clear() {
        head = null;
        length = 0;
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
        }
        length++;    // increment the length of the list
    }

    @Override
    public boolean remove(E item) {
        if (head == null) {
            // If head is null, the list empty. Therefore, return null.
            return false;
        } else if (head.getData().equals(item)) {
            // If the head is the item to be removed, the node next to the head becomes
            // the head of the list.
            head = head.getNext();    // the node next to the head is now the head
            length--;
            return true;
        } else {
            // The item to be deleted is somewhere beyond the head the list.
            // Traverse the list to find the item to be deleted.
            Node<E> runner = head.getNext();    // a node for traversing the list
            Node<E> previous = head;            // always points to the node preceding runner
            while (runner != null && runner.getData().compareTo(item) < 0) {
                // Move the runner and previous along the list until the runner reach the end of
                // the list or finds an element that is greater than or equal to the item to be deleted.
                previous = runner;
                runner = runner.getNext();
            }
            if (runner != null && runner.getData().equals(item)) {
                // Runner points to the node to be deleted.
                // Remove it by changing the pointer in the previous node.
                previous.setNext(runner.getNext());
                length--;
                return true;
            } else {
                // The item does not exist in the list.
                return false;
            }
        }
    }

    @Override
    public boolean find(E item) {
        Node<E> runner = head;    // a node for traversing the list
        while (runner != null) {
            // Go through the list looking at the data in each node.
            if (runner.getData().equals(item)) {
                // If the item is found, return true
                return true;
            }
            runner = runner.getNext();    // move on to the next node
        }
        // At this point, it means the item is not in the list; therefore, return false
        return false;
    }

    @Override
    public void traverse() {
        // For the sake of simplicity, this method will only print out the item in the list.
        Node<E> runner = head;    // a node for traversing the list
        while (runner != null) {
            System.out.println(runner.getData().toString());    // print out the current node item
            runner = runner.getNext();    // move on to the next node
        }
    }
}
