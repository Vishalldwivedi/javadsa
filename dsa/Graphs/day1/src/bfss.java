import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class bfss {
    private int v;
    private LinkedList<Integer> adj[];// adjacenyt list has array  of linked list

    @SuppressWarnings("unchecked")
    public bfss(int v) {
        this.v = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int v, int u) {
        adj[v].add(u);
    }

    public void bfs(int s) {
        boolean[] visited = new boolean[v]; // Initialize the array with false
        Queue<Integer> q = new LinkedList<>();
        visited[s] = true;
        q.add(s);
        while (!q.isEmpty()) {
            s = q.poll();
            System.out.println(s + " ");
            Iterator<Integer> itr = adj[s].listIterator();
            while (itr.hasNext()) {
                int n = itr.next();
                if (!visited[n]) {
                    visited[n] = true;
                    q.add(n);
                }
            }
        }
    }

    public static void main(String[] args) {
        int v = 4;
        bfss oj = new bfss(v);

        oj.addEdge(0, 1);
        oj.addEdge(0, 2);
        oj.addEdge(1, 2);
        oj.addEdge(2, 0);
        oj.addEdge(3, 3);
        oj.addEdge(2, 3);
        oj.bfs(1); // BFS from vertex 1
        oj.bfs(3); // BFS from vertex 3
    }
}