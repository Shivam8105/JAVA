package Queue;

public class circularQueueArray {
    private int[] queue;
    private int front, rear;
    private int size;
    private int capacity;

    circularQueueArray(int capacity){
        front = rear = -1;
        this.capacity = capacity;
        queue = new int[capacity];
    }

    public boolean isEmpty(){
        return front == -1;
    }

    public boolean isFull(){
        return ((rear + 1) % capacity) == front;
    }

    public int getSize(){
        return size;
    }

    public void enqueue(int value){
        if(isFull()){
            System.out.println("Queue is full");
        }else{
            if(front == -1) front = 0;
            rear = (rear + 1) % capacity;
            queue[rear] = value;
            size++;
        }
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int item = queue[front];
        if(front == rear) front = rear = -1;
        else front = (front + 1) % capacity;
        size--;
        return item;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue: ");
        int i = front;
        while(true){
            System.out.print(queue[i] + " ");
            if(i == rear){
                break;
            }
            i = (i + 1) % capacity;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        circularQueueArray queue = new circularQueueArray(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.display();
        queue.dequeue();
        queue.display();
    }

}
