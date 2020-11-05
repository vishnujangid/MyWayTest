package DSA.LinkedList.Tree;

import javax.management.Query;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by Vishnu.jangid on 04/05/2020 AD .
 */

public class BinaryTree {

    Node root;
    
    public BinaryTree(int data) {
        Node node = new Node(data);
      
    }
    public BinaryTree() {
    }
    
    
    Node insert(Node node, int data) {
        if (node == null)
            return new Node(data);
        if (node.data >= data) {
            node.left = insert(node.left, data);
        } else node.right = insert(node.right, data);
        return node;
    }
    
    
    public void inOrder(Node n){
        if(n == null)
            return;
        
        inOrder(n.left);
        System.out.print(n.data +" ");
        inOrder(n.right);
        
    }
    
    void postOrder(Node n ){
        if(n == null )
            return;
        
        postOrder(n.left);
        postOrder(n.right);
        System.out.print(n.data+" ");
    }
    
    void preOrder(Node n ){
        
        if (n == null)
            return;
    
        System.out.print(n.data+" ");
        preOrder(n.left);
        preOrder(n.right);
    }
    
    void levelOrderTraversal(Node n) {
        if (n == null) return;
        Queue q = new ArrayDeque();
        q.add(n);
        
        while (!q.isEmpty()) {
            Node node = (Node) q.peek();
            System.out.print(node.data + " ");
            if (node.left != null) q.add(node.left);
            if (node.right != null) q.add(node.right);
            q.remove();
        }
    }
    
    void reverseLevelPrint(Node node) {
        if (node == null) return;
        Queue<Node> q = new ArrayDeque<>();
        q.add(node);
        Stack<Node> stack = new Stack<>();
        
        while (!q.isEmpty()) {
            Node n = q.remove();
            if (n.right != null) q.add(n.right);
            if (n.left != null) q.add(n.left);
            stack.push(n);
            
        }
        System.out.println("Reverse Order Level");
        while (!stack.empty()) {
            System.out.print(stack.pop().data);
        }
    }
    
    int size() {
        return size(root);
    }
    
    private int size(Node node) {
        if (node == null) return 0;
        return (size(node.left) + 1 + size(node.right));
    }
    
    public int maxDepth(Node node) {
        if (node == null) return 0;
        int lDepth = maxDepth(node.left);
        int rDepth = maxDepth(node.right);
        
        if (lDepth > rDepth) return lDepth + 1;
        else return rDepth + 1;
    }
    
    
    public int min() {
        Node  node = root;
        
        while (node.left!=null) node= node.left;
        
        return node.data;
    }
    
    public int max() {
        Node  node = root;
        while (node.right!=null) node= node.right;
        return node.data;
    }
    
    public Node mirrorImage(Node node){
        if(node==null)return node;
        Node left = mirrorImage(node.left);
        Node right = mirrorImage(node.right);
        node.left = right;
        node.right = left;
        return node;
    }
    private void printNode(Node root){
        if(root==null)return;
        if(root.left!=null){
            System.out.print(root.left.data + " ");
            printNode(root.left);
        }
        if(root.right!=null){
            printNode(root.right);
        }
    }
    public void print(Node root) {
        if(root !=null) {
            System.out.println(root.data);
            printNode(root);
        }
    }
}