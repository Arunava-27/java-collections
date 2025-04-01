import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        String key1 = new String("key");
        String key2 = new String("key");

        System.out.println("Hash Map");
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put(key1, 1);
        hashMap.put(key2, 2);
        System.out.println(hashMap);

        System.out.println("Identity hash map");
        Map<String, Integer> identityMap = new IdentityHashMap<>();
        identityMap.put(key1, 1);
        identityMap.put(key2, 2);
        System.out.println(identityMap);
    }
}
