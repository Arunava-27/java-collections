import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(12, "Rahul");
        map.put(24, "Ankan");
        map.put(36, "Rudra");
        map.put(48, "Titas");
        System.out.println(map);

        String student = map.get(36); // returns value of key -> 3

        String student1 = map.get(6); // returns null

        System.out.println(student);
        System.out.println(student1);

        System.out.println(map.containsKey(24)); // returns boolean
        System.out.println(map.containsValue("Ankan")); // returns boolean

        // loop in hashmap
        Set<Integer> keys = map.keySet();
        for(int i : keys){
            System.out.println(map.get(i));
        }

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for(Map.Entry<Integer, String> entry : entries){ // access both keys and values
            System.out.println(entry.getKey()+" : "+entry.getValue().toUpperCase());
            entry.setValue(entry.getValue().toUpperCase());
        }

        map.remove(36);
        boolean result = map.remove(12, "Nitin"); // returns false coz key : value doesn't match
        System.out.println("Removed ? : "+result);
        System.out.println(map);
    }
}
