package lineardatastructures;

public class Queue {
    public LinkedList queue;
    public int size;
    public static final int DEFAULT_MAX_SIZE = Integer.MAX_VALUE;
    public int maxSize;

    public Queue() {
        this(DEFAULT_MAX_SIZE);
    }

    public Queue(int maxSize) {
        this.queue = new LinkedList();
        this.size = 0;
        this.maxSize = maxSize;
    }

    public boolean hasSpace() {
        if (this.size < this.maxSize) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (this.size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void enqueue(String data) {
        if (this.hasSpace()) {
            this.queue.addToTail(data);
            this.size ++;
            System.out.printf("Added %s! lineardatastructures.Queue size is now %d \n", data, this.size);
        } else {
            throw new Error("lineardatastructures.Queue is full!");
        }
    }

    public String dequeue() {
        if (!this.isEmpty()) {
            String data = this.queue.removeHead();
            this.size --;
            System.out.printf("Removed %s! lineardatastructures.Queue size is now %d \n", data, this.size);
            return data;
        } else {
            throw new Error("lineardatastructures.Queue is empty!");
        }
    }

    public String peek() {
        if (!this.isEmpty()) {
            return this.queue.head.data;
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        Queue smoothieOrders = new Queue();
        smoothieOrders.enqueue("strawberry banana");
        smoothieOrders.enqueue("chocolate peanut butter");
        System.out.println("Blending the smoothies...");
        smoothieOrders.dequeue();
        smoothieOrders.dequeue();
        System.out.println("All orders are complete!");

        Queue boundedQueue = new Queue(3);
        boundedQueue.enqueue("one");
        boundedQueue.enqueue("two");
        boundedQueue.enqueue("three");
        boundedQueue.dequeue();
        boundedQueue.dequeue();
        boundedQueue.dequeue();
        boundedQueue.dequeue();
    }
}
