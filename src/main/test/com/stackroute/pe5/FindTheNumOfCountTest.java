package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class FindTheNumOfCountTest {
    FindTheNumOfCount countobject;

    @Before
    public void setUp() throws Exception {
        countobject = new FindTheNumOfCount();
    }

    @After
    public void tearDown() throws Exception {
        countobject = null;
    }

    @Test
    public void testToCountWordNumberSuccess() {
        Map<String, Integer> expectedvalue = new HashMap<String, Integer>();
        expectedvalue.put("one", 5);
        expectedvalue.put("two", 2);
        expectedvalue.put("three", 2);
        assertEquals(expectedvalue, countobject.toCountWordNumber("one one -one___two,,three,one @three*one?two"));
    }

    @Test
    public void testToCountWordNumberFailure() {
        Map<String, Integer> expectedvalue = new HashMap<String, Integer>();
        expectedvalue.put("one", 5);
        expectedvalue.put("two", 2);
        expectedvalue.put("three", 3);
        assertNotEquals(expectedvalue, countobject.toCountWordNumber("one one -one___two,,three,one @three*one?two"));
    }
  @Test(expected = NullPointerException.class)
    public void testToCountWordNumberInvalid() {
      assertNull(countobject.toCountWordNumber(null));
  }
}