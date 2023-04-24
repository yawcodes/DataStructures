package lineardatastructures;

public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList (Node node) {
        this.head = node;
    }

    public void addToHead(Node node) {
        Node newHead = node;
        Node currentNode = this.head;

        if (currentNode == null) {
            this.head = newHead;
        } else {
            this.head = newHead;
            this.head.setNextNode(currentNode);
        }
    }

    public void swapNodes(String data1, String data2) {
        Node node1 = this.head;
        Node node2 = this.head;
        Node node1Prev = null;
        Node node2Prev = null;

        if (data1 == data2) {
            System.out.println("Data is the same for both Nodes. No need for a swap...");
            return;
        }

        while (node1 != null) {
            if (node1.data == data1) {
                break;
            }
            node1Prev = node1;
            node1 = node1.getNextNode();
        }

        while (node2 != null) {
            if (node2.data == data2) {
                break;
            }
            node2Prev = node2;
            node2 = node2.getNextNode();
        }

        if (node1Prev == null) {
            this.head = node2;
        } else {
            node1Prev.setNextNode(node2);
        }

        if (node2Prev == null) {
            this.head = node1;
        } else {
            node2Prev.setNextNode(node1);
        }

        Node temp = node1.getNextNode();
        node1.setNextNode(node2.getNextNode());
        node2.setNextNode(temp);

        System.out.println("Nodes were successfully swapped.");
    }

/*    public lineardatastructures.Node findPreviousNode(String data) {
        lineardatastructures.Node previousNode = null;
        lineardatastructures.Node currentNode = this.head;

        while (currentNode != null) {
            if (currentNode == null) {
                System.out.println("One or more Nodes are not in the list...");
                return null;
            }
            if (currentNode.data == data) {
                break;
            }
            previousNode = currentNode;
            currentNode = currentNode.getNextNode();
        }
        return previousNode;
    }*/

    public String printList() {
        String output = "<start>";
        Node currentNode = this.head;
        if (currentNode == null) {
            output += "This singly linked list is empty";
            return output;
        }
        else {
            while (currentNode != null) {
                output +=  " " + currentNode.data + "-->";
                currentNode = currentNode.getNextNode();
            }
        }
        output += " <end>";
        return output;
    }

    public Node findMiddle() {
        Node fastPointer = this.head;
        Node slowPointer = this.head;

        while (fastPointer != null) {
            fastPointer = fastPointer.getNextNode();
            System.out.print("fp-> " + fastPointer.data + ", ");
            if (fastPointer != null) {
                fastPointer = fastPointer.getNextNode();
                System.out.print("fp-> " + fastPointer.data + ", ");
                slowPointer = slowPointer.getNextNode();
                System.out.println("sp-> " + slowPointer.data + ", ");
            }
        }
        return slowPointer;
    }

}
