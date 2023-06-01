public class Main {
    public static void main(String[] args) {
        MyGraph<Integer> myGraph = new MyGraph<>();
        Vertex<Integer> s1 = new Vertex<>(01);
        Vertex<Integer> s2 = new Vertex<>(02);
        Vertex<Integer> s3 = new Vertex<>(03);
        Vertex<Integer> s4 = new Vertex<>(04);
        myGraph.addEdge(s1, s2, 4d);
        myGraph.addEdge(s1, s3, 2d);
        myGraph.addEdge(s2, s4, 3d);
        myGraph.BFS(s1);
        myGraph.dijkstra(s2);
    }
}