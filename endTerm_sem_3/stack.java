class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class stack {
    private Node top;
    public stack(){
        this.top = null;
    }
    public void push(int item){
        Node newNode = new Node(item);
        newNode.next = top;
        top = newNode;
    }
    public int pop(){
        if(top == null){
            System.out.println("Stack underflow");
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
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        stack stack = new stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
