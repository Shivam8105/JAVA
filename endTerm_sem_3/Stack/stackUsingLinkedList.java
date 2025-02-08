package Stack;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class stackUsingLinkedList {
    private Node top;
    stackUsingLinkedList(){
        this.top = null;
    }

    public void push(int value){
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    public int pop(){
        if(top == null){
            System.out.println("Stack is empty");
            return -1;
        }
        int item = top.data;
        top = top.next;
        return item;
    }

    public int peek(){
        if(top == null){
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public void display(){
        Node current = top;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        stackUsingLinkedList stack = new stackUsingLinkedList();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.display();
    }
}
