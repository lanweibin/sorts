package graph;

import java.util.HashMap;
import java.util.LinkedList;

public class DFS {
    public static void DFS(HashMap<Character, LinkedList<Character>> graph, HashMap<Character,Boolean> visited){
        visited(graph,visited, 'u');
    }

    private static void visited(HashMap<Character, LinkedList<Character>> graph, HashMap<Character, Boolean> visited, char start) {
        int count = 0;

        if (!visited.containsKey(start)){
            count++;
            System.out.println("The time into element "+start+":"+count);//记录进入该节点的时间
            visited.put(start,true);

            for (char c : graph.get(start)){
                if (!visited.containsKey(c)){
                    visited(graph, visited, c);
                }
            }
            count++;

            System.out.println("The time out element "+start+":"+count);//记录离开该节点的时间
        }

    }
}
