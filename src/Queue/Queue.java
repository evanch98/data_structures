package Queue;

import linkedlist.Node;
public class Queue<E extends Comparable<E>> implements List<E> {

    private Node<E> top;
    private Node<E> tail;
    private int length = 0;

    @Override
    public void clear() {
        top = null;
        tail = null;
        length = 0;
    }

    @Override
    public void enqueue(E item) {

    }

    @Override
    public E dequeue() {
        return null;
    }

    @Override
    public boolean find(E item) {
        return false;
    }

    @Override
    public void traverse() {

    }

    @Override
    public int length() {
        return length;
    }
}
