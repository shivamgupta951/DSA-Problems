/*
Three types of Tree Traversal
*/
class Node {
    Node left;
    Node right;
    int data;

    Node(int value) {
        this.data = value;
        this.left = null;
        this.right = null;
    }
}

public class prog64 {

    // Inorder: Left, Root, Right
    public static void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    // Preorder: Root, Left, Right
    public static void preorder(Node root) {
        if (root == null) return;

        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    // Postorder: Left, Right, Root
    public static void postorder(Node root) {
        if (root == null) return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    public static void main(String[] args) {

        // Build a simple tree to test:
        /*
                1
               / \
              2   3
             / \
            4   5
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Inorder:");
        inorder(root);

        System.out.println("");
        System.out.println("Preorder:");
        preorder(root);

        System.out.println("");
        System.out.println("Postorder:");
        postorder(root);
    }
}
