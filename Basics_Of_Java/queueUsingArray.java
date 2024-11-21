package Basics_Of_Java;

class Queue{
    private int[] arr;
    private int front;
    private int rear;
    private int capacity;
    private int count;

    public Queue(int size){
        arr = new int[size];
        capacity  = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    public void enqueue(int item){
        if(isFull()){
            System.out.println("Queue is full. Cannot enqueue");
            return;
        }
        rear = (rear + 1)% capacity;
        arr[rear] = item;
        count++;
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty. Cannot dequeue");
            return -1;
        }
        int item = arr[front];
        front = (front + 1)%capacity;
        count--;
        return item;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty.");
            return -1;
        }
        return arr[front];
    }

    public boolean isEmpty(){
        return count == 0;
    }

    public boolean isFull(){
        return count == capacity;
    }

    public int size(){
        return count;
    }
}
public class queueUsingArray {
    public static void main(String[] args) {
        Queue queue = new Queue(6);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Front element is: " + queue.peek());
        System.out.println("Queue size is: " + queue.size());

        queue.dequeue();
        System.out.println("After dequeue front element is: " + queue.peek());

        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        queue.enqueue(70);

        System.out.println("Queue size is: " + queue.size());
    }
}
