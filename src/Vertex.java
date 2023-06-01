import java.util.HashMap;
import java.util.Map;
public class Vertex<V> {
    private V data;
    private Map<Vertex<V>, Double> adjVertices;

    public void addAdjVertex(Vertex<V> dest, double weight) {
        adjVertices.put(dest, weight);
    }

    public Map<Vertex<V>, Double> getAdjVertices() {
        return adjVertices;
    }

    public V getData() {
        return data;
    }

    public Vertex(V data) {
        this.data = data;
        this.adjVertices = new HashMap<>();
    }

    @Override
    public String toString() {
        return "Vertex " + this.data;
    }
}