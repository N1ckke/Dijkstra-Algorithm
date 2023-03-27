import java.util.Map;
import java.util.PriorityQueue;
public class Dijkstra {
    public void dijkstra(Node startNode, int n) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        startNode.setDistance(0);
        pq.offer(startNode);

        while (!pq.isEmpty()) {
            Node currentNode = pq.poll();

            for (Map.Entry<Node, Integer> neighborEntry : currentNode.link.entrySet()) {
                Node neighbor = neighborEntry.getKey();
                int edgeWeight = neighborEntry.getValue();

                if (currentNode.getDistance() + edgeWeight < neighbor.getDistance()) {
                    neighbor.setDistance(currentNode.getDistance() + edgeWeight);
                    pq.offer(neighbor);

                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Distanza minima dal nodo " + startNode.getId() + " al nodo " + i + " : " + startNode.link.get(i));        //TODO: da sistemare la stampa della distanza dato che mi da la distanza dello startNode come giusto che sia da codice scritto
        }
    }
}
