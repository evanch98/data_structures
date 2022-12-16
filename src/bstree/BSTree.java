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
