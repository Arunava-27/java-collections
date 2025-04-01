import java.util.ArrayList;
import java.util.List;

public class ComparableDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student("bob", 3.3));
        list.add(new Student("kob", 2.9));
        list.add(new Student("dob", 3.7));
        list.add(new Student("job", 4.3));

        list.sort(null);
        System.out.println(list);
    }
}
