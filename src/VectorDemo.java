import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(5, 3);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        System.out.println("capacity before increment: "+vector.capacity()); //returns capacity
        vector.add(1);
        System.out.println("capacity after increment: "+vector.capacity()); //returns capacity

        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(2,4,6,8));
        Vector<Integer> vectorFromList = new Vector<>(list);
        System.out.println(vectorFromList);
    }
}
