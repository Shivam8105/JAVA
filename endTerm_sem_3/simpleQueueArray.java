// public class simpleQueueArray {
//     private int arr[],front,rear,capacity;

//     public simpleQueueArray(int size){
//         arr = new int[size];
//         capacity = size;
//         front = rear = -1;
//     }

//     // enqueue

//     public void enqueue(int value){
//         if(rear == capacity - 1){
//             System.out.println("Queue Overflow");
//             return;
//         }
//         if(front == -1) front = 0;
//         arr[++rear] = value;
//     }

//     // dequeue
//     public int dequeue(){
//         if(front == -1 || front > rear){
//             System.out.println("queue underflow");
//             return -1;
//         }
//         return arr[front++];
//     }

//     public void printQueue(){
//         if(front == -1 || front > rear){
//             System.out.println("queue is empty");
//             return;
//         }
//         for(int i = front; i <= rear; i++){
//             System.out.print(arr[i] + " ");
//         System.out.println();    
//         }
//     }
//     public static void main(String[] args) {
//         simpleQueueArray queue = new simpleQueueArray(5);
//         queue.enqueue(10);
//         queue.enqueue(20);
//         queue.enqueue(30);
//         queue.enqueue(40);
//         queue.enqueue(50);
//         queue.printQueue();

//         queue.dequeue();
//         queue.printQueue();
//     }
// }

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class simpleQueueArray{
    private Node front,rear;

    public void enqueue(int value){
        Node newNode = new Node(value);
        if(rear == null){
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

}