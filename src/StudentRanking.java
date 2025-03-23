import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student{
    private final String name;
    private final double gpa;

    public Student(String name, double gpa){
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }
    public double getGPA() {
        return gpa;
    }
}

public class StudentRanking {
    public static void main(String[] args) {
        List<Student> student = new ArrayList<>();
        student.add(new Student("arunava", 8.5));
        student.add(new Student("rajdeep", 7.5));
        student.add(new Student("arjun", 9.5));
        student.add(new Student("bisu", 4.5));
        student.add(new Student("lalu", 6.5));
        student.add(new Student("kalu", 8.3));

        // ascending
        // first sort gpa and then sort string of same gpa
        student.sort((o1, o2) -> {
            if(o1.getGPA() - o2.getGPA() > 0){
                return 1;
            } else if(o1.getGPA() - o2.getGPA() < 0){
                return -1;
            } else {
                return o1.getName().compareTo(o2.getName());
            }
        });

        for(Student s : student){
            System.out.println(s.getName()+" : "+s.getGPA());
        }

        System.out.println("---------------------------------------------------");

        // same as student.sort above
        // descending
        // first sort gpa and then sort string of same gpa
        Comparator<Student> comparator = Comparator.comparing(Student::getGPA).reversed().thenComparing(Student::getName);
//        Accepts a function that extracts a Comparable sort key from a type T,
//                and returns a Comparator<T> that compares by that sort key.

        student.sort(comparator);
        for(Student s : student){
            System.out.println(s.getName()+" : "+s.getGPA());
        }
    }
}
