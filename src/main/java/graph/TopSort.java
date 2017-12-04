package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


//拓扑排序
public class TopSort {
    static class Vertex{
        private String name;
        private List<Vertex> children = new ArrayList<Vertex>();
        private int topNum;
        private int indegree;

        public Vertex(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<Vertex> getChildren() {
            return children;
        }

        public void setChildren(List<Vertex> children) {
            this.children = children;
        }

        public int getTopNum() {
            return topNum;
        }

        public void setTopNum(int topNum) {
            this.topNum = topNum;
        }

        public int getIndegree() {
            return indegree;
        }

        public void setIndegree(int indegree) {
            this.indegree = indegree;
        }
    }

    public static void main(String[] args) {
        Vertex v1=new Vertex("v1");
        Vertex v2=new Vertex("v2");
        Vertex v3=new Vertex("v3");
        Vertex v4=new Vertex("v4");
        Vertex v5=new Vertex("v5");
        Vertex v6=new Vertex("v6");
        Vertex v7=new Vertex("v7");
        v1.children.add(v2);
        v1.children.add(v3);
        v1.children.add(v4);
        v1.indegree=0;
        v2.children.add(v4);
        v2.children.add(v5);
        v2.indegree=1;
        v3.children.add(v6);
        v3.indegree=2;
        v4.children.add(v3);
        v4.children.add(v6);
        v4.children.add(v7);
        v4.indegree=3;
        v5.children.add(v4);
        v5.children.add(v7);
        v5.indegree=1;
        v6.indegree=3;
        v7.children.add(v6);
        v7.indegree=2;
        List<Vertex> vs=new ArrayList<Vertex>();
        vs.add(v1);
        vs.add(v2);
        vs.add(v3);
        vs.add(v4);
        vs.add(v5);
        vs.add(v6);
        vs.add(v7);
        topsort(vs);
    }

    private static void topsort(List<Vertex> vs) {

        Queue<Vertex> queue = new LinkedList<Vertex>();
        int count = 0;
        for(Vertex v : vs){
            if (v.indegree == 0){
                queue.add(v);
            }
        }

        while (!queue.isEmpty()){
            Vertex v = queue.poll();
            v.topNum = ++count;
            System.out.println(v.getName()+" "+v.getTopNum());

            for(Vertex w : v.getChildren()){
                if (--w.indegree == 0){
                    queue.add(w);
                }
            }
        }

        if (count != vs.size()){
            System.out.println("图有圈");
        }
    }

}
