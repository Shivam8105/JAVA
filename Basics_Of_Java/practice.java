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

public class practice {
    private Node front;
    private Node rear;
    private int size;

    practice() {
        front = null;
        rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

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
            System.out.println("Queue is empty");
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
            System.out.println("Queue is empty");
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

    public void display(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return;
        }
        Node current = front;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        practice obj = new practice();
        obj.addFront(10);
        obj.addFront(20);
        obj.addFront(30);
        obj.display();

        obj.addRear(40);
        obj.addRear(50);
        obj.display();

        obj.removeFront();
        obj.removeRear();
        obj.display();

        System.out.println(obj.size());
    }
}
