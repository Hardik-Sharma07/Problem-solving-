import java.io.*;
import java.util.*;

public class codeforces {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {

            int n = Integer.parseInt(br.readLine());
            char[][] s = new char[n][n];

            for (int i = 0; i < n; i++)
                s[i] = br.readLine().toCharArray();

            int[] cnt = new int[n];

            for (int i = 0; i < n; i++) {
                int c = 0;
                for (int j = 0; j < n; j++)
                    if (s[i][j] == '1')
                        c++;
                cnt[i] = c;
            }

            Integer[] nodes = new Integer[n];
            for (int i = 0; i < n; i++) nodes[i] = i;

            Arrays.sort(nodes, (a, b) -> cnt[b] - cnt[a]);

            List<int[]> edges = new ArrayList<>();

            boolean ok = true;

            for (int i = 1; i < n; i++) {

                boolean found = false;

                for (int j = 0; j < i; j++) {

                    int u = nodes[j];
                    int v = nodes[i];

                    if (s[u][v] == '1' && cnt[u] == cnt[v] + 1) {
                        edges.add(new int[]{u + 1, v + 1});
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    ok = false;
                    break;
                }
            }

            if (!ok || edges.size() != n - 1) {
                System.out.println("No");
                continue;
            }

            System.out.println("Yes");

            for (int[] e : edges)
                System.out.println(e[0] + " " + e[1]);
        }
    }
}