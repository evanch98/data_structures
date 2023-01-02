package nodes;

public class AVLNode<E extends Comparable<E>> extends BinNode<E> {
    private int height = 0;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
