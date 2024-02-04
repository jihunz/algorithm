package dfsAndBfs;

import java.util.LinkedList;
import java.util.Queue;

class Node5 {
    int val;
    Node5 lt, rt;

    public Node5(int val) {
        this.val = val;
        lt = rt = null;
    }
}

public class Main10 {
    public static int bfs(Node5 root) {
        Queue<Node5> q = new LinkedList<>();
        q.offer(root);
        int level = 0;

        while (!q.isEmpty()) {
            int len = q.size();
            for (int i = 0; i < len; i++) {
                Node5 curr = q.poll();
                if (curr.lt == null && curr.rt == null) return level;
                if (curr.lt != null) q.offer(curr.lt);
                if (curr.rt != null) q.offer(curr.rt);
            }
            level++;
        }
        return 0;
    }

    public static void main(String[] args) {
        Node5 root = new Node5(1);
        root.lt = new Node5(2);
        root.rt = new Node5(3);
        root.lt.lt = new Node5(4);
        root.lt.rt = new Node5(5);
        System.out.println(bfs(root));

    }
}