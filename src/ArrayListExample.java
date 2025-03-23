import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList<>();

        arraylist.add(27); // add element to list // 0
        arraylist.add(6); // add element to list  // 1
        arraylist.add(3); // add element to list  // 2
        arraylist.add(5); // 3
        arraylist.add(67); // 4
        arraylist.add(45); // 5

        System.out.println(arraylist);
        arraylist.remove(3); // removes element by index
        arraylist.remove(Integer.valueOf(45));

        arraylist.add(2, 50); // insert element at an index
        arraylist.set(3, 30); // Replaces the element at the specified position in this list with the specified element

        System.out.println(arraylist.get(1)); // display element in index 1
        System.out.println(arraylist.size()); // returns size of the list

        // prints the list
        for(int i : arraylist){
            System.out.println(i);
        }
        System.out.println(arraylist);

        // search for element in list
        System.out.println(arraylist.contains(3));  // true
        System.out.println(arraylist.contains(80)); // false

    }
}
