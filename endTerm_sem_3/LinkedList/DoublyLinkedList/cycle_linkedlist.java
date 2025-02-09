package LinkedList.DoublyLinkedList;

public class cycle_linkedlist {
    static class node {
        int data;
        node next;
        node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        node n1 = new node(3);
        node n2 = new node(1);
        node n3 = new node(8);
        node n4 = new node(0);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        System.out.print("Dose the linked list have a cycle: " + cyclelinkedlist(n1));
    }
    public static boolean cyclelinkedlist(node head) {
        if(head == null || head.next == null) {
            return false;
        }

        node slow = head;
        node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                return true;
            }
        }
        return false;
    }   
}
