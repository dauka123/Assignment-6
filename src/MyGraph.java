import java.util.*;

public class MyGraph<V> {
    private Map<Vertex, List<Vertex>> list;

    public MyGraph() {
        list = new HashMap<>();
    }

    public void addEdge(Vertex source, Vertex destination, double weight){
        Edge edge = new Edge(source, destination, weight);
        source.addAdjVertex(destination, weight);
        if (!list.containsKey(source)) list.put(source, new ArrayList<>());
    }

    public void addVertex(Vertex vertex) {
        list.put(vertex, new LinkedList<>());
    }

    private void validateVertex(Vertex index) {
        if (!list.containsKey(index)) {
            throw new IllegalArgumentException("Vertex " + index + " is out of the range");
        }
    }

    public void printGraph() {
        for (Map.Entry<Vertex, List<Vertex>> entry : list.entrySet()) {
            Vertex vertex = entry.getKey();
            List<Vertex> neighbors = entry.getValue();
            System.out.print("Vertex " + vertex + " is connected to: ");
            for (Vertex neighbor : neighbors) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
    public void removeEdge(Vertex source, Vertex destination) {
        validateVertex(source);
        validateVertex(destination);
        List<Vertex> neighbors = list.get(source);
        if (neighbors!=null) {
            neighbors.remove(destination);
        }
        list.get(destination).remove(source);
    }
}