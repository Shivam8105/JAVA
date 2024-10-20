package Basics_Of_Java;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    public void insertAtBeginning(int newData){
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    public void printList(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println(" -> NULL");
    }
    
    public static void main(String[] args) {
        LinkedList List = new LinkedList();
        List.insertAtBeginning(1);
        List.insertAtBeginning(2);
        List.insertAtBeginning(3);
        List.insertAtBeginning(4);
        List.insertAtBeginning(5);
        List.printList();
    }
}
