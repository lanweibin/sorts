//package traversal;
//
//public class BinaryTree {
//
//    public void printNode(Node node){
//        System.out.print(node.getData());
//    }
//
//    //先序
//    public void preOrder(Node root){
//        printNode(root);
//        if (root.getLeftNode()!=null){
//            preOrder(root.getLeftNode());
//        }
//        if(root.getRightNode() != null){
//            preOrder(root.getRightNode());
//        }
//    }
//
//    //中序
//    public void inOrder(Node root){
//        if (root.getLeftNode()!=null){
//            inOrder(root.getLeftNode());
//        }
//        printNode(root);
//        if (root.getRightNode()!=null){
//            inOrder(root.getRightNode());
//        }
//    }
//
//    //后序
//    public void postOrder(Node root){
//        if (root.getLeftNode()!=null){
//            postOrder(root.getLeftNode());
//        }
//        if (root.getRightNode()!=null){
//            postOrder(root.getRightNode());
//        }
//        printNode(root);
//    }
//
//    public void levelOrder(Node root){
//        if (root == null){
//            return;
//        }
//        int depth = depth(root);
//
//    }
//
//
//}
