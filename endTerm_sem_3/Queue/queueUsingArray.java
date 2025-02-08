package Queue;

class QueueArray{
    private int front, rear, size;
    private int capacity;
    private int[] queue;
    public QueueArray(int capacity){
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }
    public boolean isFull(){
       return size == capacity;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int getSize(){
        return size;
    }

    public void enqueue(int value){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = value;
        size++;
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int value = queue[front];
        front = (front + 1) % capacity;
        size--;
        return value;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        for(int i = 0; i < size; i++){
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        QueueArray queue = new QueueArray(5);
        queue.enqueue(50);
        queue.enqueue(40);
        queue.enqueue(30);
        queue.enqueue(20);
        queue.enqueue(10);
        queue.display();
        queue.dequeue();
        queue.display();
        System.out.println(queue.dequeue());
        System.out.println(queue.getSize());
    }
}