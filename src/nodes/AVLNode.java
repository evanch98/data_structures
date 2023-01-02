package nodes;

public class AVLNode<E extends Comparable<E>> extends BinNode<E> {
    private int height = 0;

    public AVLNode(E data) {
        super(data);
    }

    public AVLNode(E data, AVLNode<E> leftChild, AVLNode<E> rightChild) {
        super(data, leftChild, rightChild);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
