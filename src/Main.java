import lineardatastructures.Node;
import lineardatastructures.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        Node newYork = new Node("New York");
        Node virginia = new Node("Virginia");
        Node maryland = new Node("Maryland");
        Node dc = new Node("DC");


        SinglyLinkedList flightPlan = new SinglyLinkedList(newYork);
        flightPlan.addToHead(maryland);
        flightPlan.addToHead(virginia);
        flightPlan.addToHead(dc);

        System.out.println(flightPlan.printList());

        flightPlan.findMiddle();
    }
}