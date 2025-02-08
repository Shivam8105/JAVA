package LinkedList.SinglyLinkedList;

class insertAtBeginning{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    private Node head;

    public void insertBegin(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void printList(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        insertAtBeginning insert = new insertAtBeginning();
        insert.insertBegin(10);
        insert.insertBegin(20);
        insert.insertBegin(30);
        insert.printList();
    }
}

