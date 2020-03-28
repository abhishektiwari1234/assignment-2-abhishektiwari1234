/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */
package problem4.main;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree

import problem1.mybst.MyBinarySearchTree;
import problem4.myqueue.MyQueue;
public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree obj = new MyBinarySearchTree();
        obj.insert(10);
        obj.insert(12);
        obj.insert(8);
        obj.insert(9);
        obj.insert(17);
        obj.insert(7);
        obj.insert(19);
        MyQueue obj1 = new MyQueue();
        obj1.preOrderSucc(obj.root);
        System.out.print("Pre Order successor of all the nodes are: ");
        obj1.disPreOrderSucc();
    }
}
