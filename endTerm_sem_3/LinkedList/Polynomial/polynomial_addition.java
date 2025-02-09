package LinkedList.Polynomial;

public class polynomial_addition {
    static class Node {
        int coefficient;
        int exponent;
        Node next;

        public Node(int coefficient, int exponent) {
            this.coefficient = coefficient;
            this.exponent = exponent;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        // First polynomial: 2x^3 + 8x^2 + 4x + 6
        Node n1 = new Node(2, 3);
        Node n2 = new Node(8, 2);
        Node n3 = new Node(4, 1);
        Node n4 = new Node(6, 0);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        // Second polynomial: 2x^2 + 8x + 4
        Node n5 = new Node(2, 2);
        Node n6 = new Node(8, 1);
        Node n7 = new Node(4, 0);

        n5.next = n6;
        n6.next = n7;

        System.out.print("Polynomial 1: ");
        display(n1);

        System.out.print("Polynomial 2: ");
        display(n5);

        Node result = add(n1, n5);
        System.out.print("Resultant Polynomial after addition: ");
        display(result);
    }

    // Method to display the polynomial
    public static void display(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.coefficient + "x^" + current.exponent);
            current = current.next;
            if (current != null) {
                System.out.print(" + ");
            }
        }
        System.out.println();
    }

    // Method to add two polynomials represented as linked lists
    public static Node add(Node poly1, Node poly2) {
        Node result = null; // Head of the result list
        Node last = null; // Pointer to last node in result list

        // Traverse both polynomials
        while (poly1 != null || poly2 != null) {
            int coeff, expo;

            // If both have the same exponent, add coefficients
            if (poly1 != null && poly2 != null && poly1.exponent == poly2.exponent) {
                coeff = poly1.coefficient + poly2.coefficient;
                expo = poly1.exponent;
                poly1 = poly1.next;
                poly2 = poly2.next;
            }
            // If poly1 has a larger exponent, take its term
            else if (poly2 == null || (poly1 != null && poly1.exponent > poly2.exponent)) {
                coeff = poly1.coefficient;
                expo = poly1.exponent;
                poly1 = poly1.next;
            }
            // If poly2 has a larger exponent, take its term
            else {
                coeff = poly2.coefficient;
                expo = poly2.exponent;
                poly2 = poly2.next;
            }

            // Create new term node for the result
            Node newNode = new Node(coeff, expo);

            // Insert the new term in the result list
            if (result == null) {
                result = newNode;
            } else {
                last.next = newNode;
            }
            last = newNode;
        }
        return result;
    }
}