package Basics_Of_Java;

class circular_linkedList{
    static class node{
        int data;
        node prev;
        node next;

        node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        node n1 = new node(8);
        node n2 = new node(4);
        node n3 = new node(6);
        node n4 = new node(5);

        n4.prev = n3;
        n3.prev = n2;
        n2.prev = n1;
        n1.prev = n4;

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n1;

        node currentnode = n4;
        node startnode = n4;
        System.out.println("Backward: ");
        System.out.print(currentnode.data + " -> ");
        currentnode = currentnode.prev;

        while (currentnode != startnode) {
            System.out.print(currentnode.data + " -> ");
            currentnode = currentnode.prev;
        }
        System.out.println("---");

        
        currentnode = n1;
        startnode = n1;
        System.out.println("Forward: ");
        System.out.print(currentnode.data + " -> ");
        currentnode = currentnode.next;

        while(currentnode != startnode){
            System.out.print(currentnode.data + " -> ");
            currentnode = currentnode.next;
        }
        System.out.println("---");
    }
}

