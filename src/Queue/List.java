package Queue;

/**
 * List ADT
 */
public interface List<E extends Comparable<E>> {

    /**
     * Remove all contents from the list
     */
    public void clear();

    /**
     * Insert an element into the last node of the queue
     * @param item The element to be inserted
     */
    public void enqueue(E item);

    /**
     * Remove the tail of the list and return the removed element
     * @return The removed element
     */
    public E dequeue();

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


