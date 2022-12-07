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


}
