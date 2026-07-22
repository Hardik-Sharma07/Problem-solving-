class G {
    static boolean solve(int[][] g, int[] c, int v, int m) {
        if (v == g.length) return true;
        for (int col = 1; col <= m; col++) {
            boolean ok = true;
            for (int i = 0; i < g.length; i++)
                if (g[v][i] == 1 && c[i] == col) ok = false;
            if (ok) {
                c[v] = col;
                if (solve(g, c, v + 1, m)) return true;
                c[v] = 0;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] g = {{0,1,1},{1,0,1},{1,1,0}};
        int[] c = new int[3];
        solve(g, c, 0, 3);
        for (int x : c) System.out.print(x + " ");
    }
}