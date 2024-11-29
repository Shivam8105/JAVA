package Basics_Of_Java;

class Node{
    int data;
    Node prev;
    Node next;
    Node(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class practice_2 {
    private Node front;
    private Node rear;
    private int size;

    practice_2(){
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }

    public void addFront(int data){
        Node newNode = new Node(data);

        if(isEmpty()){
            front = rear = newNode;
        }
        else{
            newNode.next = front;
            front.prev = newNode;
            front = newNode;
        }
        size++;
    }

    public void addRear(int data){
        Node newNode = new Node(data);

        if(isEmpty()){
            front = rear = newNode;
        }
        else{
            newNode.prev = rear;
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public int removeFront(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        int data = front.data;
        if(front == rear){
            front = rear = null;
        }
        front = front.next;
        front.prev = null;
        size--;
        return data;
    }

    public int removeRear(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int data = rear.data;
        if(front == rear){
            front = rear = null;
        }
        rear = rear.prev;
        rear.next = null;
        size--;
        return data;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        Node current = front;
        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        practice_2 obj = new practice_2();
        obj.addFront(20);
        obj.addFront(10);
        obj.display();

        obj.addRear(30);
        obj.addRear(40);
        obj.removeFront();
        obj.display();
        obj.removeRear();
        obj.display();

        System.out.println(obj.size());
    }

}
