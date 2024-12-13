package midTermPreparation;
//! insert a node at a specific position in singly linked list

// import Basics_Of_Java.sortingMethods;

// class singly_linkedList{
//     static class Node{
//         int data;
//         Node next;
//         Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static void main(String[] args) {
//         Node n1 = new Node(23);
//         Node n2 = new Node(15);
//         Node n3 = new Node(43);
//         Node n4 = new Node(33);
//         n1.next = n2;
//         n2.next = n3;
//         n3.next = n4;
//         System.out.println("Before inserting a node: ");
//         traversal(n1);
//         Node newNode = new Node(77);
//         Node n = insertaNode(newNode, 3, n1);
//         System.out.println("after inserting a node: ");
//         traversal(n);
//     }
//     public static void traversal(Node head){
//         Node current = head;

//         while(current != null){
//             System.out.print(current.data + " -> ");
//             current = current.next;
//         }
//         System.out.println("null");
//     }

//     public static Node insertaNode(Node newNode,int position,Node head){
//         if(position == 1){
//             newNode.next = head;
//             return newNode;
//         }
//         Node current = head;
//         for(int i = 0; i < position - 1 && current.next != null; i++){
//              current = current.next;
//         }
//         if(current != null){
//             newNode.next = current.next;
//             current.next = newNode;
//         }
//         return head;
//     }
// }

//! insert a node at the beginning of the singly linked list

// class ll{
//     static class node{
//         int data;
//         node next;
//         node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }

//     private node head;
//     public static void main(String[] args){
//         ll list = new ll();
//         list.insertAtBeginning(23);
//         list.insertAtBeginning(34);
//         list.printList();
//     }

//     public void insertAtBeginning(int data){
//         node newNode = new node(data);
//         newNode.next = head;
//         head = newNode;
//     }

//     public void printList(){
//         node current = head;
//         while (current != null) {
//             System.out.print(current.data + " -> ");
//             current = current.next;
//         }
//         System.out.println("null");
//     }
// }

//! insert a node at the end of a singly linked list

// public class ll {
//     class node {
//         int data;
//         node next;

//         node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     private node head;

//     public static void main(String[] args) {
//         ll list = new ll();
//         list.insertAtEnd(34);
//         list.insertAtEnd(24);
//         list.printList();
//     }

//     public void insertAtEnd(int data) {
//         node newNode = new node(data);
//         node current = head;

//         if (head == null) {
//             head = newNode;
//             return;
//         }
//         while (current.next != null) {
//             current = current.next;
//         }
//         current.next = newNode;
//     }

//     public void printList() {
//         node current = head;
//         while (current != null) {
//             System.out.print(current.data + " -> ");
//             current = current.next;
//         }
//         System.out.println("null");
//     }

// }

//! delete a node at the beginning of the singly linked list

// public class ll {
//     class node {
//         int data;
//         node next;

//         node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     private node head;

//     public static void main(String[] args) {
//         ll list = new ll();
//         list.insertAtEnd(23);
//         list.insertAtEnd(34);
//         list.insertAtEnd(35);
//         list.deleteAtBeginning();
//         list.printList();
//     }

//     public void insertAtEnd(int data){
//         node newNode = new node(data);
//         if(head == null){
//             head = newNode;
//             return;
//         }
//         node current = head;
//         while(current.next != null){
//             current = current.next;
//         }
//         current.next = newNode;
//     }

//     public void deleteAtBeginning() {
//         node current = head;
//         if (current == null) {
//             System.out.println("list is empty");
//             return;
//         }
//         head = head.next;
//     }

//     public void printList() {
//         node current = head;
//         while (current != null) {
//             System.out.print(current.data + " -> ");
//             current = current.next;
//         }
//         System.out.println("null");
//     }
// }

//! create a singly linked list

public class ll {
    static class node {
        int data;
        node next;

        node(int data) {
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
        printlist(n1);
    }

    public static void printlist(node head) {
        node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

//! create a doubly linkedlist

// public class ll{
//     static class node{
//         int data;
//         node next;
//         node prev;
//         node(int data){
//             this.data = data;
//             this.next = null;
//             this.prev = null;
//         }
//     }
//     public static void main(String[] args) {
//         node n1 = new node(10);
//         node n2 = new node(20);
//         node n3 = new node(30);
//         node n4 = new node(40);

//         n1.next = n2;
//         n2.next = n3;
//         n3.next = n4;

//         n4.prev = n3;
//         n3.prev = n2;
//         n2.prev = n1;

//         node currentNode = n4;
//         System.out.println("Backward : ");
//         while(currentNode != null){
//             System.out.print(currentNode.data + " -> ");
//             currentNode = currentNode.prev;
//         }
//         System.out.println("null");
//         currentNode = n1;
//         System.out.print("Forward: ");
//         while(currentNode != null){
//             System.out.print(currentNode.data + " -> ");
//             currentNode = currentNode.next;
//         }
//         System.out.println("null");
//     }
// }

//! traverse through a doubly linked list

// public class ll{
//     static class node{
//         int data;
//         node next;
//         node prev;
//         node(int data){
//             this.data = data;
//             this.next = null;
//             this.prev = null;
//         }
//     }
    // public static void main(String[] args){
    //     node n1 = new node(10);
    //     node n2 = new node(20);
    //     node n3 = new node(30);
    //     node n4 = new node(40);

    //     n1.next = n2;
    //     n2.next = n3;
    //     n3.next = n4;

    //     n4.prev = n3;
    //     n3.prev = n2;
    //     n2.prev = n1;

    //     System.out.println("Traversal forward: ");
    //     TraversalForward(n1);
    //     System.out.println("Traversal Backward: ");
    //     TraversalBackward(n4);
    // }

//     public static void TraversalForward(node head){
//         node currentNode = head;
//         while(currentNode != null){
//             System.out.print(currentNode.data + " -> ");
//             currentNode = currentNode.next;
//         }
//         System.out.println("null");
//     }

//     public static void TraversalBackward(node head){
//         node currentNode = head;
//         while(currentNode != null){
//             System.out.print(currentNode.data + " -> ");
//             currentNode = currentNode.prev;
//         }
//         System.out.println("null");
//     }

// }

//! insert a  node at a specific position in a doubly linked list

// public class ll{
//     static class node{
//         int data;
//         node next;
//         node prev;
//         node(int data){
//             this.data = data;
//             this.next = null;
//             this.prev = null;
//         }
//     }

// }


//! creation of circular doubly linked list


// public class dsa{
//     static class node{
//         int data;
//         node next;
//         node prev;

//         node(int data){
//             this.data = data;
//             this.next = null;
//             this.prev = null;
//         }
//     }
//     public static void main(String[] args) {
//         node n1 = new node(12);
//         node n2 = new node(15);
//         node n3 = new node(17);
//         node n4 = new node(20);

//         n1.next = n2;
//         n2.next = n3;
//         n3.next = n4;
//         n4.next = n1;

//         n4.prev = n3;
//         n3.prev = n2;
//         n2.prev = n1;
//         n1.prev = n4;

//         node startNode = n1;
//         node endNode = n1;

//         System.out.println("Forward: ");

//         System.out.print(startNode.data + " -> ");
//         startNode = startNode.next;
//         while(startNode != endNode){
//             System.out.print(startNode.data + " -> ");
//             startNode = startNode.next;
//         }
//         System.out.println("_");

//         startNode = n4;
//         endNode = n4;

//         System.out.println("Backward: ");

//         System.out.print(startNode.data + " -> ");
//         startNode = startNode.prev;
//         while(startNode != endNode){
//             System.out.print(startNode.data + " ->");
//             startNode = startNode.prev;
//         }
//         System.out.println("_");

//     }
// }
//! create a circular linked list in singly

// public class ll{
//     static class node{
//         int data;
//         node next;
//         node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }
//     public static void main(String[] args) {
//         node n1 = new node(10);
//         node n2 = new node(20);
//         node n3 = new node(30);
//         node n4 = new node(40);

//         n1.next = n2;
//         n2.next = n3;
//         n3.next = n4;
//         n4.next = n1;

//         node startnode = n1;
//         node endNode = n1;

//         System.out.println("forward: ");
//         System.out.print(startnode.data + " -> ");
//         startnode = startnode.next;

//         while(startnode != endNode){
//             System.out.print(startnode.data + " -> ");
//             startnode = startnode.next;
//         }
//         System.out.println("_");
//     }
// }

//! reverse of a linked list

// public class ll {
//     static class node {
//         int data;
//         node next;

//         node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static void main(String[] args) {
//         node n1 = new node(3);
//         node n2 = new node(6);
//         node n3 = new node(2);
//         node n4 = new node(0);
//         node n5 = new node(8);

//         n1.next = n2;
//         n2.next = n3;
//         n3.next = n4;
//         n4.next = n5;

//         System.out.println("Singly linked list: ");
//         traversal(n1);

//         System.out.println("after reverse a singly linked list: ");
//         node n = reversenode(n1);
//         traversal(n);
//     }

//     public static void traversal(node head) {
//         node currentnode = head;
//         while (currentnode != null) {
//             System.out.print(currentnode.data + " -> ");
//             currentnode = currentnode.next;
//         }
//         System.out.println("null");

//     }

//     public static node reversenode(node head) {
//         if (head == null || head.next == null) {
//             return head;
//         }
//         node prevNode = null;
//         node current = head;
//         while (current != null) {
//             node nextnode = current.next;
//             current.next = prevNode;
//             prevNode = current;
//             current = nextnode;
//         }
//         return prevNode;
//     }
// }

