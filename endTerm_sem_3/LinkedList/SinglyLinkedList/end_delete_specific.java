package LinkedList.SinglyLinkedList;

public class end_delete_specific {
    static class node{
        int data;
        node next;
        node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        node n1 = new node(10);
        node n2 = new node(20);
        node n3 = new node(30);
        node n4 = new node(40);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        System.out.println("Traversal of linked list: ");
        traversal(n1);
        node m = delete(n1,n3);
        System.out.println("After delete  a node in linked list: ");
        traversal(m);
    }
    public static void  traversal(node head){
        node current = head;
        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public static node delete(node head,node d_node){
        if(head == d_node){
            return head.next;
        }
        node current = head;
        while(current.next != null && current.next != d_node){
            current = current.next;
        }
        if(current.next == null){
            return head;
        }
        current.next = current.next.next;
        return head;
    }
}
