package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CheckMapIsStringBooleanTest {
    CheckMapIsStringBoolean ob;
    @Before
    public void setUp() throws Exception
    {
        ob =new CheckMapIsStringBoolean();
    }

    @After
    public void tearDown() throws Exception
    {ob =null; }

    @Test
    public void mapIsStringBooleanSuccess()
    {
//        Map<String> expected ={“a” : true,”b” :false ,”c” :true,”d” : false};
        String[] arrayInput ={"a","b","c","d","a","c","c"};
        Map<String,Boolean> expectedvalue = new HashMap<String, Boolean>();
        expectedvalue.put("a",true);
        expectedvalue.put("b",false);
        expectedvalue.put("c",true);
        expectedvalue.put("d",false);
        assertEquals(expectedvalue,ob.mapIsStringBoolean(arrayInput));
    }
    @Test
    public void mapIsStringBooleanFailure()
    {
        String[] arrayInput ={"a","b","c","d","a","c","c"};
        Map<String,Boolean> expectedvalue = new HashMap<String, Boolean>();
        expectedvalue.put("a",true);
        expectedvalue.put("b",false);
        expectedvalue.put("c",false);
        expectedvalue.put("d",false);
        assertNotEquals(expectedvalue,ob.mapIsStringBoolean(arrayInput));
    }
}