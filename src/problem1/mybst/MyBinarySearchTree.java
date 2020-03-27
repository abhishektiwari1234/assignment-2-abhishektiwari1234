/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

import problem1.node.TreeNode;

// to implement BinarySearchTree
public class MyBinarySearchTree {
    public TreeNode root;
    int c;

    public void myBinarySearchTree() {
        root = null;
    }

    public void insert(int val) {
        TreeNode newnode = new TreeNode();
        newnode.setData(val);
        if (root == null) {
            root = newnode;
        } else {

        }
    }

}
