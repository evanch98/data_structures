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
        // TODO: Implement the find method
        return false;
    }

    @Override
    public void traverse() {
        // TODO: Implement the traverse method
    }

    @Override
    public int length() {
        return length;
    }
}
