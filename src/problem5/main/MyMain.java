/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.main;
//executable class

import problem5.circularqueue.MyCircularQueue;
public class MyMain {
    public static void main(String[] args) {
        MyCircularQueue obj = new MyCircularQueue();
        obj.enqueue(1, 4, 0);
        obj.enqueue(2, 3, 1);
        obj.enqueue(4, 2, 1);
        obj.enqueue(6, 0, 0);
        obj.removeBacklog();
        obj.disp();
    }
}
