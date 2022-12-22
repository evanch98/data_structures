package bstree;

public class Test {
    public static void main(String[] args) {
        BSTree<Integer> tree = new BSTree<>();
        tree.insert(10);
        tree.insert(20);
        tree.insert(8);
        tree.insert(25);
        tree.insert(7);
        tree.insert(9);
        tree.insert(15);
        System.out.println(tree.getMax());
        System.out.println(tree.getMin());
        tree.delete(25);
        System.out.println(tree.getMax());
        tree.traverse();
    }

}
