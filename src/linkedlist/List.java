package linkedlist;

/**
 * List ADT
 */
public interface List<E> {

    /**
     * Remove all contents from the list
     */
    public void clear();

    /**
     * Push an element at the start of the list
     * @param item The element to be inserted
     */
    public void push(E item);

    /**
     * Append an element at the end of the list
     * @param item The element to be inserted
     */
    public void append(E item);

    /**
     * Remove and return the removed element
     * @param item The element to be removed
     * @return The element that was removed
     */
    public E remove(E item);

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