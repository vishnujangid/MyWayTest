package DSA.LinkedList.Tree;

import java.util.LinkedList;

/**
 * Created by Vishnu.jangid on 04/05/2020 AD .
 */

public class Runner {
    public static void main(String[] args) {
        BinaryTree b = new BinaryTree();
        
       
//        b.root = new Node(1);
//        b.root.left = new Node(2);
//        b.root.right = new Node(3);
//        b.root.left.left = new Node(4);
//        b.root.left.right = new Node(5);
        
        b.root= b.insert(b.root, 10);
        b.insert(b.root, 5);
        b.insert(b.root, 3);
        b.insert(b.root, 8);
        b.insert(b.root, 12);
        b.insert(b.root, 11);
        b.insert(b.root, 16);
        System.out.println(b.maxDepth(b.root));
//        b.preOrder(b.root);
//        System.out.println();
//        b.inOrder(b.root);
//        System.out.println();
//
//        b.postOrder(b.root);
//        System.out.println(); System.out.println();
//        b.levelOrderTraversal(b.root);
//
//        System.out.println("min : "+b.min());
//        System.out.println("max : "+b.max());
//        b.levelOrderTraversal(b.root);
//        System.out.println("size : "+b.size());
//
////        b.root =b.mirrorImage(b.root);
//        System.out.println("Mirror ");
////        b.levelOrderTraversal(b.root);
//        b.reverseLevelPrint(b.root);
    
      
        
    }
}
