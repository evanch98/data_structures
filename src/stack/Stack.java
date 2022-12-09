package stack;

import linkedlist.Node;

public class Stack<E extends Comparable<E>> implements List<E> {

    private Node<E> top;

    private int length = 0;

    @Override
    public void clear() {
        top = null;
        length = 0;
    }

    @Override
    public void push(E item) {
        Node<E> newNode = new Node<>(item);    // a node to hold the new item
        newNode.setNext(top);    // the new node points to the old top
        top = newNode;           // the new item is now on top
    }

    @Override
    public E pop()  {
        if (top == null) {
            throw new IllegalStateException("Cannot pop from an empty stack");
        }
        E topIem = top.getData();    // the item that is being popped
        top = top.getNext();         // the second item is now on top
        return topIem;
    }

    @Override
    public boolean find(E item) {
        Node<E> runner = top;    // a node for traversing the list
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
        if (top == null) {
            // If the head is null, the list empty.
            System.out.println("The stack is empty.");
        }
        Node<E> runner = top;    // a node for traversing the list
        while (runner != null) {
            System.out.print(runner.getData().toString() + " ");    // print out the current node item
            runner = runner.getNext();    // move on to the next node
        }
    }

    @Override
    public int length() {
        return length;
    }
}
