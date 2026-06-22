class Solution {
    public int minCostConnectPoints(int[][] points) {
        Queue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        boolean[] visited = new boolean[points.length];
        pq.offer(new int[] { 0, 0 });

        int sum = 0;
        int count = points.length; 

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int cost = curr[0];
            int point = curr[1];
            if (visited[point])
                continue;
            visited[point] = true;
            sum += cost;
            count--;
            if (count == 0)
                return sum;
            for (int i = 0; i < points.length; i++) {
                if (!visited[i]) {
                    int xVal = Math.abs(points[point][0] - points[i][0]);
                    int yVal = Math.abs(points[point][1] - points[i][1]);
                    int xCost = xVal + yVal;
                    pq.offer(new int[] { xCost, i });
                }
            }
        }

        return sum;
    }
}