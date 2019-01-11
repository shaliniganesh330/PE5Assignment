package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MainTestTest {
    MainTest ob;
    @Before
    public void setUp() throws Exception {
        ob = new MainTest();
    }

    @After
    public void tearDown() throws Exception
    {ob = null;
    }

    @Test
    public void mainTestSuccess() {
        Student[] s = new Student[5];
        s[0] = new Student("S01","Asha",21);
        s[1] = new Student("S02","Veena",44);
        s[2] = new Student("S03","Asha",22);
        s[3] = new Student("S04","Deepa",22);
        s[4] = new Student("S05","Divya",11);
        ArrayList<Student> expectedValue = new ArrayList<>();
        expectedValue.add(s[1]);
        expectedValue.add(s[3]);
        expectedValue.add(s[2]);
        expectedValue.add(s[0]);
        expectedValue.add(s[4]);
        ArrayList<Student> inputStudents = new ArrayList<>();
        inputStudents.add(s[0]);
        inputStudents.add(s[1]);
        inputStudents.add(s[2]);
        inputStudents.add(s[3]);
        inputStudents.add(s[4]);

        ArrayList<Student>  actualValue = ob.sortedStudents(inputStudents);
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void mainTestFailure() {
        Student[] s = new Student[6];
        s[0] = new Student("S01","Asha",21);
        s[1] = new Student("S02","Veena",44);
        s[2] = new Student("S03","Asha",22);
        s[3] = new Student("S04","Deepa",22);
        s[4] = new Student("S05","Divya",11);
        ArrayList<Student> expectedValue = new ArrayList<>();
        expectedValue.add(s[1]);
        expectedValue.add(s[2]);
        expectedValue.add(s[3]);
        expectedValue.add(s[0]);
        expectedValue.add(s[4]);
        ArrayList<Student> inputStudents = new ArrayList<>();
        inputStudents.add(s[0]);
        inputStudents.add(s[1]);
        inputStudents.add(s[2]);
        inputStudents.add(s[3]);
        inputStudents.add(s[4]);

        ArrayList<Student>  actualValue = ob.sortedStudents(inputStudents);
        assertNotEquals(expectedValue,actualValue);
    }

}