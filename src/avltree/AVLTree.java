package avltree;

<<<<<<< HEAD
import Nodes.BinNode;
=======
>>>>>>> e77e81d5974e3dfb0a0fe7b00eb7a19193e08441
import bstree.BinaryTree;

public class AVLTree<E extends Comparable<E>> implements BinaryTree<E> {

<<<<<<< HEAD
    private BinNode<E> root;

=======
>>>>>>> e77e81d5974e3dfb0a0fe7b00eb7a19193e08441
    @Override
    public void insert(E data) {

    }

    @Override
    public void delete(E data) {

    }

    @Override
    public void traverse() {
<<<<<<< HEAD
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
=======

>>>>>>> e77e81d5974e3dfb0a0fe7b00eb7a19193e08441
    }

    @Override
    public E getMax() {
<<<<<<< HEAD
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
=======
        return null;
>>>>>>> e77e81d5974e3dfb0a0fe7b00eb7a19193e08441
    }

    @Override
    public E getMin() {
<<<<<<< HEAD
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
=======
        return null;
>>>>>>> e77e81d5974e3dfb0a0fe7b00eb7a19193e08441
    }

    @Override
    public boolean isEmpty() {
<<<<<<< HEAD
        return root == null;
=======
        return false;
>>>>>>> e77e81d5974e3dfb0a0fe7b00eb7a19193e08441
    }
}
