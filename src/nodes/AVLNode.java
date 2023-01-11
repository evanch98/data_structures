package nodes;

public class AVLNode<E extends Comparable<E>> {
    private int height = 0;

    private E data;    // data of the node
    private AVLNode<E> leftChild;    // pointer to the left child

    private AVLNode<E> rightChild;    // pointer to the right child

    /**
     * Empty constructor
     */
    public AVLNode() {}

    /**
     * Constructor with one parameter
     * @param data Set the value of data
     */
    public AVLNode(E data) {
        this.data = data;
    }

    /**
     * Constructor with three parameters
     * @param data Set the value of the data
     * @param leftChild Set the value of the leftChild
     * @param rightChild Set the value of the rightChild
     */
    public AVLNode(E data, AVLNode<E> leftChild, AVLNode<E> rightChild) {
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
    public AVLNode<E> getLeftChild() {
        return leftChild;
    }

    /**
     * @param newChild The new left child of the node
     */
    public void setLeftChild(AVLNode<E> newChild) {
        leftChild = newChild;
    }

    /**
     * @return The right child of the node
     */
    public AVLNode<E> getRightChild() {
        return rightChild;
    }

    /**
     * @param newChild The new right child of the node
     */
    public void setRightChild(AVLNode<E> newChild) {
        rightChild = newChild;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
