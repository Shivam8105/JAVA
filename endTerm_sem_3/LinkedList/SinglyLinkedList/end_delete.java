package LinkedList.SinglyLinkedList;

public class end_delete {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node n1 = new Node(10);        
        Node n2 = new Node(20);        
        Node n3 = new Node(30);        
        Node n4 = new Node(40);   
        
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        System.out.println("traversal of a linked list: ");
        traversal(n1);
        Node m = delete(n1);
        traversal(m);

    }

    public static Node delete(Node head) {
        if(head == null) {
            return head;
        }

        Node last = head;
        while(last.next.next != null) {
            last = last.next;
        }
        last.next = null;
        return head;
    }

    public static void traversal(Node head){
        Node current = head;
        System.out.print("Elements: ");
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
