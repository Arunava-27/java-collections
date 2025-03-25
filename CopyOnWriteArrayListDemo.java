import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        List<String> shopList = new CopyOnWriteArrayList<>();

        shopList.add("Milk");
        shopList.add("Eggs");
        shopList.add("Bread");

        System.out.println("Initial Shopping List: "+ shopList);

        for(String item : shopList){
            System.out.println(item); // reading
            if(item.equals("Eggs")){
                shopList.add("Butter"); // writing
                System.out.println("Added butter while reading");
            }
        }
        System.out.println("Updated shopping list: "+ shopList);
    }
}
