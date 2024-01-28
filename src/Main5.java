import java.util.Scanner;

class Node {
    int data;
    Node lt, rt;

    public Node(int val) {
        this.data = val;
        lt = rt = null;
    }
}

public class Main5 {
    static Node root;

    public static void dfs(Node root) {
        if (root == null) return;
        else {
            dfs(root.lt);
            System.out.print(root.data + " ");
            dfs(root.rt);
        }
    }

    public static void main(String[] args) {
        root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        root.rt.lt = new Node(6);
        root.rt.rt = new Node(7);
        dfs(root);


    }
}