package Queue;

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

public class DequeLinkedList {  
    private Node front, rear;
    private int size;

    public DequeLinkedList() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public void addFront(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            newNode.next = front;
            front.prev = newNode;
            front = newNode;
        }
        size++;
    }

    public void addRear(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            newNode.prev = rear;
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public void removeFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return;
        }
        if (front == rear) {
            front = rear = null;
        } else {
            front = front.next;
            if (front != null) front.prev = null;
        }
        size--;
    }

    public void removeRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return;
        }
        if (front == rear) {
            front = rear = null;
        } else {
            rear = rear.prev;
            if (rear != null) rear.next = null;
        }
        size--;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return;
        }
        Node current = front;
        System.out.print("Deque: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DequeLinkedList deque = new DequeLinkedList();
        deque.addFront(10);
        deque.addRear(20);
        deque.addRear(30);
        deque.addRear(40);
        deque.addRear(50);
        deque.display();
        deque.removeFront();
        deque.display();
        deque.removeRear();
        deque.display();
    }
}
