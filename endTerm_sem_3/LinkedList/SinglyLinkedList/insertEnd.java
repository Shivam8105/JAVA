package LinkedList.SinglyLinkedList;

public class insertEnd {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public void traversal() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void insertNodeEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public static void main(String[] args) {
        insertEnd list = new insertEnd();
        list.insertNodeEnd(10);
        list.insertNodeEnd(20);
        list.insertNodeEnd(30);
        list.insertNodeEnd(40);
        list.insertNodeEnd(50);
        list.traversal(); 
    }
}
