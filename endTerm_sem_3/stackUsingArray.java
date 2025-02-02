class stackUsingArray {
    private int[] arr;
    private int top;
    private int capacity;
    public stackUsingArray(int size){
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int value){
        if(isFull()){
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = value;
    }

    //pop operation
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack UnderFlow");
            return -1;
        }
        return arr[top--];
    }

    // peek operation

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top];
    }

    // check if stack is full

    public boolean isFull(){
        return top == capacity - 1;
    }

    // check if stack is empty

    public boolean isEmpty(){
        return top == -1;
    }

    // print stack 

    public void printStack(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack Elements: ");
        for(int i = 0; i <= top; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        stackUsingArray stack = new stackUsingArray(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.printStack();
        System.out.println("Top Element: " + stack.peek());
        stack.pop();
        stack.printStack();

    }
}
