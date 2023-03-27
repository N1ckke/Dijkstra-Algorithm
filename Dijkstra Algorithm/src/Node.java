import java.util.HashMap;
import java.util.Map;
public class Node implements Comparable<Node> {
    private final int id;
    private int distance;
    public Map<Node, Integer> link;
    public Node(int id) {
        this.id = id;
        this.distance = Integer.MAX_VALUE;
        this.link = new HashMap<>();
    }
    public void addLink(Node neighbor, int weight) {
        link.put(neighbor, weight);
    }
    public int compareTo(Node other) {
        return Integer.compare(distance, other.distance);
    }
    public int getDistance() {
        return distance;
    }
    public void setDistance(int distance) {
        this.distance = distance;
    }
    public int getId() {
        return id;
    }
}