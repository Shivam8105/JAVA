package Basics_Of_Java;

class Dequeue {
    static class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
            prev = null;
            next = null;
        }
    }

    private Node front, rear;

    public Dequeue() {
        front = rear = null;
    }

    public void insertFront(int data) {
        Node newNode = new Node(data);
        if (front == null) {
            front = rear = newNode;
        } else {
            newNode.next = front;
            front.prev = newNode;
            front = newNode;
        }
    }

    public void insertRear(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
        } else {
            newNode.prev = rear;
            rear.next = newNode;
            rear = newNode;
        }
    }

    public void deleteFront() {
        if (front == null) {
            System.out.println("Deque is empty");
        } else {
            front = front.next;
            if (front != null) {
                front.prev = null;
            } else {
                rear = null;
            }
        }
    }

    public void deleteRear() {
        if (rear == null) {
            System.out.println("Deque is empty");
        } else {
            rear = rear.prev;
            if (rear != null) {
                rear.next = null;
            } else {
                front = null;
            }
        }
    }

    public void display() {
        if (front == null) {
            System.out.println("Deque is empty");
            return;
        }
        Node current = front;
        System.out.print("Deque elements: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class doubleEndedQueue {
    public static void main(String[] args) {
        Dequeue d = new Dequeue();

        d.insertFront(10);
        d.insertFront(20);
        d.display();

        d.insertRear(30);
        d.insertRear(40);
        d.display();

        d.deleteFront();
        d.display();

        d.deleteRear();
        d.display();
    }
}
