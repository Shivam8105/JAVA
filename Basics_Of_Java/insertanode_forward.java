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

        System.out.println("Before insert a node: ");
        System.out.println("Traversal Forward: ");
        TraversalForward(n1);
        System.out.println("Traversal Backward: ");
        TraversalBackward(n4);
        System.out.println("After insert a node: ");
        node newnode = new node(64);
        node n = insertanode_forward(n1,newnode,1);
        System.out.println("Traversal forward: ");
        TraversalForward(n);
        node m = insertanode_backward(n4,newnode,1);
        System.out.println("Traversal Backward: ");
        TraversalBackward(m);
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
        node currentnode = head;
        while(currentnode != null){
            System.out.print(currentnode.data + " -> ");
            currentnode = currentnode.prev;
        }
        System.out.println("null");
    }
    public static node insertanode_forward(node head,node newnode,int position) {
        if(position == 1){
            newnode.next = head;
            return newnode;
        }
        node currentnode = head;
        for(int i = 0; i < position - 1 && currentnode.next != null; i++){
            currentnode = currentnode.next;
        }
        return head;
    }
    public static node insertanode_backward(node head,node newnode,int position){
        if(position == 1){
            newnode.prev = head;
            return newnode;
        }
        node currentnode = head;
        for(int i = 1; i < position - 1 && currentnode.prev != null; i++){
            currentnode = currentnode.prev;
        }
        if(currentnode != null){
            newnode.prev = currentnode.prev;
            currentnode.prev = newnode;
        }
        return head;
    }
}
