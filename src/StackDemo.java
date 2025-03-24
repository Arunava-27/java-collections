import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println(stack);
        int elementpoped = stack.pop(); // removes top element according to LIFO
        System.out.println(elementpoped);
        Integer peeked = stack.peek(); // returns top element according to LIFO
        System.out.println(peeked);
        System.out.println(stack.isEmpty()); // return boolean
        System.out.println(stack.size()); // returns no. of elements present

        System.out.println(stack);
        // search method does indexing from 1 not 0
        int search = stack.search(4); // returns index 2 according to LIFO
        System.out.println(search);
    }
}
