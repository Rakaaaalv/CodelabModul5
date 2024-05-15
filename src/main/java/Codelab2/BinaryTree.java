package Codelab2;

public class BinaryTree {
    public Node2 root;

    public void NewNode(int data) {
        root = NewNode(root, new Node2(data));
    }

    private Node2 NewNode(Node2 root, Node2 newData) {
        if (root == null) {
            root = newData;
            return root;
        }

        if (newData.data < root.data) {
            root.left = NewNode(root.left, newData);
        } else {
            root.right = NewNode(root.right, newData);
        }
        return root;
    }

    public void inOrder(Node2 node2) {
        if (node2 != null) {
            inOrder(node2.left);
            System.out.println(node2.data + " ");
            inOrder(node2.right);
        }
    }

    public void preOrder(Node2 node2) {
        if (node2 != null) {
            System.out.println(node2.data + " ");
            preOrder(node2.left);
            preOrder(node2.right);
        }
    }

    public void postOrder(Node2 node2) {
        if (node2 != null) {
            postOrder(node2.left);
            postOrder(node2.right);
            System.out.println(node2.data + " ");
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.NewNode(20);
        tree.NewNode(2);
        tree.NewNode(25);
        tree.NewNode(37);
        tree.NewNode(16);

        System.out.println("\nPre Order: ");
        tree.preOrder(tree.root);

        System.out.println("\nIn Order: ");
        tree.inOrder(tree.root);

        System.out.println("\nPost Order: ");
        tree.postOrder(tree.root);
    }
}

class Node {
    int data;
    Node2 left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}