package Nodes;

public class BinNode<E extends Comparable<E>> {

    private E data;
    private BinNode<E> leftChild;

    private BinNode<E> rightChild;

    public BinNode() {}

    public BinNode(E data) {
        this.data = data;
    }

    public BinNode(E data, BinNode<E> leftChild, BinNode<E> rightChild) {
        this.data = data;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public E getData() {
        return data;
    }

    public void setData(E newData) {
        data = newData;
    }

    public BinNode<E> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(BinNode<E> newChild) {
        leftChild = newChild;
    }

    public BinNode<E> getRightChild() {
        return rightChild;
    }

    public void setRightChild(BinNode<E> newChild) {
        rightChild = newChild;
    }
}
