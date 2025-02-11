package Queue;

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class queueUsingLinkedList {
    private Node front,rear;
    private int size;

    public queueUsingLinkedList(){
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int getSize(){
        return size;
    }

    public void enqueue(int value){
        Node newNode = new Node(value);
        if(rear == null){
            front = rear = newNode;
        }else{
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public int dequeue(){
        if(rear == null){
            System.out.println("Queue is empty");
            return -1;
        }
        int item = front.data;
        front = front.next;
        if(front == null) rear = null;
        size--;
        return item;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int item = front.data;
        return item;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        Node current = front;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        queueUsingLinkedList queue = new queueUsingLinkedList();
        queue.enqueue(50);
        queue.enqueue(40);
        queue.enqueue(30);
        queue.enqueue(20);
        queue.enqueue(10);
        queue.display();
        System.out.println(queue.peek());
        queue.dequeue();
        System.out.println(queue.peek());
    }
}
