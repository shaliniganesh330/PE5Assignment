package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ReplaceTheMapValuesTest {
    ReplaceTheMapValues mapValuesob;

    @Before
    public void setUp() throws Exception {
        mapValuesob = new ReplaceTheMapValues();
    }

    @After
    public void tearDown() throws Exception {
        mapValuesob = null;
    }

    @Test
    public void testReplaceTheValueSuccess() {
        Map<String, String> value1 = new HashMap<>();
        value1.put("val1", "java");
        value1.put("val2", "c++");
        Map<String, String> expectedvalue = new HashMap<>();
        expectedvalue.put("val1", " ");
        expectedvalue.put("val2", "java");
        assertEquals(expectedvalue, mapValuesob.replaceTheValue(value1));
    }

    @Test
    public void testReplaceTheValueFailure() {
        Map<String, String> value1 = new HashMap<>();
        value1.put("val1", "java");
        value1.put("val2", "c++");
        Map<String, String> expectedvalue = new HashMap<>();
        expectedvalue.put("val1", " ");
        expectedvalue.put("val2", "");
        assertNotEquals(expectedvalue, mapValuesob.replaceTheValue(value1));
    }
    @Test(expected = NullPointerException.class)
    public void invalidTest(){
        assertNull(mapValuesob.replaceTheValue(null));
    }
}