import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>(11, 0.3f, true); // doubly linked list in order
        map.put("orange", 10);
        map.put("apple", 20);
        map.put("guava", 13);

        map.get("orange");
        map.get("apple");
        map.get("orange");
        map.get("orange");
        map.get("guava");
        map.get("apple");
        map.get("orange");
        map.get("apple");
        map.get("orange");
        map.get("apple");
        map.get("guava");
        map.get("orange");

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        HashMap<String, Integer> hashmap = new HashMap<>();
        LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>(hashmap);

        hashmap.put("banana", 19);
        hashmap.put("watermelon", 34);
        hashmap.put("grapes", 12);
        hashmap.put("berries", 46);

        int res1 = hashmap.getOrDefault("grapes", 0); // returns 12 coz key-value present
        int res2 = hashmap.getOrDefault("mango", 0); // returns 0 coz key-value not present
        System.out.println(res1);
        System.out.println(res2);
    }
}
