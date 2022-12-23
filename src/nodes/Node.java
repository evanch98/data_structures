package nodes;

/**
 * Represent the node in the LinkedList
 * @param <E> The data type of the node
 */
public class Node<E extends Comparable<E>> {

    private E data;    // data of the node
    private Node<E> next;    // pointer to the next node

    /**
     * Empty constructor
     */
    public Node(){}

    /**
     * Constructor with one parameter
     * @param data Set the value of data
     */
    public Node(E data) {
        this.data = data;
    }

    /**
     * Constructor with two parameters
     * @param data Set the value of data
     * @param next Set the value of next
     */
    public Node(E data, Node<E> next) {
        this.data = data;
        this.next = next;
    }

    /**
     * @return The data of the node
     */
    public E getData() {
        return data;
    }

    /**
     * To set the data of the node
     * @param newData The value of the data
     */
    public void setData(E newData) {
        data = newData;
    }

    /**
     * @return The node next to the current node
     */
    public Node<E> getNext() {
        return next;
    }

    /**
     * To set the pointer to the other node
     * @param newNext The node to be pointed to
     */
    public void setNext(Node<E> newNext) {
        next = newNext;
    }

}
