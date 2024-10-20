package Basics_Of_Java;

class doubly_linkedList{
    static class node{
        int data;
        node next;
        node prev;

        node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static void main(String[] args) {
        node n1 = new node(2);
        node n2 = new node(4);
        node n3 = new node(1);
        node n4 = new node(9);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        n4.prev = n3;
        n3.prev = n2;
        n2.prev = n1;

        System.out.println("Traversal forward: ");
        TraversalForward(n1);
        System.out.println("Traversal Backward: ");
        TraversalBackward(n4);
    }

    public static void TraversalForward(node head){
        node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    public static void TraversalBackward(node head){
        node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.prev;
        }
        System.out.println("null");
    }
}

