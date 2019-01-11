package com.PE5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class FindTheNumOfCountTest {
    FindTheNumOfCount ob;
    @Before
    public void setUp() throws Exception {
        ob = new FindTheNumOfCount();
    }

    @After
    public void tearDown() throws Exception
    {ob = null; }

    @Test
    public void toCountWordNumberSuccess()
    {
//        Map actual = ob.toCountWordNumber("one one -one___two,,three,one @three*one?two");
//        String expected = "one":5 , "two":2, "three":2;
        Map<String, Integer>expectedvalue = new HashMap<String, Integer>();
        expectedvalue.put("one",5);
        expectedvalue.put("two",2);
        expectedvalue.put("three",2);
        assertEquals(expectedvalue,ob.toCountWordNumber("one one -one___two,,three,one @three*one?two"));
    }
    @Test
    public void toCountWordNumberFailure()
    {
        Map<String, Integer>expectedvalue = new HashMap<String, Integer>();
        expectedvalue.put("one",5);
        expectedvalue.put("two",2);
        expectedvalue.put("three",3);
        assertNotEquals(expectedvalue,ob.toCountWordNumber("one one -one___two,,three,one @three*one?two"));
    }
}