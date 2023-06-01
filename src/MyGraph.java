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

}