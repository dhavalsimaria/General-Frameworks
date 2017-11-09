/**
 *  Here the connected elements for the start node are placed in listIterator and the then checked one-by-one. The one that is not visited are placed in queue.
 *  Therefore, the directly connected elements of '2', i.e. '0' and '3' are placed in queue first and then during '0' implementation, '1' is placed in queue.
 *  Therefore we get the output: 2 0 3 1.
 */
package com.dhaval.ds.graph;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author Dhaval Simaria
 *
 */
public class BFSreadymade {

    private int V; // No. of vertices
    private LinkedList<Integer> adj[]; // Adjacency Lists

    // Constructor
    BFSreadymade(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    // Function to add an edge into the graph
    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    // prints BFS traversal from a given source s
    void BFS(int s) {
        // Mark all the vertices as not visited(By default
        // set as false)
        boolean visited[] = new boolean[V];

        // Create a queue for BFS
        LinkedList<Integer> queue = new LinkedList<Integer>();

        // Mark the current node as visited and enqueue it
        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0) {
            // Dequeue a vertex from queue and print it
            s = queue.poll();
            System.out.print(s + " ");

            // Get all adjacent vertices of the dequeued vertex s
            // If a adjacent has not been visited, then mark it
            // visited and enqueue it
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                System.out.println("Next n: " + n);
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                    System.out.println("n: " + n + " visited: " + visited);
                }
            }
        }
    }

    // Driver method to
    public static void main(String args[]) {
        BFSreadymade g = new BFSreadymade(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal " + "(starting from vertex 2)");

        g.BFS(2);
    }
}
