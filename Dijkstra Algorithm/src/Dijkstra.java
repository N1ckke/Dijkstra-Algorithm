import java.util.Map;
import java.util.PriorityQueue;
public class Dijkstra {
    public void dijkstra(Node startNode, int n) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        startNode.setDistance(0);
        pq.offer(startNode);

        while (!pq.isEmpty()) {
            Node currentNode = pq.poll();

            for (Map.Entry<Node, Integer> neighborEntry : currentNode.getLink().entrySet()) {
                Node neighbor = neighborEntry.getKey();
                int edgeWeight = neighborEntry.getValue();

                if (currentNode.getDistance() + edgeWeight < neighbor.getDistance()) {
                    neighbor.setDistance(currentNode.getDistance() + edgeWeight);
                    pq.offer(neighbor);

                }
            }
        }
    }
}
