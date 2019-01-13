package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CheckMapIsStringBooleanTest {
    CheckMapIsStringBoolean stringobject;

    @Before
    public void setUp() throws Exception {
        stringobject = new CheckMapIsStringBoolean();
    }

    @After
    public void tearDown() throws Exception {
        stringobject = null;
    }

    @Test
    public void testMapIsStringBooleanSuccess() {
//        Map<String> expected ={“a” : true,”b” :false ,”c” :true,”d” : false};
        String[] arrayInput = {"a", "b", "c", "d", "a", "c", "c"};
        Map<String, Boolean> expectedvalue = new HashMap<String, Boolean>();
        expectedvalue.put("a", true);
        expectedvalue.put("b", false);
        expectedvalue.put("c", true);
        expectedvalue.put("d", false);
        assertEquals(expectedvalue, stringobject.mapIsStringBoolean(arrayInput));
    }

    @Test
    public void testMapIsStringBooleanFailure() {
        String[] arrayInput = {"a", "b", "c", "d", "a", "c", "c"};
        Map<String, Boolean> expectedvalue = new HashMap<String, Boolean>();
        expectedvalue.put("a", true);
        expectedvalue.put("b", false);
        expectedvalue.put("c", false);
        expectedvalue.put("d", false);
        assertNotEquals(expectedvalue, stringobject.mapIsStringBoolean(arrayInput));
    }
    @Test(expected = NullPointerException.class)
    public void testInvalidCase()
    {
        assertNull(stringobject.mapIsStringBoolean(null));
    }
}