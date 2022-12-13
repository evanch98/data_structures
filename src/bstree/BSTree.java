package bstree;

public class BSTree<E extends Comparable<E>> implements BinaryTree<E> {

    @Override
    public boolean insert(E data) {
        return false;
    }

    @Override
    public boolean delete(E data) {
        return false;
    }

    @Override
    public void traverse() {

    }

    @Override
    public E getMax() {
        return null;
    }

    @Override
    public E getMin() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
