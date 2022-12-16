package bstree;

import Nodes.BinNode;

public class BSTree<E extends Comparable<E>> implements BinaryTree<E> {

    private BinNode<E> root;    // root of the tree

    @Override
    public void insert(E data) {

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
        if (isEmpty()) {
            return null;
        }
        return getMax(root);
    }

    /**
     * To find the maximum value of the tree
     * @param node The node to be checked
     * @return The value of the node
     */
    private E getMax(BinNode<E> node) {
        // The maximum value of the binary tree resides at the right most node
        if (node.getRightChild() != null) {
            // As long as the right child is not null,it is the node with the maximum value
            return getMax(node.getRightChild());
        }
        return node.getData();
    }

    @Override
    public E getMin() {
        if (isEmpty()) {
            return null;
        }
        return getMin(root);
    }

    /**
     * To find the minimum value of the tree
     * @param node The node to be checked
     * @return The value of the node
     */
    private E getMin(BinNode<E> node) {
        // The minimum value of the binary tree resides at the left most node
        if (node.getLeftChild() != null) {
            // As long as the left child is not null, it is not the node with the minimum value
            return getMin(node.getLeftChild());
        }
        return node.getData();
    }

    @Override
    public boolean isEmpty() {
        return root == null;
    }
}
