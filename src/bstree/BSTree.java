package bstree;

import Nodes.BinNode;

public class BSTree<E extends Comparable<E>> implements BinaryTree<E> {

    private BinNode<E> root;    // root of the tree

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
