package LinkedList.Polynomial;

public class polynomial_multiplication {
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

        node n5 = new node(2, 2);
        node n6 = new node(8, 1);
        node n7 = new node(4, 0);

        n5.next = n6;
        n6.next = n7;

        System.out.print("Polynomial: ");
        display(n1);

        System.out.print("Polynomial: ");
        display(n5);

        node result = multiply(n1, n5);
        System.out.print("Resultant Polynomial after multiplication: ");
        display(result);

    }

    // Method to display the polynomial
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

    public static node multiply(node head1, node head2) {
        node result = null;

        // For each term in the first polynomial
        for (node term1 = head1; term1 != null; term1 = term1.next) {
            // For each term in the second polynomial
            for (node term2 = head2; term2 != null; term2 = term2.next) {
                int newCoefficient = term1.coefficient * term2.coefficient;
                int newExponent = term1.exponent + term2.exponent;
                // Insert or update the term in the result list
                result = addterm(result, newCoefficient, newExponent);
            }
        }
        return result;
    }

    // Method to insert a term in sorted order or update if exponent exists
    public static node addterm(node head, int coefficient, int exponent) {
        node newNode = new node(coefficient, exponent);

        // If the list is empty or new term has the highest exponent, insert at the
        // beginning
        if (head == null || head.exponent < exponent) {
            newNode.next = head;
            return newNode;
        }

        node current = head;
        node prev = null;

        // Traverse to find the correct position or to add to an existing exponent
        while (current != null && current.exponent > exponent) {
            prev = current;
            current = current.next;
        }

        // If we find a term with the same exponent, add the coefficients
        if (current != null && current.exponent == exponent) {
            current.coefficient += coefficient;
        } else {
            // Insert the new term at the correct position
            newNode.next = current;
            if (prev == null) {
                return newNode;
            } else {
                prev.next = newNode;
            }
        }

        return head;
    }
}
