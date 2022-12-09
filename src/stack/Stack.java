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
        // TODO: Implement the push method
    }

    @Override
    public E pop(E item) {
        // TODO: Implement the pop method
        return null;
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
