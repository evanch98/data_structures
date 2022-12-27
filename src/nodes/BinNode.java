package nodes;

/**
 * Represent the node in the binary tree
 * @param <E> The datatype of the node
 */
public class BinNode<E extends Comparable<E>> {

    private E data;    // data of the node
    private BinNode<E> leftChild;    // pointer to the left child

    private BinNode<E> rightChild;    // pointer to the right child

    /**
     * Empty constructor
     */
    public BinNode() {}

    /**
     * Constructor with one parameter
     * @param data Set the value of data
     */
    public BinNode(E data) {
        this.data = data;
    }

    /**
     * Constructor with three parameters
     * @param data Set the value of the data
     * @param leftChild Set the value of the leftChild
     * @param rightChild Set the value of the rightChild
     */
    public BinNode(E data, BinNode<E> leftChild, BinNode<E> rightChild) {
        this.data = data;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    /**
     * @return The data of the node
     */
    public E getData() {
        return data;
    }

    /**
     * @param newData The new value of the data
     */
    public void setData(E newData) {
        data = newData;
    }

    /**
     * @return The left child of the node
     */
    public BinNode<E> getLeftChild() {
        return leftChild;
    }

    /**
     * @param newChild The new left child of the node
     */
    public void setLeftChild(BinNode<E> newChild) {
        leftChild = newChild;
    }

    /**
     * @return The right child of the node
     */
    public BinNode<E> getRightChild() {
        return rightChild;
    }

    /**
     * @param newChild The new right child of the node
     */
    public void setRightChild(BinNode<E> newChild) {
        rightChild = newChild;
    }
}
