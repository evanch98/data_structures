package queue;

public class Test {
    public static void main(String[] args) {
        Queue<Double> queue = new Queue<Double>();
        queue.enqueue(20.0);
        queue.enqueue(30.0);
        queue.enqueue(40.0);
        queue.traverse();
        System.out.println(queue.length());
        System.out.println(queue.find(20.0));
        queue.dequeue();
        queue.traverse();
        System.out.println(queue.length());
        System.out.println(queue.find(20.0));
    }
}
