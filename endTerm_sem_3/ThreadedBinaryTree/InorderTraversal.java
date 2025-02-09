package ThreadedBinaryTree;

class ThreadedNode {
    int key;
    ThreadedNode left, right;
    boolean isThreaded;

    public ThreadedNode(int key) {
        this.key = key;
        this.left = this.right = null;
        this.isThreaded = false;
    }
}

public class InorderTraversal {
    ThreadedNode root;

    ThreadedNode leftMost(ThreadedNode node) {
        while (node != null && node.left != null) {
            node = node.left;
        }
        return node;
    }

    void inorder(ThreadedNode root) {
        ThreadedNode current = leftMost(root);
        while (current != null) {
            System.out.print(current.key + " ");
            
            if (current.isThreaded) {
                current = current.right; 
            } else {
                current = leftMost(current.right);
            }
        }
    }

    public static void main(String[] args) {
        InorderTraversal tree = new InorderTraversal();
        
        tree.root = new ThreadedNode(10);
        tree.root.left = new ThreadedNode(5);
        tree.root.right = new ThreadedNode(20);
        tree.root.right.left = new ThreadedNode(15);
        tree.root.right.right = new ThreadedNode(30);

        tree.root.left.isThreaded = true;
        tree.root.left.right = tree.root;
        
        tree.root.right.left.isThreaded = true;
        tree.root.right.left.right = tree.root.right; 

        System.out.println("Threaded Inorder Traversal: ");
        tree.inorder(tree.root);
    }
}
