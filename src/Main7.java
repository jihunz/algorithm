import java.util.LinkedList;
import java.util.Queue;

class Node2 {
    int data;
    Node2 lt, rt;

    public Node2(int val) {
        this.data = val;
        lt = rt = null;
    }
}

public class Main7 {
    static Node2 root;

    public static void dfs(Node2 root) {
        Queue<Node2> q = new LinkedList<>();
        q.offer(root);
        int level = 0;

        while (!q.isEmpty()) {
            System.out.print(level + ": ");
            int size = q.size();

            for (int i = 0; i < size; i++) {
                Node2 curr = q.poll();
                System.out.print(curr.data + " ");
                if (curr.lt != null) q.offer(curr.lt);
                if (curr.rt != null) q.offer(curr.rt);
            }
            level++;
            System.out.println();
        }

    }

    public static void main(String[] args) {
        root = new Node2(1);
        root.lt = new Node2(2);
        root.rt = new Node2(3);
        root.lt.lt = new Node2(4);
        root.lt.rt = new Node2(5);
        root.rt.lt = new Node2(6);
        root.rt.rt = new Node2(7);
        dfs(root);
    }
}