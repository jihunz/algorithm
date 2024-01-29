public class Main6 {
    static int n;
    static int[] chk;

    public static void dfs(int x) {
        if (x == n + 1) {
            String tmp = "";
            for (int i = 1; i <= n; i++) {
                if (chk[i] == 1) {
                    tmp += (i + " ");
                }
            }
            if (tmp.length() > 0) System.out.println(tmp);
        } else {
            chk[x] = 1;
            dfs(x + 1);
            chk[x] = 0;
            dfs(x + 1);
        }
    }

    public static void main(String[] args) {
        n = 3;
        chk = new int[n + 1];
        dfs(1);
    }
}