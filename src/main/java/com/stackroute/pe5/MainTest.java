/* Create a Student class that represents the following information of a student: id, name, and age all
the member variables should be private .
a. Implement `getter and setter` .
b. Create a `StudentSorter` class that implements `Comparator interface` .
c. Write a class `Maintest` create Student class object(minimum 5)
d. Add these student object into a List of type Student .
e. Sort the list based on their age in decreasing order, for student having same
age, sort based on their name.
f. For students having same name and age, sort them according to their ID.*/
package com.stackroute.pe5;

import java.util.*;

class Student {

    private String student_id;
    private int student_age;
    private String student_name;

    public Student(String student_id, String student_name, int student_age) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.student_age = student_age;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public int getStudent_age() {
        return student_age;
    }

    public void setStudent_age(int student_age) {
        this.student_age = student_age;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }
}

class StudentSorter implements Comparator<Student> {
    public int compare(Student a, Student b) {
        if (a.getStudent_age() - b.getStudent_age() != 0) {
            return b.getStudent_age() - a.getStudent_age();
        } else {
            return b.getStudent_name().compareTo(a.getStudent_name());
        }
    }
}

public class MainTest {
    public ArrayList<Student> sortedStudents(ArrayList<Student> students) {
        StudentSorter studentSorter = new StudentSorter();
        Collections.sort(students, studentSorter);
        return students;
    }
}