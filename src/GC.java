public class GC { // Garbage Collection
    public static void main(String[] args) {
        Phone phone = new Phone("Apple", "16 Pro");

        System.out.println(phone);
        phone=null;
        System.out.println(phone);
    }
}

class Phone{
    String brand;
    String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
