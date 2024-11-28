package Basics_Of_Java;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class Deque {
    private Node front;
    private Node rear;
    private int size;

    // Constructor to initialize the deque
    public Deque() {
        front = null;
        rear = null;
        size = 0;
    }

    // Check if the deque is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Get the size of the deque
    public int size() {
        return size;
    }

    // Add an element at the front of the deque
    public void addFront(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            front = rear = newNode;
        } else {
            newNode.next = front;
            front.prev = newNode;
            front = newNode;
        }
        size++;
    }

    // Add an element at the rear of the deque
    public void addRear(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            front = rear = newNode;
        } else {
            newNode.prev = rear;
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public int removeFront() {
        if (isEmpty()) {
            throw new IllegalStateException("Deque is empty");
        }

        int data = front.data;

        if (front == rear) {
            front = rear = null;
        } else {
            front = front.next;
            front.prev = null;
        }
        size--;
        return data;
    }
    public int removeRear() {
        if (isEmpty()) {
            throw new IllegalStateException("Deque is empty");
        }

        int data = rear.data;

        if (front == rear) {
            front = rear = null;
        } else {
            rear = rear.prev;
            rear.next = null;
        }
        size--;
        return data;
    }
    public int peekFront() {
        if (isEmpty()) {
            throw new IllegalStateException("Deque is empty");
        }
        return front.data;
    }
    public int peekRear() {
        if (isEmpty()) {
            throw new IllegalStateException("Deque is empty");
        }
        return rear.data;
    }
    public void display() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return;
        }

        Node current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Deque deque = new Deque();

        deque.addFront(10);
        deque.addFront(20);
        deque.addRear(30);
        deque.addRear(40);

        System.out.println("Deque elements:");
        deque.display();

        System.out.println("Front element: " + deque.peekFront());
        System.out.println("Rear element: " + deque.peekRear());

        System.out.println("Removed from front: " + deque.removeFront());
        System.out.println("Removed from rear: " + deque.removeRear());

        System.out.println("Deque elements after removals:");
        deque.display();
    }
}
