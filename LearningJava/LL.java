package LearningJava;

// Creation of Node Class

public class LL {
    Node head;
    private int size;

    LL(){
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

// Insertion at First


    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

// Insertion at Last

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }


// Printing of Linked List

    public void printList(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        Node current = head;
        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

// Deletion From First Position

    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;
    }

// Deletion From Last Position

    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

// Get Size Of The Linked List

    public int getSize(){
        return size;
    }

// Creation of Main Function
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("Shivam");
        list.addFirst("is");
        list.addFirst("This");

        list.addLast("Kumar");

        list.deleteFirst();
        list.deleteLast();

        list.printList();

        System.out.println(list.getSize());
        list.addFirst("This");
        System.out.println(list.getSize());
    }
}
