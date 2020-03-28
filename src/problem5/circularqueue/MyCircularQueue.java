/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.circularqueue;
//to implement circular queue

import problem5.node.Node;
import problem5.student.Student;
public class MyCircularQueue {
    Node front;
    Node rear;
    int count;

    public MyCircularQueue() {
        this.front = null;
        this.rear = null;
        this.count = 0;
    }

    public void enqueue(int roll, int backlog, int account) {
        Student s = new Student();
        Node newNode = new Node();
        newNode.setStudent(s);
        if (front == null) {
            front = newNode;
        } else {
            rear.setNext(newNode);
        }
        rear = newNode;
        rear.setNext(front);
        count++;
    }

    public void removeBacklog() {
        while (count > 0) {
            count--;
            Student temp = front.getStudent();
            if ((temp.getBacklog() - temp.getAccount()) > 0) {
                front = front.getNext();
                rear = rear.getNext();
            }
        }
    }

    public void disp() {
        Node temp = front;
        System.out.println();
        while (temp.getNext() != front) {
            System.out.println("Roll no: " + temp.getStudent().getRoll() + "Backlog: " + temp.getStudent().getBacklog() + "Appearing count: " + temp.getStudent().getAccount());
            temp = temp.getNext();
        }
        System.out.println("Rollno:" + temp.getStudent().getRoll() + "Backlog: " + temp.getStudent().getBacklog() + "Appearing Count: " + temp.getStudent().getAccount());
    }
}
