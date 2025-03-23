import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// custom string comparison
class StringLenghtComperator implements Comparator<String>{

    @Override
    public int compare(String s1, String s2) {
        // words in ascending order according to length
        return s1.length() - s2.length();
    }
}

class IntegerComperator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        // sort in descending order
        return o2 - o1;
        // return -ve value for descending
        // return +ve value for ascending
        // return 0 means equal
    }
}


public class ComparatorExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(4);
        list.add(2);
        list.add(8);

        list.sort(new IntegerComperator());
        System.out.println(list);

        List<String> words = Arrays.asList("Banana", "Apple", "Date");
        words.sort(new StringLenghtComperator());
        System.out.println(words);

        List<String> words2 = Arrays.asList("Arunava", "Rahul", "Das");
        // expression
        words2.sort((a, b) -> a.length() - b.length()); // words in ascending order according to length
        System.out.println(words2);
    }
}
