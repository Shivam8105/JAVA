package Basics_Of_Java;

public class circularQueue {
    private int[] queue;
    private int front, rear, size, capacity;

    public circularQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full! Cannot add element " + element);
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = element;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty! Cannot dequeue.");
            return -1;
        }
        int element = queue[front];
        front = (front + 1) % capacity;
        size--;
        return element;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty! No front element.");
            return -1;
        }
        return queue[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        circularQueue cq = new circularQueue(5);
        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);
        cq.enqueue(50);

        cq.display();

        System.out.println("Dequeued: " + cq.dequeue());
        System.out.println("Front element: " + cq.peek());

        cq.enqueue(60);
        cq.display();
    }
}
