public class Main {
    public static void main(String[] args) {
        Node[] nodes = new Node[5];
        Dijkstra algorithm = new Dijkstra();

        for (int i = 0; i < 5; i++) {
            nodes[i] = new Node(i);
        }

        nodes[0].addLink(nodes[1], 2);
        nodes[0].addLink(nodes[3], 6);
        nodes[1].addLink(nodes[0], 2);
        nodes[1].addLink(nodes[2], 3);
        nodes[1].addLink(nodes[3], 8);
        nodes[1].addLink(nodes[4], 5);
        nodes[2].addLink(nodes[1], 3);
        nodes[2].addLink(nodes[4], 7);
        nodes[3].addLink(nodes[0], 6);
        nodes[3].addLink(nodes[1], 8);
        nodes[3].addLink(nodes[4], 9);
        nodes[4].addLink(nodes[1], 5);
        nodes[4].addLink(nodes[2], 7);
        nodes[4].addLink(nodes[3], 9);

        algorithm.dijkstra(nodes[0], 5);

        for(int i = 0; i < 5; i++)
            System.out.println(nodes[i].getPath());
    }
}