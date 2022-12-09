package stack;

public class Test {
    public static void main(String[] args) {
        Stack<Character> charStack = new Stack<>();
        charStack.push('A');
        charStack.push('B');
        charStack.push('C');
        charStack.traverse();
        System.out.println(charStack.length());
        charStack.pop();
        System.out.println();
        charStack.traverse();
        System.out.println(charStack.length());
    }
}
