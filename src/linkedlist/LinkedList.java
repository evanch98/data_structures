package linkedlist;

public class LinkedList<E> implements List<E>{

    private Node<E> root;
    private int length = 0;

    @Override
    public void clear() {
        root = null;
    }

    @Override
    public int length() {
        return length;
    }

    @Override
    public void insert(E item) {
        // TODO: Implement the method
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
