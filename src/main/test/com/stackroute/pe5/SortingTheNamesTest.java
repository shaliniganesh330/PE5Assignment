package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SortingTheNamesTest {
    SortingTheNames ob;
    @Before
    public void setUp() throws Exception {
        ob =new SortingTheNames();
    }

    @After
    public void tearDown() throws Exception
    {
        ob =null;
    }

    @Test
    public void sortingTheNamesSuccess()
    {
        String[] inputstring = {"Harry", "Olive", "Alice", "Bluto", "Eugene"};
        List<String> setinput = new ArrayList<>();
        setinput.add("Alice");
        setinput.add("Bluto");
        setinput.add("Eugene");
        setinput.add("Harry");
        setinput.add("Olive");
        List<String> actual = ob.sortingTheNames(inputstring);
        assertEquals(setinput,actual);
    }
    @Test
    public void sortingTheNamesFailure()
    {
        String[] inputstring = {"Harry", "Olive", "Alice", "Bluto", "Eugene"};
        List<String> setinput = new ArrayList<>();
        setinput.add("Alice");
        setinput.add("Bluto");
        setinput.add("Bluto");
        setinput.add("Harry");
        setinput.add("Olive");
        List<String> actual = ob.sortingTheNames(inputstring);
        assertNotEquals(setinput,actual);
    }

}