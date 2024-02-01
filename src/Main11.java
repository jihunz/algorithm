import java.util.LinkedList;
import java.util.Queue;

class Node6 {
    int val;
    Node6 lt, rt;

    public Node6(int val) {
        this.val = val;
        lt = rt = null;
    }
}

public class Main11 {
    public static int bfs(Node6 root) {
        Queue<Node6> q = new LinkedList<>();
        q.offer(root);
        int level = 0;

        while (!q.isEmpty()) {
            int len = q.size();
            for (int i = 0; i < len; i++) {
                Node6 curr = q.poll();
                if (curr.lt == null && curr.rt == null) return level;
                if (curr.lt != null) q.offer(curr.lt);
                if (curr.rt != null) q.offer(curr.rt);
            }
            level++;
        }
        return 0;
    }

    public static void main(String[] args) {
        Node6 root = new Node6(1);
        root.lt = new Node6(2);
        root.rt = new Node6(3);
        root.lt.lt = new Node6(4);
        root.lt.rt = new Node6(5);
        System.out.println(bfs(root));

    }
}