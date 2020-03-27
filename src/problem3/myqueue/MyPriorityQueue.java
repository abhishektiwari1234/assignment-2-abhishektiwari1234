/*
 *  Created by IntelliJ IDEA.
 *  User:vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;

import problem3.node.Node;
import problem5.student.Student;

public class MyPriorityQueue {
    Node head;

    public MyPriorityQueue() {
        head = null;
    }

    public void insert(String name, int roll) {
        Node newnode = new Node();
        Student obj = new Student();
        obj.setName(name);
        obj.setRoll(roll);
        newNdoe.setobj(obj);
    }

}
