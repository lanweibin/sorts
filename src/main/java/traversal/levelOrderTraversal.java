package traversal;

import java.util.LinkedList;



public class levelOrderTraversal {

    public Node init() {//注意必须逆序建立，先建立子节点，再逆序往上建立，因为非叶子结点会使用到下面的节点，而初始化是按顺序初始化的，不逆序建立会报错
        Node J = new Node(8, null, null);
        Node H = new Node(4, null, null);
        Node G = new Node(2, null, null);
        Node F = new Node(7, null, J);
        Node E = new Node(5, H, null);
        Node D = new Node(1, null, G);
        Node C = new Node(9, F, null);
        Node B = new Node(3, D, E);
        Node A = new Node(6, B, C);
        return A;   //返回根节点
    }

    public static void levelOrder(Node root){
        if(root == null){
            return;
        }

        LinkedList<Node> queue = new LinkedList<Node>();
        Node current = null;
        queue.add(root); //指定元素添加到此列表的末尾
        while (!queue.isEmpty()){
            current = queue.poll();//移除并返问队列头部的元素
            System.out.println(current.val);
            if (current.getLeftNode() != null){
                queue.add(current.getLeftNode());
            }
            if (current.getRightNode() != null){
                queue.add(current.getRightNode());
            }
        }
    }

    public static void main(String[] args) {
        levelOrder(Node);
    }
}
