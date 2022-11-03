public class Graph {

    // inner class
    // to keep track of edges
    class Edge {
        String src, dest;
    }

    // number of vertices and edges
    int vertices, edges;

    // array to store all edges
    Edge[] edge;

    Graph(int vertices, int edges) {
        this.vertices = vertices;
        this.edges = edges;

        // initialize the edge array
        edge = new Edge[edges];
        for (int i = 0; i < edges; i++) {

            // each element of the edge array
            // is an object of Edge type
            edge[i] = new Edge();
        }
    }

    public static void main(String[] args) {

        // create an object of Graph class
        int noVertices = 11;
        int noEdges = 11;
        Graph myGraph = new Graph(noVertices, noEdges);

        // create graph

        // Edge 1
        myGraph.edge[0].src = "Kean";
        myGraph.edge[0].dest = "Simon";

        // Edge 2
        myGraph.edge[1].src = "Kean";
        myGraph.edge[1].dest = "Emman";

        // Edge 3
        myGraph.edge[2].src = "Kean";
        myGraph.edge[2].dest = "Kim";

        // Edge 4
        myGraph.edge[3].src = "Kean";
        myGraph.edge[3].dest = "Mcbryyle";

        // Edge 5
        myGraph.edge[4].src = "Kean";
        myGraph.edge[4].dest = "Macko";

        // Edge 6
        myGraph.edge[5].src = "Kean";
        myGraph.edge[5].dest = "Sarah";

        // Edge 7
        myGraph.edge[6].src = "Sarah";
        myGraph.edge[6].dest = "Jam";

        // Edge 8
        myGraph.edge[7].src = "Kean";
        myGraph.edge[7].dest = "Kristian";

        
        // Edge 9
        myGraph.edge[8].src = "Kristian";
        myGraph.edge[8].dest = "Gaw";

         // Edge 10
         myGraph.edge[9].src = "Kristian";
         myGraph.edge[9].dest = "Jhap";

         
         // Edge 11
         myGraph.edge[10].src = "Gaw";
         myGraph.edge[10].dest = "Jhap";

         


        // print graph
        for (int i = 0; i < noEdges; i++) {
            System.out.println(myGraph.edge[i].src + " - " + myGraph.edge[i].dest);
        }

    }
}
