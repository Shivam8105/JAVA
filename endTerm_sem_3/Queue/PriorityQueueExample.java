package Queue;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(5);
        pq.add(20);
        pq.add(15);
        while (!pq.isEmpty()) {
            System.out.println(pq.poll()); 
        }
    }
}

