public class LinkedListNodeExample {
    public static void main(String[] args) {
        Node node1 = new Node();
        Node node2 = new Node();


        node1.value = 1;
        node1.next = node2;
        node2.value = 2;
        node2.next = null;

        System.out.println(node1.next);
    }
}

class Node{
    public int value;
    public Node next;
}
