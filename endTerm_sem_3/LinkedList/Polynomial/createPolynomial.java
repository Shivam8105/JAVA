package LinkedList.Polynomial;

public class createPolynomial {
    static class node {
        int coefficient;
        int exponent;
        node next;
    
        public node(int coefficient, int exponent) {
            this.coefficient = coefficient;
            this.exponent = exponent;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        node n1 = new node(2, 3);
        node n2 = new node(8, 2);
        node n3 = new node(4, 1);
        node n4 = new node(6, 0);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        System.out.print("Polynomial: ");
        display(n1);

        int x = 2;
        System.out.println("Polynomial evaluated at x = " + x + ": " + evaluate(n1,x));
    
    }

    public static void display(node head) {
        node current = head;
        while (current != null) {
            System.out.print(current.coefficient + "x^" + current.exponent);
            current = current.next;
            if (current != null) {
                System.out.print(" + ");
            }
        }
        System.out.println();
    }

    public static int evaluate(node head, int x) {
        node current = head;
        int result = 0;
        while (current != null) {
            result += current.coefficient * Math.pow(x, current.exponent);
            current = current.next;
        }
        return result;
    }
}