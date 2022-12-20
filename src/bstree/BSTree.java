package bstree;

import Nodes.BinNode;

public class BSTree<E extends Comparable<E>> implements BinaryTree<E> {

    private BinNode<E> root;    // root of the tree

    @Override
    public void insert(E data) {
        if (isEmpty()) {
            // If root is empty, new node is the root of the tree
            root = new BinNode<>(data);
        } else {
            // Otherwise, insert it according the value of the node
            insert(data, root);
        }
    }

    /*
     * Helper insert method
     * @param data The data to be inserted
     * @param node The node to be checked
     */
    private void insert(E data, BinNode<E> node) {
        // If the data to be inserted is less than that of the current node,
        // it should go to the left side of the node.
        if (data.compareTo(node.getData()) < 0) {
            // If the left child of the current node is null,
            // the new node will be the new left child of the node.
            if (node.getLeftChild() == null) {
                BinNode<E> newNode = new BinNode<>(data);
                node.setLeftChild(newNode);
            } else {
                // Otherwise, keep traversing the left side of the tree
                insert(data, node.getLeftChild());
            }
            // If the data to be inserted is greater than that of the current node,
            // it should go to the right side of the node.
        } else if (data.compareTo(node.getData()) > 0) {
            // If the right child of the current node is null,
            // the new node will be the new right child of the node.
            if (node.getRightChild() == null) {
                BinNode<E> newNode = new BinNode<>(data);
                node.setRightChild(newNode);
            } else {
                // Otherwise, keep traversing the right side of the tree
                insert(data, node.getRightChild());
            }
        }
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

    /*
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

    /*
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