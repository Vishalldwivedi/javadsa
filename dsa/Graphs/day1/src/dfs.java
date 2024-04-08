import java.util.ArrayList;
import java.util.Stack;

class Solution {
    // Function to perform DFS traversal of the graph
    private static void dfs(int vertex, ArrayList<ArrayList<Integer>> adj, boolean[] visited, ArrayList<Integer> result) {
        // Mark the current vertex as visited and add it to the result list
        visited[vertex] = true;
        result.add(vertex);

        // Traverse through all adjacent vertices of the current vertex
        for (int adjVertex : adj.get(vertex)) {
            // If the adjacent vertex is not visited, recursively call dfs on it
            if (!visited[adjVertex]) {
                dfs(adjVertex, adj, visited, result);
            }
        }
    }
    public static  ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V]; // To keep track of visited vertices
        ArrayList<Integer> result = new ArrayList<>(); // To store the DFS traversal result
        Stack<Integer> stack = new Stack<>(); // Stack for iterative DFS

        // Start DFS traversal from vertex 0
        stack.push(0);

        while (!stack.isEmpty()) {
            int currentVertex = stack.pop();

            // If the current vertex is not visited, mark it as visited and add it to the result list
            if (!visited[currentVertex]) {
                visited[currentVertex] = true;
                result.add(currentVertex);

                // Push all adjacent vertices of the current vertex onto the stack
                for (int adjVertex : adj.get(currentVertex)) {
                    if (!visited[adjVertex]) {
                        stack.push(adjVertex);
                    }
                }
            }
        }

        return result;
    }

    // Main method to demonstrate DFS traversal of the graph
    public static void main(String[] args) {
        sol solution = new sol();

        // Example 1
        int V1 = 5;
        ArrayList<ArrayList<Integer>> adj1 = new ArrayList<>();
        adj1.add(new ArrayList<Integer>() {
            {
                add(2); add(3); add(1);
            }
        });
        adj1.add(new ArrayList<Integer>() {{ add(0); }});
        adj1.add(new ArrayList<Integer>() {{ add(0); add(4); }});
        adj1.add(new ArrayList<Integer>() {{ add(0); }});
        adj1.add(new ArrayList<Integer>() {{ add(2); }});
        System.out.println("DFS traversal for Example 1: " + solution.dfsOfGraph(V1, adj1));

        // Example 2
        int V2 = 4;
        ArrayList<ArrayList<Integer>> adj2 = new ArrayList<>();
        adj2.add(new ArrayList<Integer>() {{ add(1); add(3); }});
        adj2.add(new ArrayList<Integer>() {{ add(2); add(0); }});
        adj2.add(new ArrayList<Integer>() {{ add(1); }});
        adj2.add(new ArrayList<Integer>() {{ add(0); }});
        System.out.println("DFS traversal for Example 2: " + solution.dfsOfGraph(V2, adj2));
    }
}
