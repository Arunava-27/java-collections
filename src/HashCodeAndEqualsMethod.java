import java.util.HashMap;
import java.util.Objects;

public class HashCodeAndEqualsMethod {
    public static void main(String[] args) {
        HashMap<Person, String> map = new HashMap<>();

        Person p1 = new Person("Ankit", 213);
        Person p2 = new Person("Ratan", 345);
        Person p3 = new Person("Madan", 234);
        Person p4 = new Person("Ankit", 213);

        map.put(p1, "Engineer");
        map.put(p2, "Designer");
        map.put(p3, "Manager");
        map.put(p4, "Analyst");

        System.out.println("HashMap size : "+map.size());
        System.out.println("Value for p1 : "+map.get(p1));
        System.out.println("Value for p4 : "+map.get(p4));

        System.out.println(p1);
    }
}

class Person{
    private final String name;
    private final int id;

    public Person(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        Person other = (Person) obj;
        return id == other.getId() && Objects.equals(name, other.getName());
    }

    @Override
    public String toString() {
        return "id: "+ id +", name: "+name;
    }
}