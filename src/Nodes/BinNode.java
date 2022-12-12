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
}
