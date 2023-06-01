# Assignment-6
### MyGraph
+ ### addEdge
**description:** This method adds an edge between the source and destination vertices with the given weight.
```ruby
public void addEdge(Vertex source, Vertex destination, double weight){
        Edge edge = new Edge(source, destination, weight);
        source.addAdjVertex(destination, weight);
        if (!list.containsKey(source)) list.put(source, new ArrayList<>());
    }
```
+ ### BFS
**description:** Performs Breadth-First Search (BFS) starting from a given vertex.
```ruby
public void BFS(Vertex start){
        Set<Vertex> visited = new HashSet<>();
        Queue<Vertex> queue = new LinkedList<>();

        visited.add(start);
        queue.add(start);

        while (!queue.isEmpty()) {
            Vertex currentVertex = queue.poll();
            System.out.print(currentVertex + " ");
            Set<Vertex<V>> neighbors = currentVertex.getAdjVertices().keySet();
            for (Vertex<V> neighbor : neighbors) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
    }
```
+ ### dijkstra
**description:** This method performs Dijkstra's algorithm starting from the start vertex. It calculates the shortest path distances from the start vertex to all other vertices in the graph.
```ruby
public Map<Vertex, Double> dijkstra(Vertex start) {
        Map<Vertex, Double> distances = new HashMap<>();
        for (Vertex node : list.keySet()) {
            distances.put(node, Double.MAX_VALUE);
        }
        distances.put(start, 0d);

        PriorityQueue<Vertex> queue = new PriorityQueue<>(Comparator.comparingDouble(distances::get));
        queue.add(start);

        while (!queue.isEmpty()) {
            Vertex currentVertex = queue.poll();
            for (Edge neighbor : list.get(currentVertex)) {
                double distance = distances.get(currentVertex) + neighbor.getWeight();
                if (distance < distances.get(currentVertex)) {
                    distances.put(currentVertex, distance);
                    queue.add((Vertex) neighbor.getDest());
                }
            }
        }
        return distances;
    }
```
