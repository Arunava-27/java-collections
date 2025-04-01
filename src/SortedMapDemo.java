import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
    public static void main(String[] args) {
        SortedMap<Integer, String> map = new TreeMap<>((a, b) -> b - a); // descending order custom comparator
                                                                        // return's +ve

        map.put(91, "Vivek");
        map.put(99, "Shubham");
        map.put(78, "Mohit");
        map.put(77, "Vipul");

//        sort
//        99
//        91
//        78
//        77
        System.out.println(map);

        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        System.out.println(map.headMap(91)); // from head to just before given key
        System.out.println(map.tailMap(91)); // from given key to last key - tail

    }
}
