package queue;

import nodes.Node;
public class Queue<E extends Comparable<E>> implements List<E> {

    private Node<E> head;    // the first node in the queue
    private Node<E> tail;    // the last node in the queue
    private int length = 0;    // length of the queue

    @Override
    public void clear() {
        head = null;
        tail = null;
        length = 0;
    }

    @Override
    public void enqueue(E item) {
        Node<E> newTail = new Node<>(item);    // a node to hold the new item

        if (head == null) {
            // If head is null, newTail is the head of the queue
            // Since it is the only node in the queue, it will also be the tail
            head = newTail;
        } else {
            // The last node points to the new tail
            // The new tail is now the tail of the queue
            tail.setNext(newTail);
        }
        tail = newTail;
        length++;

    }

    @Override
    public E dequeue() {
        if (head == null) {
            throw new IllegalStateException("Cannot dequeue from an empty queue");
        }
        E item = head.getData();    // the item of the first node
        head = head.getNext();      // the previous second item is now the first
                                    // if the head is the last item, then the head becomes null
        length--;

        if (head == null) {
            // The queue is empty. The node that was removed was also the tail of the queue.
            tail = null;
        }
        return item;
    }

    @Override
    public boolean find(E item) {
        Node<E> runner = head;    // a node for traversing the queue
        while (runner != null) {
            // Go through the queue looking at the data in each node.
            if (runner.getData().equals(item)) {
                // If the item is found, return true
                return true;
            }
            runner = runner.getNext();    // move on to the next node
        }
        // At this point, it means the item is not in the queue; therefore, return false
        return false;
    }

    @Override
    public void traverse() {
        // For the sake of simplicity, this method will only print out the item in the queue.
        if (head == null) {
            // If the head is null, the list empty.
            System.out.println("The stack is empty.");
        }
        Node<E> runner = head;    // a node for traversing the queue
        while (runner != null) {
            System.out.print(runner.getData().toString() + " ");    // print out the current node item
            runner = runner.getNext();    // move on to the next node
        }
    }

    @Override
    public int length() {
        return length;
    }
}
