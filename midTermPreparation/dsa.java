package midTermPreparation;

public class dsa {
    static class node {
        int coefficient;
        int power;
        node next;
        node(int coefficient, int power) {
            this.coefficient = coefficient;
            this.power = power;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        node n1 = new node(2,3);
        node n2 = new node(5,2);
        node n3 = new node(7,1);
        node n4 = new node(1,0);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        node n5 = new node(5,2);
        node n6 = new node(7,1);
        node n7 = new node(1,0);

        n5.next = n6;
        n6.next = n7;

        traversal(n1);
        traversal(n5);
        node n = add(n1, n5);
        traversal(n);
        node m = mult(n1, n5);
        traversal(m);
    }
    public static void traversal(node head) {
        node current = head;
        while (current != null) {
            System.out.print(current.coefficient + "x^" + current.power);
            current = current.next;
            if(current != null) {
                System.out.print(" + ");
            }
        }
        System.out.println();
    }
    public static node add(node poly1, node poly2){
        node result = null;
        node last = null;

        while(poly1 != null && poly2 != null ){
            int coeff, power;

            if(poly1 != null && poly2 != null && poly1.power == poly2.power) {
                coeff = poly1.coefficient + poly2.coefficient;
                power = poly1.power;
                poly1 = poly1.next;
                poly2 = poly2.next;
            } else if(poly1 == null ||(poly2 != null && poly1.power < poly2.power)) {
                coeff = poly2.coefficient;
                power = poly2.power;
                poly2 = poly2.next;
            } else {
                coeff = poly1.coefficient;
                power = poly1.power;
                poly1 = poly1.next;
            }

            node newnode = new node(coeff, power);
            if(result == null) {
                result = newnode; 
            } else {
                last.next = newnode;
            }
            last = newnode;
        }
        return result;
    }
    public static node mult(node poly1, node poly2) {
        node result = null;

        for(node term1 = poly1;term1 != null; term1 = term1.next) {
            for(node term2 = poly2;term2 != null; term2 = term2.next) {
                int newcoeff = term1.coefficient * term2.coefficient;
                int newpower = term1.power + term2.power;
                result = addterm(result,newcoeff,newpower);
            }
        }
        return result;
    }
    public static node addterm(node head, int newcoeff, int newpower) {
        node newnode = new node(newcoeff, newpower);
        if(head == null || head.power < newpower) {
            newnode.next = head;
            return newnode;
        }

        node current = head;
        node prev = null;
        while(current != null && current.power > newpower) {
            prev = current;
            current = current.next;
        }

        if(current != null && current.power == newpower) {
            current.coefficient += newcoeff;
        } else {
            newnode.next = current;
            if(prev == null){
                return newnode;
            } else {
                prev.next = newnode;
            }
        }
        return head;
    }
}