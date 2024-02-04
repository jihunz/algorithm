package dfsAndBfs;

class Node4 {
    int val;
    Node4 lt, rt;

    public Node4(int val) {
        this.val = val;
        lt = rt = null;
    }
}

public class Main9 {
    public static int dfs(int level, Node4 root) {
        if (root.lt == null && root.rt == null) return level;
        else return Math.min(dfs(level + 1, root.lt), dfs(level + 1, root.rt));
    }

    public static void main(String[] args) {
        Node4 root = new Node4(1);
        root.lt = new Node4(2);
        root.rt = new Node4(3);
        root.lt.lt = new Node4(4);
        root.lt.rt = new Node4(5);
        System.out.println(dfs(0, root));

    }
}