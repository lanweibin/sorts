package graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void bfs(HashMap<Character, LinkedList<Character>> graph, HashMap<Character,Integer> dist, char star ){
        Queue<Character> q = new LinkedList<Character>();
        q.add(star);
        dist.put(star,0);
        int i = 0;

        while (!q.isEmpty()){
            char top = q.poll();// pool()方法取出并删除队头的元素,当队列为空,返回null;
            i++;

            int d = dist.get(top) + 1;//得出其周边还未被访问的节点的距离

            for (Character c : graph.get(top)){//??????????????????
                if (!dist.containsKey(c)){///如果dist中还没有该元素说明还没有被访问
                    dist.put(c,d);
                    q.add(c);
                }
            }
        }
    }
}
