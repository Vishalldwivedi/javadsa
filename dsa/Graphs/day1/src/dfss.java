import java.util.Iterator;
import java.util.LinkedList;

public class dfss {
    private int v;
    private LinkedList<Integer> adj[];// adjacenyt list has array  of linked list

    @SuppressWarnings("unchecked") public  dfss(int v){
        this.v = v ;
        adj = new LinkedList[v];
        for(int i =0 ;i< v ;++i){
            adj[i] = new LinkedList<>();
        }
    }
    public void addEdge(int v , int u){
        adj[v].add(u);
    }
       public void dfs(int v, boolean[] visited) {
        visited[v] = true;
        System.out.println(v + " ");
        Iterator<Integer> itr = adj[v].listIterator();
        while (itr.hasNext()) {
            int n = itr.next();
            if (!visited[n]) {
                dfs(n, visited); // Corrected the recursive call to dfs(n, visited)
            }
        }
    }

    public static void main(String[] args) {
        int v = 4;
        dfss oj = new dfss(v);
        boolean[] vis = new boolean[v];
        oj.addEdge(0,1);
        oj.addEdge(0,2);
        oj.addEdge(1,2);
        oj.addEdge(2,0);
        oj.addEdge(3,3);
        oj.addEdge(2,3);
        oj.dfs(1,new boolean[v]);// dfs from vertex 1


    }
}
