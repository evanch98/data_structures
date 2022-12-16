package bstree;

public interface BinaryTree<E extends Comparable<E>> {

    /**
     * Insert an element into the tree
     * @param data The element to be inserted
     */
    public void insert(E data);

    /**
     * @param data The element to be removed
     * @return true if the element is removed successfully; false otherwise
     */
    public boolean delete(E data);

    /**
     * Traverse the tree
     */
    public void traverse();

    /**
     * @return The maximum value of the tree
     */
    public E getMax();

    /**
     * @return The minimum value of the tree
     */
    public E getMin();

    /**
     * @return true if the tree is empty; false otherwise
     */
    public boolean isEmpty();

}
