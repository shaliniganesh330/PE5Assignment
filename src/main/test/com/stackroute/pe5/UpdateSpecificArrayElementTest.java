package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class UpdateSpecificArrayElementTest {
    UpdateSpecificArrayElement ob;

    @Before
    public void setUp() throws Exception {
        ob = new UpdateSpecificArrayElement();
    }

    @After
    public void tearDown() throws Exception {
        ob = null;
    }

    @Test
    public void testUpdateSpecificArrayElementTestSuccess() {
        List<String> expectedvalues = new ArrayList<>();
        expectedvalues.add("Kiwi");
        expectedvalues.add("Grape");
        expectedvalues.add("Mango");
        expectedvalues.add("Berry");

        List<String> actualvalues = new ArrayList<>();
        actualvalues.add("Apple");
        actualvalues.add("Grape");
        actualvalues.add("Melon");
        actualvalues.add("Berry");
        assertEquals(expectedvalues, ob.updateArrayElement(actualvalues));
    }

    @Test
    public void testUpdateSpecificArrayElementTestFailure() {
        List<String> expectedvalues = new ArrayList<>();
        expectedvalues.add("Apple");
        expectedvalues.add("Grape");
        expectedvalues.add("Mango");
        expectedvalues.add("Berry");

        List<String> actualvalues = new ArrayList<>();
        actualvalues.add("Apple");
        actualvalues.add("Grape");
        actualvalues.add("Melon");
        actualvalues.add("Berry");
        assertNotEquals(expectedvalues, ob.updateArrayElement(actualvalues));
    }
    @Test
    public void testUpdateSpecificArrayElementsInvalid(){
        List<String> actualvalues = new ArrayList<>();
        actualvalues.add("Apple");
        actualvalues.add("Grape");
        actualvalues.add("Melon");
        actualvalues.add("Berry");
        assertNotNull(ob.updateArrayElement(actualvalues));
    }
}