package linkedlist;

/**
 * List ADT
 */
public interface List<E extends Comparable<E>> {

    /**
     * Remove all contents from the list
     */
    public void clear();

    /**
     * Insert an element into the list
     * @param item The element to be inserted
     */
    public void insert(E item);

    /**
     * Remove and return the removed element
     * @param item The element to be removed
     * @return true if the item is deleted successfully; false otherwise
     */
    public boolean remove(E item);

    /**
     * Find the element in the list
     * @param item The element to be searched
     * @return true if the element is found, false otherwise
     */
    public boolean find(E item);

    /**
     * Traverse the list
     */
    public void traverse();

    /**
     * @return The number of element in the list
     */
    public int length();
}
