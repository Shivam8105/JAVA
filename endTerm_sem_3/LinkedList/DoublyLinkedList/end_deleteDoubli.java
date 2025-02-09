package LinkedList.DoublyLinkedList;

public class end_deleteDoubli {
    static class node {
        int data;
        node next;
        node prev;
        node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static void main(String[] args) {
        node n1 = new node(7);
        node n2 = new node(6);
        node n3 = new node(5);
        node n4 = new node(3);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        n4.prev = n3;
        n3.prev = n2;
        n2.prev = n1;

        System.out.println("forward doubli linked list:");
        traversal_forward(n1);
        System.out.println("after delete a node in doubli linked list: ");
        node n = delete_forward(n1);
        traversal_forward(n);

        System.out.println("backward doubli linked list: ");
        traversal_backward(n4);
        System.out.println("after delete a node in doubli linked list: ");
        node m = delete_backward(n4);
        traversal_backward(m);
    }
    public static void traversal_forward(node head) {
        node current = head;
        while(current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public static void traversal_backward(node head) {
        node current = head;
        while(current != null) {
            System.out.print(current.data + " -> ");
            current = current.prev;
        }
        System.out.println("null");
    }
    public static node delete_forward(node head) {
        if(head == null) {
            return head;
        }

        node last = head;
        while(last.next.next != null) {
            last = last.next;
        }
        last.next = null;
        return head;
    }
    public static node  delete_backward(node head) {
        if(head == null) {
            return head;
        }
        node last = head;
        while(last.prev.prev != null) {
            last = last.prev;
        }
        last.prev = null;
        return head;
    }
}