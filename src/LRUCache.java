import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {

        private int capacity;
        public LRUCache(int capacity){
            super(capacity, 0.75f, true);
            this.capacity = capacity;
        }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size()>capacity;
    }

    public static void main(String[] args) {
        LRUCache<String, Integer> studentMap = new LRUCache<>(3);

        studentMap.put("bob", 90);
        studentMap.put("tob", 98);
        studentMap.put("dob", 89);
        studentMap.put("kob", 87);

        System.out.println(studentMap);
    }
}
