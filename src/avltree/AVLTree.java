package avltree;

import Nodes.BinNode;
import bstree.BinaryTree;

public class AVLTree<E extends Comparable<E>> implements BinaryTree<E> {

    private BinNode<E> root;

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

    private void traversePreOrder(BinNode<E> node) {
        if (node != null) {
            System.out.println(node.getData());
            traversePreOrder(node.getLeftChild());
            traversePreOrder(node.getRightChild());
        }
    }

    private void traverseInOrder(BinNode<E> node) {
        if (node != null) {
            traverseInOrder(node.getLeftChild());
            System.out.println(node.getData());
            traverseInOrder(node.getRightChild());
        }
    }

    private void traversePostOrder(BinNode<E> node) {
        if (node != null) {
            traversePostOrder(node.getLeftChild());
            traversePostOrder(node.getRightChild());
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

    private E getMax(BinNode<E> node) {
        if (node.getRightChild() != null) {
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

    private E getMin(BinNode<E> node) {
        if (node.getLeftChild() != null) {
            return getMin(node.getLeftChild());
        }
        return node.getData();
    }

    @Override
    public boolean isEmpty() {
        return root == null;
    }
}
