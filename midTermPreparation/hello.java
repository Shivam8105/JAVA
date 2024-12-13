package midTermPreparation;

public class hello {
    static class node{
        int data;
        node next;
        node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        node n1 = new node(1);
        node n2 = new node(3);
        node n3 = new node(5);
        node n4 = new node(7);
        node n5 = new node(9);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        System.out.println("linked list: ");
        traversal(n1);

        node midvalue = midterm(n1);
        if(midvalue != null) {
            System.out.println("midterm of linked list are: " + midvalue.data);
        } else {
            System.out.println("linked list is null.");
        }
    }
    public static void traversal(node head) {
        node currentnode = head;
        while(currentnode != null) {
            System.out.print(currentnode.data + " --> ");
            currentnode = currentnode.next;
        }
        System.out.println("null");
    }
    public static node midterm(node head) {
        if(head == null) {
            return null;
        }

        node slow = head;
        node fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}