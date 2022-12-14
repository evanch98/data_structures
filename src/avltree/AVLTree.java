package avltree;

import nodes.AVLNode;
import bstree.BinaryTree;

public class AVLTree<E extends Comparable<E>> implements BinaryTree<E> {
    private AVLNode<E> root;
    @Override
    public void insert(E data) {
        root = insert(data, root);
    }

    /*
     * Helper insert method
     * @param data The data to be inserted
     * @param node The node to be checked
     */
    private AVLNode<E> insert(E data, AVLNode<E> node) {
        // If the current node is null, create a new node.
        if (node == null) {
            return new AVLNode<>(data);
        }
        if (data.compareTo(node.getData()) < 0) {
            // If the data to be inserted is less than that of the current node,
            // it should go to the left side of the node.
            node.setLeftChild(insert(data, node.getLeftChild()));
        } else if (data.compareTo(node.getData()) > 0) {
            // If the data to be inserted is greater than that of the current node,
            // it should go to the right side of the node.
            node.setRightChild(insert(data, node.getRightChild()));
        } else {
            return node;
        }
        updateHeight(node);    // update the height of the node
        return applyRotation(node);    // rotate to balance the tree
    }

    private AVLNode<E> applyRotation(AVLNode<E> node) {
        return null;
    }

    private void updateHeight(AVLNode<E> node) {
        // get the maximum height between the left child and right child
        // update the height of the node to maxHeight + 1
        int maxHeight = Math.max(height(node.getLeftChild()), height(node.getRightChild()));
        node.setHeight(maxHeight + 1);
    }

    private int height(AVLNode<E> node) {
        // If node is not null, return the height of the node; otherwise, 0.
        return node != null ? node.getHeight() : 0;
    }

    @Override
    public void delete(E data) {

    }

    @Override
    public void traverse() {
        System.out.println("Preorder Traversal: ");
        traversePreOrder(root);
        System.out.println("In-order Traversal: ");
        traverseInOrder(root);
        System.out.println("Post-order Traversal: ");
        traversePostOrder(root);
    }

    private void traversePreOrder(AVLNode<E> node) {
        if (node != null) {
            System.out.println(node.getData());
            traversePreOrder((AVLNode<E>) node.getLeftChild());
            traversePreOrder((AVLNode<E>) node.getRightChild());
        }
    }

    private void traverseInOrder(AVLNode<E> node) {
        if (node != null) {
            traverseInOrder((AVLNode<E>) node.getLeftChild());
            System.out.println(node.getData());
            traverseInOrder((AVLNode<E>) node.getRightChild());
        }
    }

    private void traversePostOrder(AVLNode<E> node) {
        if (node != null) {
            traversePostOrder((AVLNode<E>) node.getLeftChild());
            traversePostOrder((AVLNode<E>) node.getRightChild());
            System.out.println(node.getData());
        }
    }

    @Override
    public E getMax() {
        if (isEmpty()) {
            return null;
        }
        return getMax(root);
    }

    private E getMax(AVLNode<E> node) {
        if (node.getRightChild() != null) {
            return getMax((AVLNode<E>) node.getRightChild());
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

    private E getMin(AVLNode<E> node) {
        if (node.getLeftChild() != null) {
            return getMin((AVLNode<E>) node.getLeftChild());
        }
        return node.getData();
    }

    @Override
    public boolean isEmpty() {
        return root == null;
    }
}
