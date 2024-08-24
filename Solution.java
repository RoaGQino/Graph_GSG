
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[][] edges1 = {{1, 2}, {2, 3}, {4, 2}};
        int[][] edges2 = {{1, 2}, {5, 1}, {1, 3}, {1, 4}};
        
        System.out.println(findCenter(edges1)); 
        System.out.println(findCenter(edges2)); 
    }

    public static int findCenter(int[][] edges) {
     
        Map<Integer, Integer> degreeCount = new HashMap<>();
    
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            degreeCount.put(u, degreeCount.getOrDefault(u, 0) + 1);
            degreeCount.put(v, degreeCount.getOrDefault(v, 0) + 1);
        }
        
      
        int centerNode = -1;
        for (Map.Entry<Integer, Integer> entry : degreeCount.entrySet()) {
            if (entry.getValue() == edges.length) {
                centerNode = entry.getKey();
                break;
            }
        }
        
        return centerNode;
    }
}
