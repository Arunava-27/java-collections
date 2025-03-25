import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListClassEx {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(222);
        linkedList.add(3);
        linkedList.addFirst(0);
        linkedList.addLast(4);
        linkedList.add(2, 44);

        System.out.println(linkedList.get(2)); // get node element by index
        System.out.println(linkedList.getFirst()); // return first node
        System.out.println(linkedList.getLast()); // return last node
        System.out.println(linkedList);

        linkedList.removeIf(x -> x % 2 == 0); // expression required
        System.out.println(linkedList);

        LinkedList<String> animals = new LinkedList<>(Arrays.asList("Cat", "dog", "pig", "cow"));
        System.out.println(animals);
        LinkedList<String> animalsToRemove = new LinkedList<>(Arrays.asList("Cat", "cow"));
        animals.removeAll(animalsToRemove);
        System.out.println(animals);
    }
}
