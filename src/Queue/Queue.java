package Queue;

import linkedlist.Node;
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

    }

    @Override
    public E dequeue() {
        return null;
    }

    @Override
    public boolean find(E item) {
        return false;
    }

    @Override
    public void traverse() {

    }

    @Override
    public int length() {
        return length;
    }
}
