package LinkedList.SinglyLinkedList;

public class singlyInsertSpecific {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
        public static void traversal(Node head){
            Node current = head;
            while(current != null){
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }
        public static Node insertNode(Node newNode, int position, Node head){
            if(position == 1){
                newNode.next = head;
                return newNode;
            }
            Node current = head;
            for(int i = 0;  i < position - 1 && current.next != null; i++){
                current = current.next;
            }
            if(current != null){
                newNode.next = current.next;
                current.next = newNode;
            }
            return head;
        }
        public static void main(String[] args) {
            Node n1 = new Node(10);
            Node n2 = new Node(20);
            Node n3 = new Node(30);
            Node n4 = new Node(40);

            n1.next = n2;
            n2.next = n3;
            n3.next = n4;
            System.out.print("Before inserting a node: ");
            traversal(n1);
            Node newNode = new Node(77);
            Node n = insertNode(newNode, 3, n1);
            System.out.print("After inserting a new node: ");
            traversal(n);

        }

    }
}
