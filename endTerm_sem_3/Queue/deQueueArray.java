package Queue;

public class deQueueArray {
    public static void main(String[] args) {
        Deque Q = new Deque(5);
        Q.enqueueFront(2);
        Q.enqueueRear(3);
        Q.enqueueRear(5);
        Q.display();

        System.out.println("\nDequeued from front: " + Q.dequeueFront());
        Q.display();

        System.out.println("\nDequeued from rear: " + Q.dequeueRear());
        Q.display();
    }

    static class Deque {
        int[] arr;
        int front, rear, size;

        Deque(int capacity) {
            arr = new int[capacity];
            front = -1;
            rear = -1;
            size = capacity;
        }

        boolean isEmpty() {
            return front == -1;
        }

        boolean isFull() {
            return (rear + 1) % size == front;
        }

        void enqueueFront(int value) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            if (isEmpty()) {
                front = rear = 0;
            } else if (front == 0) {
                front = size - 1;
            } else {
                front--;
            }
            arr[front] = value;
        }

        void enqueueRear(int value) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            if (isEmpty()) {
                front = rear = 0;
            } else {
                rear = (rear + 1) % size;
            }
            arr[rear] = value;
        }

        int dequeueFront() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int value = arr[front];
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % size;
            }
            return value;
        }

        int dequeueRear() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int value = arr[rear];
            if (front == rear) {
                front = rear = -1;
            } else if (rear == 0) {
                rear = size - 1;
            } else {
                rear--;
            }
            return value;
        }

        void display() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }
            System.out.print("Queue: ");
            int i = front;
            while (true) {
                System.out.print(arr[i] + " ");
                if (i == rear) break;
                i = (i + 1) % size;
            }
            System.out.println();
        }
    }
}
