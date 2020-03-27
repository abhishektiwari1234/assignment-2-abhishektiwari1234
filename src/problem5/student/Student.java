/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.student;
// to store student information and properties
public class Student {
    String Name;
    int roll;
    int account;
    int backlog;

    public Student() {
    }

    ;

    public Student(int roll, int backlog, int account) {
        this.roll = roll;
        this.account = account;
        this.backlog = backlog;
    }

    public int getAccount() {
        return account;
    }

    public int getBacklog() {
        return backlog;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
}
