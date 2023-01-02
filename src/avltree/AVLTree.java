package avltree;

import nodes.AVLNode;
import bstree.BinaryTree;

public class AVLTree<E extends Comparable<E>> implements BinaryTree<E> {
    private AVLNode<E> root;
    @Override
    public void insert(E data) {

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
